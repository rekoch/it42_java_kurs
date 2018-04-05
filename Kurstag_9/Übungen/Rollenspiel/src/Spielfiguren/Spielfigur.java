/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package Spielfiguren;

import Gegenstände.Gegenstand;
import Waffen.Keule;
import Waffen.Waffe;

public class Spielfigur {
    private String name;
    private double leben;
    private double tragkraft;
    private Gegenstand gegenstand;
    private Waffe waffe;

    public Spielfigur(String name) {
        this.name = name;
        this.waffe = new Keule();
    }
}
