/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package Ruestung;

import java.util.Random;

public class Ruestung {
    private int gewicht;

    public boolean verhindereSchaden(){
        return new Random().nextDouble() <= 0.5;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}