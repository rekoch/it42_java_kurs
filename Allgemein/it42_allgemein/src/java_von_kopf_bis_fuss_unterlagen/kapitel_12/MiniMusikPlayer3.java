/*
 * Created on 15.01.2006
 */

package kapitel_12;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusikPlayer3 {
	
	static JFrame f = new JFrame("Mein erstes Musikvideo");
	static MeinZeichenPanel ml;
	
	public static void main(String[] args) {
		MiniMusikPlayer3 mini = new MiniMusikPlayer3();
		mini.los();
	} // Methode schlie�en
	
	public void guiErstellen() {
		ml = new MeinZeichenPanel();
		f.setContentPane(ml);
		f.setBounds(30, 30, 300, 300);
		f.setVisible(true);
	} // Methode guiErstellen schlie�en
	
	public void los() {
		guiErstellen();
		
		try {
			
			// einen Sequencer erzeugen (und �ffnen),
			// eine Sequence und einen Track erzeugen
			
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addControllerEventListener(ml, new int[] { 127 });
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			// jetzt werden MidiEvents (die eine 
			// MidiMessage enthalten) erzeugt
			
			int r = 0;
			for (int i = 0; i < 60; i += 4) {
				r = (int) ((Math.random() * 50) + 1);
				track.add(eventErzeugen(144, 1, r, 100, i));
				track.add(eventErzeugen(176, 1, 127, 0, i));
				track.add(eventErzeugen(128, 1, r, 100, i + 2));
			} // Ende der for-Schleife
			
			// Hinzuf�gen der Events zum Track und der Sequence           
			// zum Sequencer, Setzen der Zeiten und Starten
			
			sequencer.setSequence(seq);
			sequencer.start();
			sequencer.setTempoInBPM(120);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // Methode los schlie�en
	
	public MidiEvent eventErzeugen(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
			
		} catch (Exception e) { }
		return event;
	} // Methode eventErzeugen schlie�en
	
	class MeinZeichenPanel extends JPanel implements ControllerEventListener {
		
		// wir wollen nur dann zeichnen, wenn wir ein Event haben
		boolean msg = false;
		
		public void controlChange(ShortMessage event) {
			msg = true;
			repaint();
		}
		
		public void paintComponent(Graphics g) {
			if (msg) {
				
				Graphics2D g2 = (Graphics2D) g;
				
				int r = (int) (Math.random() * 250);
				int gr = (int) (Math.random() * 250);
				int b = (int) (Math.random() * 250);
				
				g.setColor(new Color(r, gr, b));
				
				int höhe = (int) ((Math.random() * 120) + 10);
				int breite = (int) ((Math.random() * 120) + 10);
				
				int x = (int) ((Math.random() * 40) + 10);
				int y = (int) ((Math.random() * 40) + 10);
				
				g.fillRect(x, y, höhe, breite);
				msg = false;
				
			} // Ende der if-Verzweigung
			
		} // Methode schlie�en
		
	} // innere Klasse schlie�en
	
} // Klasse schlie�en
