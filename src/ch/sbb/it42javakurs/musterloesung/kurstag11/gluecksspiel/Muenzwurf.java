/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.musterloesung.kurstag11.gluecksspiel;

import java.math.BigDecimal;

public class Muenzwurf extends Gluecksspiel {

    @Override
    public BigDecimal spielen(BigDecimal einsatz) {
        if (getGenerator().nextDouble() < 0.5) {
            return BigDecimal.ZERO;
        }
        else {
            return einsatz.multiply(new BigDecimal(2.0));
        }
    }
}
