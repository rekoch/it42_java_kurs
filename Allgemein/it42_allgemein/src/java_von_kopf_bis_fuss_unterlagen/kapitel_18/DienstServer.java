package kapitel_18;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DienstServer extends Remote {
	
	Object[] getDienstListe() throws RemoteException;
	
	Dienst getDienst(Object dienstSchlüssel) throws RemoteException;
}