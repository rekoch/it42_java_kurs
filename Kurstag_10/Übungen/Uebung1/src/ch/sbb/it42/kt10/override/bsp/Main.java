/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */
package ch.sbb.it42.kt10.override.bsp;

import ch.sbb.it42.kt10.override.bsp.energie.Energie;
import ch.sbb.it42.kt10.override.bsp.energie.Heizoel;
import ch.sbb.it42.kt10.override.bsp.energie.Strom;
import ch.sbb.it42.kt10.override.bsp.fabrik.Fabrik;
import ch.sbb.it42.kt10.override.bsp.fabrik.GrossBaeckerei;
import ch.sbb.it42.kt10.override.bsp.fabrik.Kaeserei;
import ch.sbb.it42.kt10.override.bsp.fabrik.SchoggiFabrik;
import ch.sbb.it42.kt10.override.bsp.produkt.Kaese;
import ch.sbb.it42.kt10.override.bsp.produkt.Produkt;
import ch.sbb.it42.kt10.override.bsp.produkt.Schoggi;

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
        Kaeserei kaeserei = new Kaeserei();

        Produkt einProdukt = eineFrabrik.produziere();
        Schoggi schoggi = schoggiFabrik.produziere();
        Produkt brot = grossBaeckerei.produziere();
        Kaese kaese = kaeserei.produziere();

        System.out.println("Alle als gewoehnliche Fabrik behandeln:");

        Fabrik[] fabrik = new Fabrik[4];
        fabrik[0] = eineFrabrik;
        fabrik[1] = schoggiFabrik;
        fabrik[2] = grossBaeckerei;
        fabrik[3] = kaeserei;

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
        Kaeserei kaeserei = new Kaeserei();

        eineFabrik.verbrauche(strom);
        schoggiFabrik.verbrauche(energie);
        grossBaeckerei.verbrauche(heizoel);
        kaeserei.verbrauche(strom);


        Fabrik[] fabrik = new Fabrik[4];
        fabrik[0] = eineFabrik;
        fabrik[1] = schoggiFabrik;
        fabrik[2] = grossBaeckerei;
        fabrik[3] = kaeserei;

        for (int i = 0; i < fabrik.length; i++) {
            fabrik[i].verbrauche(strom); // oder energie
        }
    }
}
