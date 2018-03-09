/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.kt10.override.bsp.fabrik;

import ch.sbb.it42.kt10.override.bsp.produkt.Schoggi;

public class SchoggiFabrik extends Fabrik {

    @Override
    public Schoggi produziere() {
        System.out.println("Produziere Schoggi");
        return new Schoggi();
    }
}
