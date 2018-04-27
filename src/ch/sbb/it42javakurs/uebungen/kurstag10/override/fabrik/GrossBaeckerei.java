/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.uebungen.kurstag10.override.fabrik;

import ch.sbb.it42javakurs.uebungen.kurstag10.override.produkt.Brot;

public class GrossBaeckerei extends Fabrik {

    @Override
    public Brot produziere() {
        System.out.println("Produziere Brot");
        return new Brot();
    }

}
