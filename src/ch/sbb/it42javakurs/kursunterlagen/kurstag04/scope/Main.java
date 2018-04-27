/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag04.scope;

public class Main {

    public static void main(String[] args) {
        Wohnung zweizimmerWohnung = new Wohnung();
        System.out.println(zweizimmerWohnung.getGesamtFlaeche());
    }
}
