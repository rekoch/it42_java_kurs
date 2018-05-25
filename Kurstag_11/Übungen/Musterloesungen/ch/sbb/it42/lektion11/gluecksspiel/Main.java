/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.lektion11.gluecksspiel;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Gluecksspiel gluecksspiel1 = new Muenzwurf();
        Gluecksspiel gluecksspiel2 = new Roulette();

        for (int i = 0; i < 100; i++) {
            BigDecimal einsatz = BigDecimal.valueOf(100.0);

            BigDecimal rueckzahlung = gluecksspiel1.spielen(einsatz);
            System.out.println("Du hast im 1. Glueckspiel " + einsatz + " Fr. eingesetzt und " + rueckzahlung + " Fr. bekommen.");
        }


        for (int i = 0; i < 100; i++) {
            BigDecimal einsatz = BigDecimal.valueOf(100.0);

            BigDecimal rueckzahlung = gluecksspiel2.spielen(einsatz);
            System.out.println("Du hast im 2. Glueckspiel " + einsatz + " Fr. eingesetzt und " + rueckzahlung + " Fr. bekommen.");
        }
    }
}
