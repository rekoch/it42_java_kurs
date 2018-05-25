/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.lektion11.gluecksspiel;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Gluecksspiel {

    private final Random generator;

    public Gluecksspiel() {
        generator = new Random();
    }

    public abstract BigDecimal spielen(BigDecimal einsatz);


    protected final Random getGenerator() {
        return generator;
    }
}
