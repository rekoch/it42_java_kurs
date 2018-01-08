package kapitel_11;

import javax.sound.midi.*;


public class MiniMiniMusikProg {   // erste Version
	
	public static void main(String[] args) {
		MiniMiniMusikProg mini = new MiniMiniMusikProg();
		mini.spielen();
	} // main schlie�en
	
	public void spielen() {
		try {
			// Sequencer holen (und �ffnen), eine Sequence und einen Track erzeugen
			Sequencer player = MidiSystem.getSequencer();         
			player.open();
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			
			Track track = seq.createTrack();     
			
			// erst die Message erzeugen
			// dann die Message in ein MidiEvent stecken
			// und das Event zum Track hinzuf�gen
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(a, 1); 
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16); 
			track.add(noteOff);
			
			// die Events zum Track hinzuf�gen
			
			// die Sequence zum Sequencer hinzuf�gen und diesen starten
			player.setSequence(seq);
			
			player.start();
			
			// neu! (Damit der Player wieder geschlossen 
			// wird, nachdem er den Ton abgespielt hat.)
			Thread.sleep(1000);
			player.close();
			System.exit(0);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // spielen schlie�en
} // Klasse schlie�en