package kapitel_15;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EinfacherChatClient {
	
	JTextArea eingehend;
	JTextField ausgehend;
	BufferedReader reader;
	PrintWriter writer;
	Socket sock;
	
	public static void main(String[] args) {
		EinfacherChatClient client = new EinfacherChatClient();
		client.los();
	}
	
	public void los() {
		
		// GUI erstellen
		
		JFrame frame = new JFrame("L‰cherlich einfacher Chat-Client");
		JPanel hauptPanel = new JPanel();
		
		eingehend = new JTextArea(15,20);
		eingehend.setLineWrap(true);
		eingehend.setWrapStyleWord(true);
		eingehend.setEditable(false);
		
		JScrollPane fScroller = new JScrollPane(eingehend);
		fScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		fScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				
		ausgehend = new JTextField(20);
				
		JButton sendenButton = new JButton("Senden");
		sendenButton.addActionListener(new SendenButtonListener());
				
		hauptPanel.add(fScroller);
		hauptPanel.add(ausgehend);
		hauptPanel.add(sendenButton);
		
		netzwerkEinrichten();
		Thread readerThread = new Thread(new EingehendReader());
		readerThread.start();
		
		frame.getContentPane().add(BorderLayout.CENTER, hauptPanel);
		frame.setSize(400,500);
		frame.setVisible(true);
		
		
	} // los schlieﬂen
	
	private void netzwerkEinrichten() {  
		try {
			sock = new Socket("127.0.0.1", 5000);
			InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
			reader = new BufferedReader(streamReader);
			
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
	}  // innere Klasse SendenButtonListener schlieﬂen
	
	public class EingehendReader implements Runnable {
		public void run() {
			String nachricht;
			try {
				
				while ((nachricht = reader.readLine()) != null) {
					System.out.println("gelesen: " + nachricht);
					eingehend.append(nachricht + "\n");
					
				} // Ende der while-Schleife
			} catch(Exception ex) {ex.printStackTrace();}
		} // run schlieﬂen
	} // innere Klasse EingehendReader schlieﬂen 
} // ‰uﬂere Klasse schlieﬂen