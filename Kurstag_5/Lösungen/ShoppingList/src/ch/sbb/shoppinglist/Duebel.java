/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package ch.sbb.shoppinglist;

public class Duebel {
    private String name;
    private int anzahl;
    private int preis;

    //TODO: macht es wirklich Sinn, dass alles im Konstruktor zu machen?
    public Duebel(String name, int anzahl, int preis){
        this.name = name;
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public String getName(){
        return this.name;
    }
}