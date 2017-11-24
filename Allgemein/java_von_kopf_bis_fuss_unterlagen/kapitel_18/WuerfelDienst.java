/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package kapitel_18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WuerfelDienst implements Dienst {
	
	JLabel label;
	JComboBox anzahlWürfel;
	
	public JPanel getGuiPanel() {
		JPanel panel = new JPanel();
		JButton button = new JButton("Wirf!");
		String[] wahl = {"1", "2", "3", "4", "5"};
		anzahlWürfel = new JComboBox(wahl);
		label = new JLabel("hier stehen gleich die Augenzahlen");
		button.addActionListener(new WurfListener());
		panel.add(anzahlWürfel);
		panel.add(button);
		panel.add(label);
		return panel;
	}
	
	public class WurfListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			// würfeln
			String augenZahl = "";
			String auswahl = (String)  anzahlWürfel.getSelectedItem();
			int anzahlZuWerfende = Integer.parseInt(auswahl);
			for (int i = 0; i < anzahlZuWerfende; i++) {
				int z = (int) ((Math.random() * 6) + 1);
				augenZahl += (" " + z);
			}
			label.setText(augenZahl);
		}
	}
}
         
       
   