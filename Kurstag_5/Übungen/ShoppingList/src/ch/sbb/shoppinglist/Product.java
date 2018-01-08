/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.shoppinglist;

public abstract class Product {
    public Product(){
        anzahl = 1;
    }

    private int anzahl;
    private int preis;

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public abstract String getProductnameName();

    public abstract String getProductKuerzel();
}
