/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.kt10.overload.bsp;

public class Rechteck {

    private final int laenge;
    private final int breite;

    public Rechteck(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public int getLaenge() {
        return laenge;
    }

    public int getBreite() {
        return breite;
    }
}
