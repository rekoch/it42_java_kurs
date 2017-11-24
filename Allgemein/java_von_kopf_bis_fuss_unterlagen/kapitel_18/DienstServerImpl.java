package kapitel_18;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;


public class DienstServerImpl extends UnicastRemoteObject implements DienstServer  {
	
	HashMap dienstListe;
	
	public DienstServerImpl() throws RemoteException {
		diensteEinrichten();
	}
	
	private void diensteEinrichten() {
		dienstListe = new HashMap();
		dienstListe.put("Würfeldienst", new WuerfelDienst());  
		dienstListe.put("Wochentagsdienst", new WochentagsDienst());  
		dienstListe.put("Visueller Musikdienst", new MiniMusikDienst());   
	}
	
	public Object[] getDienstListe() {
		System.out.println("in Remote");
		return dienstListe.keySet().toArray();
	}
	
	public Dienst getDienst(Object dienstSchlüssel) throws RemoteException {        
		Dienst derDienst = (Dienst) dienstListe.get(dienstSchlüssel);       
		return derDienst;
	}
	
	public static void main (String[] args) {
		try {
			Naming.rebind("DienstServer", new DienstServerImpl());
		} catch(Exception ex) { 
			ex.printStackTrace();
		}
		System.out.println("Remote-Dienst läuft");
	}
	
}