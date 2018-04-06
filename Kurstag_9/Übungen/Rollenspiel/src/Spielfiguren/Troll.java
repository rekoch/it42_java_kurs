/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package Spielfiguren;

import Waffen.Keule;

public class Troll extends Spielfigur {
    public Troll(String name) {
        super(name);
    }

    @Override
    public double getSpielerKampfwert() {
        double kampfwert = super.getSpielerKampfwert();
        if (getAktiveWaffe() instanceof Keule){
            kampfwert += kampfwert/2;
        }
        return kampfwert;
    }
}
