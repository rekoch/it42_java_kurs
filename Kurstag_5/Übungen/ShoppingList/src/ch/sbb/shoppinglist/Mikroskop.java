/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class Mikroskop {
    private int anzahl;
    private int preis = 20;

    public Mikroskop(int anzahl){
        this.anzahl = anzahl;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public int getPreis() {
        return preis;
    }
}
