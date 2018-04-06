/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package Waffen;

public class Waffe {
    private int angriffswert;
    private int gewicht;

    public int getWaffenKampfwert(){
        return angriffswert;
    }

    public int getAngriffswert() {
        return angriffswert;
    }

    public void setAngriffswert(int angriffswert) {
        this.angriffswert = angriffswert;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}
