package kapitel_18;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MiniMusikDienst implements Dienst {
	
	MeinZeichenPanel meinPanel;
	
	public JPanel getGuiPanel() {
		
		JPanel hauptPanel = new JPanel();
		meinPanel = new MeinZeichenPanel();
		JButton spielButton = new JButton("Spiel!");
		spielButton.addActionListener(new SpielListener());
		hauptPanel.add(meinPanel);
		hauptPanel.add(spielButton);
		return hauptPanel;
	}
	
	public class SpielListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			
			try {
				
				Sequencer sequencer = MidiSystem.getSequencer();         
				sequencer.open();
				
				sequencer.addControllerEventListener(meinPanel, new int[] {127});
				Sequence seq = new Sequence(Sequence.PPQ, 4);
				Track track = seq.createTrack();     
				
				for (int i = 0; i < 100; i+= 4) {
					
					int zZahl = (int) ((Math.random() * 50) + 1);
					if (zZahl < 38) {  // nur ausf�hren, wenn zZahl <38 (also in 75 % der F�lle)
						
						track.add(machEvent(144,1,zZahl,100,i));
						
						track.add(machEvent(176,1,127,0,i));
						
						track.add(machEvent(128,1,zZahl,100,i + 2));
					}
				} // Ende der Schleife
				
				sequencer.setSequence(seq);
				
				sequencer.start();
				sequencer.setTempoInBPM(220);
			} catch (Exception ex) {ex.printStackTrace();}
			
		} // actionPerformed schlie�en
	} // innere Klasse schlie�en
	
	
	public MidiEvent machEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
			
		}catch(Exception e) { }
		return event;
	}
	
	
	
	class MeinZeichenPanel extends JPanel implements ControllerEventListener {
		
		// wir zeichnen nur, wenn wir ein Event erhalten haben
		boolean msg = false;
		
		public void controlChange(ShortMessage event) {
			msg = true;       
			repaint();         
		}
		
		public Dimension getPreferredSize() {
			return new Dimension(300,300);
		}
		
		public void paintComponent(Graphics g) {
			if (msg) {
				
				Graphics2D g2 = (Graphics2D) g;
				
				int r = (int) (Math.random() * 250);
				int gr = (int) (Math.random() * 250);
				int b = (int) (Math.random() * 250);
				
				g.setColor(new Color(r,gr,b));
				
				int höhe = (int) ((Math.random() * 120) + 10);
				int breite = (int) ((Math.random() * 120) + 10);
				
				int x = (int) ((Math.random() * 40) + 10);
				int y =  (int) ((Math.random() * 40) + 10);        
				
				g.fillRect(x,y, höhe, breite);
				msg = false;
				
			} // Ende der if-Verzweigung
		} // Methode schlie�en
	}  // innere Klasse schlie�en
} // Klasse schlie�en