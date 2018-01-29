/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Zimmer {
    private int plaetze;
    private double preis;
    private List<Reservation> reservationen = new ArrayList<>();

    public Zimmer(int plaetze, double preis){
        this.plaetze = plaetze;
        this.preis = preis;
    }

    public void zimmerReservieren(Date von, Date bis, String kunde){
        reservationen.add(new Reservation(von, bis, kunde));
    }

    public int getPlaetze() {
        return plaetze;
    }

    public void setPlaetze(int plaetze) {
        this.plaetze = plaetze;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
