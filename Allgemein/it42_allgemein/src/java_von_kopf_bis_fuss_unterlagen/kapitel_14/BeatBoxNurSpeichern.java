package kapitel_14;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;


public class BeatBoxNurSpeichern {  
	
	JPanel hauptPanel;
	ArrayList<JCheckBox> checkboxListe;
	Sequencer sequencer;
	Sequence sequence;
	Sequence meineSequence = null;
	Track track;
	JFrame derFrame;
	
	String[] instrumentNamen = {"Bassdrum", "Hi-Hat, geschlossen", "Hi-Hat, offen",
			"Snaredrum", "Crashbecken", "Händeklatschen", "Hohes Tom-Tom", "Hohes Bongo", 
			"Maracas", "Trillerpfeife", "Tiefe Conga", "Kuhglocke", "Vibraslap", 
			"Tieferes Tom-Tom", "Hohes Agogo", "Hohe Conga, offen"};
	int[] instrument = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
	
	
	public static void main (String[] args) {
		new BeatBoxNurSpeichern().guiErstellen();
	}
	
	public void guiErstellen() {
		derFrame = new JFrame("Cyber-BeatBox");
		derFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JButton speichern = new JButton("Serialisieren");  // neuer Button
		speichern.addActionListener(new MeinSendenListener());
		buttonBox.add(speichern);
		
		JButton wiederherstellen = new JButton("Wiederherstellen");     // neuer Button
		wiederherstellen.addActionListener(new MeinEinlesenListener());
		buttonBox.add(wiederherstellen);
		
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
		
		midiEinrichten();
		
		derFrame.setBounds(50,50,300,300);
		derFrame.pack();
		derFrame.setVisible(true);
	} // Methode schließen
	
	
	public void midiEinrichten() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(120);
			
		} catch(Exception e) {e.printStackTrace();}
	} // Methode schließen
	
	
	public void trackErstellenUndStarten() {
		// diese Liste enthält die Instrumente für jede vertikale Spalte - 
		// mit anderen Worten, für jeden "Tick" (bei dem mehrere Instrumente 
		// spielen können)
		int[] trackListe = null;
		
		sequence.deleteTrack(track);
		track = sequence.createTrack();
		
		// jetzt in einer Schleife hindurchgehen und dort, wo ein Häkchen steht, 
		// ein on- und ein off-Event erzeugen
		
		for (int i = 0; i < 16; i++) {
			trackListe = new int[16];
			
			int taste = instrument[i];
			
			for (int j = 0; j < 16; j++ ) {         
				JCheckBox jc = checkboxListe.get(j + (16*i));
				
				if ( jc.isSelected()) {
					trackListe[j] = taste;
				} else {
					trackListe[j] = 0;
				}       
			} // // Ende innere Schleife
			
			tracksErzeugen(trackListe);
		} // // Ende äußere Schleife
		
		track.add(eventErzeugen(192,9,1,0,16)); // damit wir immer alle 16 Schläge
		// komplett durchgehen	
		
		try {
			
			sequencer.setSequence(sequence);  
			sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);                  
			sequencer.start();
			sequencer.setTempoInBPM(120);
		} catch(Exception e) {e.printStackTrace();}
		
	} // Methode schließen
	
//	========================================== innere Listener-Klassen           
	
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
	
	public class MeinSendenListener implements ActionListener {    // neu - Sichern
		public void actionPerformed(ActionEvent a) {
			// eine ArrayList nur für den Zustand der Checkboxen erzeugen
			boolean[] checkboxZustand = new boolean[256];
			
			for (int i = 0; i < 256; i++) {
				JCheckBox check = (JCheckBox) checkboxListe.get(i);
				if (check.isSelected()) {
					checkboxZustand[i] = true;
				}
			}
			
			try {
				FileOutputStream fileStream = new FileOutputStream(
						new File("Checkbox.ser"));
				ObjectOutputStream os = new ObjectOutputStream(fileStream);
				os.writeObject(checkboxZustand);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			
		} // Methode schließen
	} // innere Klasse schließen
	
	
	
	public class MeinEinlesenListener implements ActionListener {  // neu - wiederherstellen
		
		public void actionPerformed(ActionEvent a) {
			// liest das Ganze wieder ein
			boolean[] checkboxZustand = null;
			try {
				FileInputStream fileIn = new FileInputStream(
						new File("Checkbox.ser"));
				ObjectInputStream is = new ObjectInputStream(fileIn);
				checkboxZustand = (boolean[]) is.readObject();
				
			} catch(Exception ex) {ex.printStackTrace();}
			
			// jetzt die Sequence mit dem hier neu setzen
			for (int i = 0; i < 256; i++) {
				JCheckBox check = (JCheckBox) checkboxListe.get(i);
				if (checkboxZustand[i]) {
					check.setSelected(true);
				} else {
					check.setSelected(false);
				}
			} 
			// jetzt Sequencer stoppen und neu starten
			sequencer.stop(); 
			trackErstellenUndStarten();
			
		} // Methode schließen
	} // innere Klasse schließen
	
	
//	==============================================================       
	
	public void tracksErzeugen(int[] liste) {
		
		for (int i = 0; i < 16; i++) {
			int taste = liste[i];
			
			if (taste != 0) {
				track.add(eventErzeugen(144,9,taste, 100, i));
				track.add(eventErzeugen(128,9,taste, 100, i + 1));
			}
		}
	}
	
	public  MidiEvent eventErzeugen(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
			
		}catch(Exception e) { }
		return event;
	}
	
} // Klasse schließen





