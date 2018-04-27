/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.musterloesung.kurstag03;

public class BierLied {
    public static void main(String[] args) {
        int bierAnzahl = 99;
        String wort = "Flaschen";
        while (bierAnzahl > 0) { // hier muss man NICHT >= schreiben, weil Spezialfall bierAnzahl==0 schon unten
                                 // mit "Kein Bier im Kühlschrank" abgehandelt wird.
            System.out.println(bierAnzahl + " " + wort + " Bier im Kühlschrank");
            System.out.println(bierAnzahl + " " + wort + " Bier.");
            System.out.println("Nimm eins raus.");
            System.out.println("Reich es herum.");
            bierAnzahl = bierAnzahl - 1;
            if (bierAnzahl == 1) { // Bedingung hierher verschoben, damit schon bei der naechsten
                wort = "Flasche";  // Ausgabe (Zeile 16) 'Flasche' verwendet wird, wenn bierAnzahl 1 ist.
            }
            if (bierAnzahl > 0) {
                System.out.println(bierAnzahl + " " + wort + " Bier im Kühlschrank");
            } else {
                System.out.println("Kein Bier mehr im Kühlschrank");
            }
        }
    }
}


