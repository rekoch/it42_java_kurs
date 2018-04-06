/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package Spielfiguren;

import Ruestung.Ruestung;
import Ruestung.LeichteRuestung;
import Waffen.Bogen;

public class Goblin extends Spielfigur {
    public Goblin(String name) {
        super(name);
    }

    @Override
    public double getSpielerKampfwert() {
        double kampfwert = super.getSpielerKampfwert();
        if (getAktiveWaffe() instanceof Bogen){
            kampfwert += kampfwert/2;
        }
        return kampfwert;
    }

    @Override
    public void zieheRuestungAn(Ruestung ruestung) {
        if(ruestung instanceof LeichteRuestung) {
            super.zieheRuestungAn(ruestung);
        }
    }
}
