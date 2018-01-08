/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class Sicherung {
    private int anzahl;
    private int preis = 5;

    public Sicherung(int anzahl){
        this.anzahl = anzahl;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public int getPreis() {
        return preis;
    }
}
