/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */
package ch.sbb.it42javakurs.musterloesung.kurstag03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class musterloesung_endless {
    public static void main(String[] args) {

        // drei Wortgruppen erstellen, aus denen ausgewählt wird
        String[] wortListeEins = { "24/7", "Multi-Tier", "Enterprise", "B2B", "erfolgsorientierte", "Frontend", "webbasierte", "allumfassende", "klevere", "fulltime", "pfadkritische", "dynamische" };

        String[] wortListeZwei = { "gepowerte", "haftende", "mehrwert", "orientierte", "zentrierte", "verteilte", "geclusterte", "Off-the-Shelft", "Out-of-the-Box", "positionierte", "vernetzte",
                "fokusierte", "kraftvolle", "geordnete", "zielgerichtete", "geteilte", "kooperative", "beschleunigte" };

        String[] wortListeDrei = { "Schicht", "Endstufe", "Lösung", "Architektur", "Kernkompetenz", "Strategie", "Kooperation", "Kundenorientierung", "Raumlichkeit", "Vision", "´Dimension",
                "Mission" };

        // ermitteln, wie viele Worte sich in jeder Liste befinden
        int einsLänge = wortListeEins.length;
        int zweiLänge = wortListeZwei.length;
        int dreiLänge = wortListeDrei.length;

        //Wieso soll der BufferedReader hier erstellt werden und nicht erst in der Schleife?
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean stillRunning = true;
        while (stillRunning) {
            // drei Zufallszahlen generieren, um Wörter aus den Listen herauszuziehen
            int rand1 = (int) (Math.random() * einsLänge);
            int rand2 = (int) (Math.random() * zweiLänge);
            int rand3 = (int) (Math.random() * dreiLänge);

            // eine Phrase zusammenbauen
            String phrase = wortListeEins[rand1] + " " + wortListeZwei[rand2] + " " + wortListeDrei[rand3];

            // eine Phrase ausgeben
            System.out.println("Was wir brauchen ist ein " + phrase);

            System.out.println("Nochmal? Gib 'N' ein fuer Abbruch.");
            String inputUser = null;
            try {
                inputUser = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            inputUser = inputUser.toLowerCase();

            if(inputUser.startsWith("n")){
                stillRunning = false;
            }
        }
    }
}