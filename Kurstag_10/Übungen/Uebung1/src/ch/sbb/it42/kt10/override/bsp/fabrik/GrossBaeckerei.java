/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.kt10.override.bsp.fabrik;

import ch.sbb.it42.kt10.override.bsp.produkt.Brot;

public class GrossBaeckerei extends Fabrik {

    @Override
    public Brot produziere() {
        System.out.println("Produziere Brot");
        return new Brot();
    }

}
