package kapitel_14;

import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class QuizKartenAutor {
	
	private JTextArea frage;
	private JTextArea antwort;
	private ArrayList<QuizKarte> kartenListe;
	private JFrame frame;
	
	public static void main (String[] args) {
		QuizKartenAutor editor = new QuizKartenAutor();
		editor.los();
	}
	
	public void los() {
		// GUI erstellen
		frame = new JFrame("Quizkarten-Autor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		frage = new JTextArea(6,20);
		frage.setLineWrap(true);
		frage.setWrapStyleWord(true);
		frage.setFont(bigFont);
		
		JScrollPane fScroller = new JScrollPane(frage);
		fScroller.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		fScroller.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		antwort = new JTextArea(6,20);
		antwort.setLineWrap(true);
		antwort.setWrapStyleWord(true);
		antwort.setFont(bigFont);
		
		JScrollPane aScroller = new JScrollPane(antwort);
		aScroller.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScroller.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton nächsteKarteButton = new JButton("N�chste Karte");
		kartenListe = new ArrayList<QuizKarte>();
		JLabel fLabel = new JLabel("Die Frage lautet:");
		JLabel aLabel = new JLabel("Die Antwort lautet:");
		
		mainPanel.add(fLabel);
		mainPanel.add(fScroller);
		mainPanel.add(aLabel);
		mainPanel.add(aScroller);
		mainPanel.add(nächsteKarteButton);
		nächsteKarteButton.addActionListener(new NaechsteKarteListener());
		JMenuBar menüleiste = new JMenuBar();
		JMenu menüDatei = new JMenu("Datei");
		JMenuItem menüPunktNeu = new JMenuItem("Neu");
		
		JMenuItem menüPunktSpeichern = new JMenuItem("Speichern");
		menüPunktNeu.addActionListener(new MenueNeuListener());
		menüPunktSpeichern.addActionListener(new MenueSpeichernListener());
		
		menüDatei.add(menüPunktNeu);
		menüDatei.add(menüPunktSpeichern);
		menüleiste.add(menüDatei);
		frame.setJMenuBar(menüleiste);
		
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(500,600);
		frame.setVisible(true);        
	}
	
	
	public class NaechsteKarteListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			QuizKarte karte = new QuizKarte(frage.getText(), antwort.getText());
			kartenListe.add(karte);
			karteAbräumen();
			
		}
	}
	
	public class MenueSpeichernListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			QuizKarte karte = new QuizKarte(frage.getText(), antwort.getText());
			kartenListe.add(karte);
			
			JFileChooser dateiWahl = new JFileChooser();
			dateiWahl.showSaveDialog(frame);
			dateiSpeichern(dateiWahl.getSelectedFile());
		}
	}
	
	public class MenueNeuListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			kartenListe.clear();
			karteAbräumen();           
		}
	}
	
	
	private void karteAbräumen() {
		frage.setText("");
		antwort.setText("");
		frage.requestFocus();
	}
	
	private void dateiSpeichern(File datei) {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(datei));
//			Iterator kartenIterator = kartenListe.iterator();
//			while (kartenIterator.hasNext()) {
//			QuizKarte karte = (QuizKarte) kartenIterator.next();
//			writer.write(karte.getFrage() + "/");
//			writer.write(karte.getAntwort() + "\n");
//			} TODO: Dies war die Fassung im Internet, im Buch wurde die
//			neue foreach-Schleife verwendet:
			
			for (QuizKarte karte:kartenListe) {
				writer.write(karte.getFrage() + "/");
				writer.write(karte.getAntwort() + "\n");
			}
			writer.close();
			
			
		} catch(IOException ex) {
			System.out.println("konnte die kartenliste nicht schreiben");
			ex.printStackTrace();
		}
		
	} // Methode schlie�en
}




