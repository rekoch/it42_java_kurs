/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class Duebel {
    private int anzahl;
    private int preis;

    //macht es wirklich Sinn, dass alles im Konstruktor zu machen?
    //Laut ShoppingList.java sollte man am Anfang noch keine Attribute setzen. Deshalb unnötig

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

}