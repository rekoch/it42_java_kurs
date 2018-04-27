/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag09.accessmodifier;

public class Main {

    public static void main(String[] args) {
        Haustier tier;

        tier = new Hauskatze("Filou");
        System.out.println("Der Name des Tieres lautet: " + tier.getName());
        tier.spiele();

        tier = new Hund();
        tier.spiele();

        tier = new Papagei("Hans");
        tier.spiele();
    }
}
