/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.lektion11.gluecksspiel;

import java.math.BigDecimal;

public class Roulette extends Gluecksspiel {

    private static final double EIN_SIEBENUNDDREISSIGSTEL = 1.0 / 37.0;

    @Override
    public BigDecimal spielen(BigDecimal einsatz) {
        if (getGenerator().nextDouble() < EIN_SIEBENUNDDREISSIGSTEL) { // WSK, dass genau auf die richtige von 0-36 Zahlen gesetzt wurde
            return einsatz.multiply(new BigDecimal(36.0)); // man bekommt dennoch nur das 36-fache
        } else {
            return BigDecimal.ZERO;
        }
    }
}