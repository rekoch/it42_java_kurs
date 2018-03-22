/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.abstr;

public class Staubsauger extends Elektrogeraet{

    @Override
    public void starten() {
        System.out.println("Staubsauger saugt...");
    }
}
