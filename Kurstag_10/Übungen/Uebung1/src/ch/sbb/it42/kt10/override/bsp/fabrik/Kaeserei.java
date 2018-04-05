/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.kt10.override.bsp.fabrik;

import ch.sbb.it42.kt10.override.bsp.produkt.Kaese;

public class Kaeserei extends Fabrik{

    @Override
    public Kaese produziere() {
        System.out.println("Produziere Käse");
        return new Kaese();
    }
}
