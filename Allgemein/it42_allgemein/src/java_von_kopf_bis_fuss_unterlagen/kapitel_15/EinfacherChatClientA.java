package kapitel_15;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EinfacherChatClientA {
	
	JTextField ausgehend;   
	PrintWriter writer;
	Socket sock;
	
	public static void main(String[] args) {
		EinfacherChatClientA client = new EinfacherChatClientA();
		client.los();
	}
	
	public void los() {
		JFrame frame = new JFrame("L‰cherlich einfacher Chat-Client");
		JPanel hauptPanel = new JPanel();
		
		ausgehend = new JTextField(20);
		
		JButton sendenButton = new JButton("Senden");
		sendenButton.addActionListener(new SendenButtonListener());
				
		hauptPanel.add(ausgehend);
		hauptPanel.add(sendenButton);
		
		netzwerkEinrichten();
		
		frame.getContentPane().add(BorderLayout.CENTER, hauptPanel);
		frame.setSize(400,500);
		frame.setVisible(true);
		
	} // los schlieﬂen
	
	private void netzwerkEinrichten() {  
		try {
			sock = new Socket("127.0.0.1", 5000);
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("Netzwerkverbindung steht");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	} // netzwerkEinrichten schlieﬂen   
	
	public class SendenButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			try {
				writer.println(ausgehend.getText());
				writer.flush();
				
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			ausgehend.setText("");
			ausgehend.requestFocus();
		}
	} // innere Klasse SendenButtonListener schlieﬂen
}