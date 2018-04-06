/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package Spielfiguren;

import Ruestung.Ruestung;
import Ruestung.LeichteRuestung;
import Waffen.Bogen;

public class Elf extends Spielfigur {
    private int zauberwert;

    public Elf(String name, int zauberwert) {
        super(name);
        this.zauberwert = zauberwert;
    }

    @Override
    public double getSpielerKampfwert() {
        double kampfwert = super.getSpielerKampfwert() + zauberwert/2;
        if(getAktiveWaffe() instanceof Bogen){
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

    public int getZauberwert() {
        return zauberwert;
    }

    public void setZauberwert(int zauberwert) {
        this.zauberwert = zauberwert;
    }
}
