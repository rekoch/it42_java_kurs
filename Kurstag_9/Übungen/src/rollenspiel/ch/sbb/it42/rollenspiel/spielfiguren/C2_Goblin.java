/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.rollenspiel.spielfiguren;

import ch.sbb.it42.rollenspiel.C1_Spielfigur;

public class C2_Goblin extends C1_Spielfigur {
    double HP = super.HP;
    private double locVSchaden;

    public C2_Goblin() {
        super();
    }


    public void SchadenErhalten(double schaden){
        locVSchaden = schaden;
        System.out.println("Schaden erteilt: " + locVSchaden);
        System.out.println("HP: " + (HP - locVSchaden));
    }
}
