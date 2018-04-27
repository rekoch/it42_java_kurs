/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */
package ch.sbb.it42javakurs.uebungen.kurstag10.override;

import ch.sbb.it42javakurs.uebungen.kurstag10.override.energie.Energie;
import ch.sbb.it42javakurs.uebungen.kurstag10.override.energie.Heizoel;
import ch.sbb.it42javakurs.uebungen.kurstag10.override.energie.Strom;
import ch.sbb.it42javakurs.uebungen.kurstag10.override.fabrik.Fabrik;
import ch.sbb.it42javakurs.uebungen.kurstag10.override.fabrik.GrossBaeckerei;
import ch.sbb.it42javakurs.uebungen.kurstag10.override.fabrik.SchoggiFabrik;
import ch.sbb.it42javakurs.uebungen.kurstag10.override.produkt.Produkt;
import ch.sbb.it42javakurs.uebungen.kurstag10.override.produkt.Schoggi;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.zeigeVerbrauch();
        //main.zeigeProduktion();
    }


    private void zeigeProduktion() {
        Fabrik eineFrabrik = new Fabrik();
        SchoggiFabrik schoggiFabrik = new SchoggiFabrik();
        GrossBaeckerei grossBaeckerei = new GrossBaeckerei();

        Produkt einProdukt = eineFrabrik.produziere();
        Schoggi schoggi = schoggiFabrik.produziere();
        Produkt brot = grossBaeckerei.produziere();

        System.out.println("Alle als gewoehnliche Fabrik behandeln:");

        Fabrik[] fabrik = new Fabrik[3];
        fabrik[0] = eineFrabrik;
        fabrik[1] = schoggiFabrik;
        fabrik[2] = grossBaeckerei;

        Produkt[] produkt = new Produkt[fabrik.length];
        for (int i = 0; i < fabrik.length; i++) {
            produkt[i] = fabrik[i].produziere();
        }
    }


    private void zeigeVerbrauch() {
        Energie energie = new Energie();
        Strom strom = new Strom();
        Heizoel heizoel = new Heizoel();

        Fabrik eineFabrik = new Fabrik();
        SchoggiFabrik schoggiFabrik = new SchoggiFabrik();
        GrossBaeckerei grossBaeckerei = new GrossBaeckerei();

        eineFabrik.verbrauche(strom);
        schoggiFabrik.verbrauche(energie);
        grossBaeckerei.verbrauche(heizoel);

        Fabrik[] fabrik = new Fabrik[3];
        fabrik[0] = eineFabrik;
        fabrik[1] = schoggiFabrik;
        fabrik[2] = grossBaeckerei;

        for (int i = 0; i < fabrik.length; i++) {
            fabrik[i].verbrauche(strom); // oder energie
        }
    }
}
