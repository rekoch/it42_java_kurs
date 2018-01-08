/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class RAM {
    private int anzahl;
    private int preis = 128;

    public RAM(int anzahl){
        this.anzahl = anzahl;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public int getPreis() {
        return preis;
    }
}
