/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.kt10.override.bsp.fabrik;

import ch.sbb.it42.kt10.override.bsp.energie.Energie;
import ch.sbb.it42.kt10.override.bsp.produkt.Produkt;
import ch.sbb.it42.kt10.override.bsp.produkt.Schoggi;

public class SchoggiFabrik extends Fabrik {

    public Schoggi produziere() {
        System.out.println("Produziere Schoggi in Schoggifabrik");
        return new Schoggi();
    }

    public void verbrauche(Energie e) {
        System.out.println("Verbrauche Energie "+e+" in Schoggifabrik");
    }

}
