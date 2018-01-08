/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class Light_Saber {
    private int anzahl;
    private int preis = 3000;

    public Light_Saber(int anzahl){
        this.anzahl = anzahl;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public int getPreis() {
        return preis;
    }
}
