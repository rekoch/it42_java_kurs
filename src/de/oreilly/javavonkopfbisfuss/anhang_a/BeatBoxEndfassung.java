package de.oreilly.javavonkopfbisfuss.anhang_a;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.event.*;

public class BeatBoxEndfassung {
	
	JFrame derFrame;
	JPanel hauptPanel;
	JList eingangsListe;
	JTextField benutzerNachricht;
	ArrayList<JCheckBox> checkboxListe;
	int nummerierung;
	Vector<String> listenVector = new Vector<String>();
	String benutzerName;
	ObjectOutputStream out;
	ObjectInputStream in;
	
	HashMap<String, boolean[]> andereSeqsMap = new HashMap<String, boolean[]>();
	
	
	Sequencer sequencer;
	Sequence sequence;
	Sequence meineSequence = null;
	
	Track track;
	
	String[] instrumentNamen = {"Bassdrum", "Hi-Hat, geschlossen", "Hi-Hat, offen",
	"Snaredrum", "Crashbecken", "Händeklatschen", "Hohes Tom-Tom", "Hohes Bongo",
	"Maracas", "Trillerpfeife", "Tiefe Conga", "Kuhglocke", "Vibraslap", 
	"Tieferes Tom-Tom", "Hohes Agogo", "Hohe Conga, offen"};
	int[] instrumente = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
		
	public static void main (String[] args) {
		new BeatBoxEndfassung().inBetriebNehmen(args[0]);  // args[0] ist Ihr Benutzername
	}
	
	public void inBetriebNehmen(String name) {
		benutzerName = name;
		// Verbindung zum Server herstellen
		try {
			Socket sock = new Socket("127.0.0.1", 4242);
			out = new ObjectOutputStream(sock.getOutputStream());
			in = new ObjectInputStream(sock.getInputStream());
			Thread remote = new Thread(new RemoteReader());
			remote.start();
		} catch(Exception ex) {
			
			System.out.println("Keine Verbindung möglich - Sie müssen allein spielen.");
		}
		
		midiEinrichten();
		guiErstellen();
	}  //  inBetriebNehmen schliessen
	
	public void guiErstellen() {
		
		derFrame = new JFrame("Cyber-BeatBox");
		BorderLayout layout = new BorderLayout();
		JPanel hintergrund = new JPanel(layout);
		hintergrund.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		checkboxListe = new ArrayList<JCheckBox>();
		
		Box buttonBox = new Box(BoxLayout.Y_AXIS);
		JButton start = new JButton("Starten");
		start.addActionListener(new MeinStartListener());
		buttonBox.add(start);
		
		
		JButton stopp = new JButton("Stoppen");
		stopp.addActionListener(new MeinStoppListener());
		buttonBox.add(stopp);
		
		JButton schneller = new JButton("Schneller");
		schneller.addActionListener(new MeinSchnellerListener());
		buttonBox.add(schneller);
		
		JButton langsamer = new JButton("Langsamer");
		langsamer.addActionListener(new MeinLangsamerListener());
		buttonBox.add(langsamer);
		
		JButton senden = new JButton("Senden");
		senden.addActionListener(new MeinSendenListener());
		buttonBox.add(senden);
		
		benutzerNachricht = new JTextField();
		buttonBox.add(benutzerNachricht);
		
		eingangsListe = new JList();
		
		eingangsListe.addListSelectionListener(new MeinListSelectionListener());
		eingangsListe.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane dieListe = new JScrollPane(eingangsListe);
		buttonBox.add(dieListe);
		
		eingangsListe.setListData(listenVector);
		
		
		Box namensBox = new Box(BoxLayout.Y_AXIS);
		for (int i = 0; i < 16; i++) {
			namensBox.add(new Label(instrumentNamen[i]));
		}
		
		hintergrund.add(BorderLayout.EAST, buttonBox);
		hintergrund.add(BorderLayout.WEST, namensBox);
		
		derFrame.getContentPane().add(hintergrund);
		
		GridLayout raster = new GridLayout(16,16);
		raster.setVgap(1);
		raster.setHgap(2);
		hauptPanel = new JPanel(raster);
		hintergrund.add(BorderLayout.CENTER, hauptPanel);
		
		
		for (int i = 0; i < 256; i++) {                    
			JCheckBox c = new JCheckBox();
			
			c.setSelected(false);
			checkboxListe.add(c);
			hauptPanel.add(c);            
		} // Ende der Schleife
		
		derFrame.setBounds(50,50,300,300);
		derFrame.pack();
		derFrame.setVisible(true);
	} // Methode schliessen
	
	
	public void midiEinrichten() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			//     sequencer.addMetaEventListener(this);   
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(120);
			
		} catch(Exception e) {e.printStackTrace();}
	} // Methode schliessen
	
	
	
	public void trackErstellenUndStarten() {
		ArrayList<Integer> trackListe = null; // diese Liste enthält die Instrumente
		// für jede vertikale Spalte - mit anderen Worten, für jeden "Tick" (bei dem
		// mehrere Instrumente spielen können)
		
		sequence.deleteTrack(track);
		track = sequence.createTrack();
		
		// jetzt in einer Schleife hindurchgehen und dort, wo ein Häkchen steht,
		// ein on- und ein off-Event erzeugen
		
		for (int i = 0; i < 16; i++) {
			trackListe = new ArrayList<Integer>();
			
			for (int j = 0; j < 16; j++) {
				JCheckBox jc = checkboxListe.get(j + (16*i));
				if (jc.isSelected()) { 
					int taste = instrumente[i];  
					trackListe.add(new Integer(taste));
				} else {
					trackListe.add(null);  // weil dieses Fach im Track leer sein soll
				} 
				
			} // Ende innere Schleife
			
			tracksErzeugen(trackListe);
		} // Ende äussere Schleife
		
		track.add(eventErzeugen(192,9,1,0,16)); // damit wir immer alle 16 Schläge
												// komplett durchgehen
		
		try {
			
			sequencer.setSequence(sequence); 
			sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);                   
			sequencer.start();
			sequencer.setTempoInBPM(120);
		} catch(Exception e) {e.printStackTrace();}
		
	} // Methode schliessen
	
	
	public class MeinStartListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			
			trackErstellenUndStarten();
		}
	}
	
	public class MeinStoppListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			sequencer.stop();
		}
	}
	
	public class MeinSchnellerListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			float tempoFactor = sequencer.getTempoFactor();
			sequencer.setTempoFactor((float)(tempoFactor * 1.03));
		}          
	}
	
	public class MeinLangsamerListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			float tempoFactor = sequencer.getTempoFactor();
			sequencer.setTempoFactor((float)(tempoFactor * .97));
		}
	}
	
	public class MeinSendenListener implements ActionListener {
		
		public void actionPerformed(ActionEvent a) {
			// eine ArrayList nur für den Zustand der Checkboxen erzeugen
			boolean[] checkboxZustand = new boolean[256];
			
			for (int i = 0; i < 256; i++) {
				JCheckBox check = (JCheckBox) checkboxListe.get(i);
				if (check.isSelected()) {
					checkboxZustand[i] = true;
				}
			} // Ende for-Schleife
			
			// String messageToSend = null;         
			
			try {
				out.writeObject(benutzerName + nummerierung++ 
								+ ": " + benutzerNachricht.getText());
				out.writeObject(checkboxZustand);
			} catch(Exception ex) {
				System.out.println("Tut mir Leid, Senden an Server nicht möglich.");
			}
			benutzerNachricht.setText("");         
			
		} // Methode schliessen
	} // innere Klasse schliessen
	
	
	public class MeinListSelectionListener implements ListSelectionListener {
		
		public void valueChanged(ListSelectionEvent le) {
			if (!le.getValueIsAdjusting()) {
				String wahl = (String) eingangsListe.getSelectedValue();  
				if (wahl != null) {    
					
					// auf die Map zugreifen und andere Sequence holen
					boolean[] wahlZustand = (boolean[]) andereSeqsMap.get(wahl);
					
					sequenceWechseln(wahlZustand);                                     
					
					sequencer.stop(); 
					trackErstellenUndStarten();
				}
			}
		} // Methode schliessen
	} // innere Klasse schliessen
	
	
	public class RemoteReader implements Runnable {
		boolean[] checkboxZustand = null;
		// String anzuzeigenderName = null;
		Object obj = null;
		public void run() {
			try {
				while((obj=in.readObject()) != null) {
					System.out.println("Object vom Server erhalten");
					System.out.println(obj.getClass());
					
					String anzuzeigenderName = (String) obj;
					checkboxZustand = (boolean[]) in.readObject();
					andereSeqsMap.put(anzuzeigenderName, checkboxZustand);
					
					listenVector.add(anzuzeigenderName);	
					eingangsListe.setListData(listenVector);
				} // Ende while-Schleife 
			} catch(Exception ex) {ex.printStackTrace();}  
			
		} // run schliessen
	} // innere Klasse schliessen
	
	
//	public class MyPlayMineListener implements ActionListener {
//		public void actionPerformed(ActionEvent a) {
//			if (meineSequence != null) {
//				sequence = meineSequence;  // restore to my original
//			}
//		}
//	}  
	
	public void sequenceWechseln(boolean[] checkboxZustand) {
		
		for (int i = 0; i < 256; i++) {
			JCheckBox check = (JCheckBox) checkboxListe.get(i);
			if (checkboxZustand[i]) {
				check.setSelected(true);
			} else {
				check.setSelected(false);
			}
		} // Ende for-Schleife  
	} // Methode schliessen
	
	
	public void tracksErzeugen(ArrayList liste) {
		
		Iterator it = liste.iterator();
			
		for (int i = 0; i < 16; i++) {
			Integer num = (Integer) it.next();
			if (num != null) {
				// "Taste" für das gerade spielende Percussioninstrument
				int numTaste = num.intValue();            
				
				track.add(eventErzeugen(144,9,numTaste,100, i));
				track.add(eventErzeugen(128,9,numTaste,100, i + 1));
			}
		}
	}
	
	public MidiEvent eventErzeugen(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
			
		}catch(Exception e) { }
		return event;
	}

} // Klasse schliessen

        
             
          
          
          