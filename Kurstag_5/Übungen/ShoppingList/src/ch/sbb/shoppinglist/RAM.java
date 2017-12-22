/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class RAM {
    private int anzahl;
    private int preis;

    //TODO: macht es wirklich Sinn, dass alles im Konstruktor zu machen?
    public RAM(int anzahl, int preis){
        this.anzahl = anzahl;
        this.preis = preis;
    }
}
