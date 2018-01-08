/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class Duebel {
    private int anzahl;
    private int preis = 10;

    public Duebel(int anzahl){
        this.anzahl = anzahl;
    }

    public int getAnzahl()
    {
        return anzahl;
    }

    public int getPreis()
    {
        return preis;
    }
}