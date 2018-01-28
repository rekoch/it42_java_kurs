/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Zimmer {
    private int plaetze;
    private boolean besetzt;
    private float preis;
    private List<Reservation> reservation = new ArrayList<>();

    public Zimmer (int plaetze, boolean besetzt, float preis){
        this.plaetze = plaetze;
        this.besetzt = besetzt;
        this.preis = preis;
    }

    public void zimmerReservation(Date von, Date bis, String name){

    }

    public void setBesetzt(boolean besetzt) {
        this.besetzt = besetzt;
    }

    public boolean getBesetzt() {
        return besetzt;
    }


    public void setPreis(float preis) {
        this.preis = preis;
    }

    public int getPlaetze() {
        return plaetze;
    }





}
