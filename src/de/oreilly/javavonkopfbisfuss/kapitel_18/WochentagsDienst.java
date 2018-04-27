package de.oreilly.javavonkopfbisfuss.kapitel_18;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WochentagsDienst implements Dienst {
	
	JLabel ausgabeLabel;
	JComboBox monat;
	JTextField tag;
	JTextField jahr;
	
	public JPanel getGuiPanel() {
		JPanel panel = new JPanel();
		JButton button = new JButton("Tu es!");
		button.addActionListener(new TuEsListener());
		ausgabeLabel = new JLabel("hier steht gleich der Wochentag");
		
		DateFormatSymbols datumsKram = new DateFormatSymbols();      
		monat = new JComboBox(datumsKram.getMonths());
		tag = new JTextField(8);
		jahr = new JTextField(8);
		
		JPanel eingabePanel = new JPanel(new GridLayout(3,2));
		eingabePanel.add(new JLabel("Monat"));
		eingabePanel.add(monat);
		eingabePanel.add(new JLabel("Tag"));
		eingabePanel.add(tag);
		eingabePanel.add(new JLabel("Jahr"));    
		eingabePanel.add(jahr);
		
		panel.add(eingabePanel);
		panel.add(button);
		panel.add(ausgabeLabel);
		return panel;
	}
	
	public class TuEsListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			int zahlMonat = monat.getSelectedIndex(); 
			int zahlTag = Integer.parseInt(tag.getText());
			int zahlJahr = Integer.parseInt(jahr.getText());
			Calendar c = Calendar.getInstance();
			c.set(Calendar.MONTH, zahlMonat);
			c.set(Calendar.DAY_OF_MONTH, zahlTag);
			c.set(Calendar.YEAR, zahlJahr);
			Date datum = c.getTime();
			String wochenTag = (new SimpleDateFormat("EEEE")).format(datum);
			ausgabeLabel.setText(wochenTag);
		}
	}
}
         
       
   