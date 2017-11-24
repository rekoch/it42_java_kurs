package anhang_a;

import java.io.*;
import java.net.*;
import java.util.*;

public class MusikServer {
	
	ArrayList<ObjectOutputStream> clientOutputStreams;
	
	public static void main (String[] args) {
		new MusikServer().los();
	}
	
	public class ClientHandler implements Runnable {
		
		ObjectInputStream in;       
		Socket clientSocket;
		
		public ClientHandler(Socket socket) {
			try {
				clientSocket = socket;
				in = new ObjectInputStream(clientSocket.getInputStream());
				
			} catch(Exception ex) {ex.printStackTrace();}
		} // Konstruktor schlieﬂen
		
		public void run() {
			Object o2 = null;
			Object o1 = null;
			try {
				
				while ((o1 = in.readObject()) != null) {
					
					o2 = in.readObject();
					
					System.out.println("zwei Objekte gelesen");
					esAllenMitteilen(o1, o2);
					
				} // Ende while-Schleife
			} catch(Exception ex) {ex.printStackTrace();}
		} // run schlieﬂen
	} // innere Klasse schlieﬂen
	
	
	public void los() {
		clientOutputStreams = new ArrayList<ObjectOutputStream>();
		
		try {
			ServerSocket serverSock = new ServerSocket(4242);
			
			while(true) {
				Socket clientSocket = serverSock.accept();
				ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
				clientOutputStreams.add(out);
				
				Thread t = new Thread(new ClientHandler(clientSocket));
				t.start();
				
				System.out.println("Verbindung hergestellt");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void esAllenMitteilen(Object eins, Object zwei) {
		Iterator it = clientOutputStreams.iterator();
		while(it.hasNext()) {
			try {
				ObjectOutputStream out = (ObjectOutputStream) it.next();
				out.writeObject(eins);
				out.writeObject(zwei);
			}catch(Exception ex) {ex.printStackTrace();}
		}
	} // esAllenMitteilen schlieﬂen
	
}
       