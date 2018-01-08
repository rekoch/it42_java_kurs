/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class Duebel {
    private int anzahl;
    private int preis = 10;

    //TODO: macht es wirklich Sinn, dass alles im Konstruktor zu machen? Nur Anzahl
    public Duebel(int anzahl){

        this.anzahl = anzahl;
    }
}