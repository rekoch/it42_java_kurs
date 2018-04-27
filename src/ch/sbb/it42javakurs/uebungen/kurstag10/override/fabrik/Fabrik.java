/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.uebungen.kurstag10.override.fabrik;

import ch.sbb.it42javakurs.uebungen.kurstag10.override.energie.Energie;
import ch.sbb.it42javakurs.uebungen.kurstag10.override.produkt.Produkt;

public class Fabrik {

    public Produkt produziere() {
        System.out.println("Produziere Produkt");
        return new Produkt();
    }

    public void verbrauche(Energie energie) {
        System.out.println("Verbrauche Energie: " + energie);
    }
}
