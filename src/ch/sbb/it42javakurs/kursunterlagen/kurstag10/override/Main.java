/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag10.override;

public class Main {

    public static void main(String[] args) {
        Elektrogeraet elektrogeraet1 = new Elektrogeraet();
        Kaffeemaschine kaffeemaschine = new Kaffeemaschine();
        Elektrogeraet elektrogeraet2 = kaffeemaschine;

        elektrogeraet1.starten();
        kaffeemaschine.starten();
        elektrogeraet2.starten();
    }
}
