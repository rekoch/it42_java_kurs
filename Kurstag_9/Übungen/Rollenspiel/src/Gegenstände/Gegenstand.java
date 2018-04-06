/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package Gegenstände;

public class Gegenstand {
    private String bezeichnung;
    private int gewicht;

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}
