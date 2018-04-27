/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.uebungen.kurstag10.override.fabrik;

import ch.sbb.it42javakurs.uebungen.kurstag10.override.energie.Energie;
import ch.sbb.it42javakurs.uebungen.kurstag10.override.produkt.Produkt;
import ch.sbb.it42javakurs.uebungen.kurstag10.override.produkt.Schoggi;

public class SchoggiFabrik extends Fabrik {

    public Schoggi produziere() {
        System.out.println("Produziere Schoggi in Schoggifabrik");
        return new Schoggi();
    }

    public void verbrauche(Energie e) {
        System.out.println("Verbrauche Energie "+e+" in Schoggifabrik");
    }

}
