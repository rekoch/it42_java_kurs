package de.oreilly.javavonkopfbisfuss.kapitel_13;

import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;

public class BeatBox {
	
	JPanel hauptPanel;
	ArrayList<JCheckBox> checkboxListe;
	Sequencer sequencer;
	Sequence sequence;
	Track track;
	JFrame derFrame;
	
	String[] instrumentNamen = {"Bassdrum", "Hi-Hat, geschlossen", "Hi-Hat, offen",
	"Snaredrum", "Crashbecken", "Händeklatschen", "Hohes Tom-Tom", "Hohes Bongo",
	"Maracas", "Trillerpfeife", "Tiefe Conga", "Kuhglocke", "Vibraslap", 
	"Tieferes Tom-Tom", "Hohes Agogo", "Hohe Conga, offen"};
	int[] instrumente = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
	
	
	public static void main (String[] args) {
		new BeatBox().guiErstellen();
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
	} // Methode schliessen
	
	
	public void midiEinrichten() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(120);
			
		} catch(Exception e) {e.printStackTrace();}
	} // Methode schliessen
	
	public void trackErstellenUndStarten() {
		int[] trackListe = null;
		
		sequence.deleteTrack(track);
		track = sequence.createTrack();
		
		for (int i = 0; i < 16; i++) {
			trackListe = new int[16];
			
			int taste = instrumente[i];   
			
			for (int j = 0; j < 16; j++ ) {         
				JCheckBox jc = checkboxListe.get(j + (16*i));
				if ( jc.isSelected()) {
					trackListe[j] = taste;
				} else {
					trackListe[j] = 0;
				}                    
			} // Ende innere Schleife
			
			tracksErzeugen(trackListe);
			  
		} // Ende äussere Schleife
		
		track.add(eventErzeugen(192,9,1,0,16));     
		try {
			sequencer.setSequence(sequence); 
			sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);                   
			sequencer.start();
			sequencer.setTempoInBPM(120);
		} catch(Exception e) {e.printStackTrace();}
	} // Methode trackErstellenUndStarten schliessen
	
	
	public class MeinStartListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			trackErstellenUndStarten();
		}
	} // innere Klasse schliessen
	
	public class MeinStoppListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			sequencer.stop();
		}
	} // innere Klasse schliessen
	
	public class MeinSchnellerListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			float tempoFactor = sequencer.getTempoFactor(); 
			sequencer.setTempoFactor((float)(tempoFactor * 1.03));
		}
	} // innere Klasse schliessen
	
	public class MeinLangsamerListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			float tempoFactor = sequencer.getTempoFactor();
			sequencer.setTempoFactor((float)(tempoFactor * .97));
		}
	} // innere Klasse schliessen
	
	public void tracksErzeugen(int[] liste) {        
		
		for (int i = 0; i < 16; i++) {
			int taste = liste[i];
			
			if (taste != 0) {
				track.add(eventErzeugen(144,9,taste, 100, i));
				track.add(eventErzeugen(128,9,taste, 100, i+1));
			}
		}
	}
	
	public  MidiEvent eventErzeugen(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
			
		} catch(Exception e) {e.printStackTrace(); }
		return event;
	}
	
} // Klasse schliessen

        
             
          
          
          