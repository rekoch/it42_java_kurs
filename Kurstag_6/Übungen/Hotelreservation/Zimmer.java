package Hotelreservation;

import java.util.Date;

public class Zimmer {
    private int anzahlBetten;
    private float preis;
    private boolean besetzt;



    public Zimmer (int anzahlBetten, float preis, boolean besetzt){
        this.anzahlBetten = anzahlBetten;
        this.preis = preis;
        this.besetzt = besetzt;
    }


    public void zimmerReservation (Date von, Date bis, String name){

    }
public void setBesetzt (boolean besetzt){
        this.besetzt = besetzt;

}
public boolean getBesetzt(){
    return besetzt;
}

public void setPreis (float preis){
    this.preis = preis;
}

public int getAnzahlBetten() {
    return anzahlBetten;
}
}
