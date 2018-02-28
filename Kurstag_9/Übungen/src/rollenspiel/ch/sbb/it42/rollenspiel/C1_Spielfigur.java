/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.rollenspiel;

import ch.sbb.it42.rollenspiel.waffen.C2_Keule;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class C1_Spielfigur {

    public static final double HP = 100.00;
    private static String Name;
    private static String Race;


    public static String getName() {
        return Name;
    }

    public static String getRace() {
        return Race;
    }

    public static void setName(String name) {
        C1_Spielfigur.Name = name;
    }

    public static void setRace(String race) {
        C1_Spielfigur.Race = race;
    }


    public int getKampfwert(){
        double random = ThreadLocalRandom.current().nextDouble(0.9, 1.1);
        return (int) (C1_Weapon.getDmg() * random);
    }

    public static Double getHP() {
        return HP;
    }
}
