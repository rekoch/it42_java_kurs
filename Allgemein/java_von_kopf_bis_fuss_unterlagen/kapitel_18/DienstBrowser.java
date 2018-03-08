package kapitel_18;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DienstBrowser {
	
	JPanel hauptPanel;
	JComboBox dienstListe;
	DienstServer server;
	
	public void erstelleGUI() {
		JFrame frame = new JFrame("RMI-Browser");
		hauptPanel = new JPanel();
		frame.getContentPane().add(BorderLayout.CENTER, hauptPanel);
		
		Object[] dienste = getDienstListe();
		
		dienstListe = new JComboBox(dienste); 
		frame.getContentPane().add(BorderLayout.NORTH, dienstListe);
		
		dienstListe.addActionListener(new MeinListenListener());     
		
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	void ladeDienst(Object dienstAuswahl) {
		try {
			Dienst dienst = server.getDienst(dienstAuswahl);
			
			hauptPanel.removeAll();
			hauptPanel.add(dienst.getGuiPanel());
			hauptPanel.validate();
			hauptPanel.repaint();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	Object[] getDienstListe() {
		
		Object obj = null;
		Object[] dienste = null;
		
		try {
			
			obj = Naming.lookup("rmi://127.0.0.1/DienstServer");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		server = (DienstServer) obj;
		
		
		try {
			
			dienste = server.getDienstListe();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return dienste;
		
	}
	
	class MeinListenListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) { 
			
			Object auswahl =  dienstListe.getSelectedItem();
			ladeDienst(auswahl);
		}
	}
	
	public static void main(String[] args) {
		new DienstBrowser().erstelleGUI();
	}
}



    
      