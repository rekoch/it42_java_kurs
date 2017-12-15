package kapitel_14;

import java.io.*;

public class QuizKarte implements Serializable {
	
	private String unverwechselbareID;
	private String kategorie;
	private String frage;
	private String antwort;
	private String tipp;
	
	public QuizKarte(String f, String a) {
		frage = f;
		antwort = a;
	}
	
	
	public void setUnverwechselbareID(String id) {
		unverwechselbareID = id;
	}
	
	public String getUnverwechselbareID() {
		return unverwechselbareID;
	}
	
	public void setKategorie(String k) {
		kategorie = k;
	}
	
	public String getKategorie() {
		return kategorie;
	}
	
	public void setFrage(String f) {
		frage = f;
	}
	
	public String getFrage() {
		return frage;
	}
	
	public void setAntwort(String a) {
		antwort = a;
	}
	
	public String getAntwort() {
		return antwort;
	}
	
	public void setTipp(String h) {
		tipp = h;
	}
	
	public String getTipp() {
		return tipp;
	}
	
}     

