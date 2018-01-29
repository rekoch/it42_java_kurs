/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gast gast = new Gast();

        System.out.println("_-_-_-Menu-_-_-_");
        System.out.println("1: Doppelzimmer buchen");
        System.out.println("2: Einzelzimmer buchen");
        System.out.println("3: Infos über ein Zimmer");
        System.out.println("4: Geld aufladen");
        int auswahl = sc.nextInt();
        switch (auswahl) {
            case 1:
                System.out.println("Geben sie Ihren Namen ein: ");
                String name = sc.nextLine();
                gast.setName(name);
                System.out.println("Geben sie Ihren Nachname ein: ");
                String nachname = sc.nextLine();
                gast.setNachname(nachname);
        }
    }
}
