/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.abstr;

public class Main {


    public static void main(String[] args) {
        Elektrogeraet eg1 = new Elektrogeraet();
        Elektrogeraet eg2 = new Foen();
        Elektrogeraet eg3 = new Staubsauger();

        Elektrogeraet[] elektrogeraete = new Elektrogeraet[]{eg1, eg2, eg3};

        for (Elektrogeraet eg : elektrogeraete) {
            eg.starten();
        }
    }
}
