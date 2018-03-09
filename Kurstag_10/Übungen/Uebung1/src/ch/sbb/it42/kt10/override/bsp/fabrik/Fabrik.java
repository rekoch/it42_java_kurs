/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.kt10.override.bsp.fabrik;

import ch.sbb.it42.kt10.override.bsp.energie.Energie;
import ch.sbb.it42.kt10.override.bsp.produkt.Produkt;

public class Fabrik {

    public Produkt produziere() {
        System.out.println("Produziere Produkt");
        return new Produkt();
    }

    public void verbrauche(Energie energie) {
        System.out.println("Verbrauche Energie: " + energie);
    }
}
