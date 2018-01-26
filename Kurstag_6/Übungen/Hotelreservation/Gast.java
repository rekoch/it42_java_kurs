package Hotelreservation;

import java.util.Date;

public class Gast {
private int anzahlBegleiter;
private int ankunft;
private int abreise;
private String name;
private boolean bezahlt;
private Date geburtsdatum;

 public Gast(int anzahlBegleiter, int ankunft, int abreise, String name, boolean bezahlt, Date geburtsdatum){
 this.anzahlBegleiter = anzahlBegleiter;
 this.ankunft = ankunft;
 this.abreise = abreise;
 this.name = name;
 this.bezahlt = bezahlt;
 this.geburtsdatum = geburtsdatum;
 }
}