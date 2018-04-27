/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */
package ch.sbb.it42javakurs.musterloesung.kurstag03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class musterloesung_arrayList {
    public static void main(String[] args) {

        // drei Wortgruppen erstellen, aus denen ausgewählt wird
        List<String> wortListeEins = new ArrayList<>();
        wortListeEins.add("24/7");
        wortListeEins.add("Multi-Tier");
        wortListeEins.add("Enterprise");
        wortListeEins.add("B2B");
        wortListeEins.add("erfolgsorientierte");
        wortListeEins.add("Frontend");
        wortListeEins.add("webbasierte");
        wortListeEins.add("allumfassende");
        wortListeEins.add("klevere");
        wortListeEins.add("fulltime");
        wortListeEins.add("pfadkritische");
        wortListeEins.add("dynamische");

        List<String> wortListeZwei = new ArrayList<>();
        wortListeZwei.add("gepowerte");
        wortListeZwei.add("haftende");
        wortListeZwei.add("mehrwert");
        wortListeZwei.add("orientierte");
        wortListeZwei.add("zentrierte");
        wortListeZwei.add("verteilte");
        wortListeZwei.add("geclusterte");
        wortListeZwei.add("Off-the-Shelft");
        wortListeZwei.add("Out-of-the-Box");
        wortListeZwei.add("positionierte");
        wortListeZwei.add("fokusierte");
        wortListeZwei.add("kraftvolle");
        wortListeZwei.add("zielgerichtete");
        wortListeZwei.add("geteilte");
        wortListeZwei.add("kooperative");
        wortListeZwei.add("beschleunigte");

        List<String> wortListeDrei = new ArrayList<>(
                Arrays.asList("Schicht", "Endstufe", "Lösung", "Architektur", "Kernkompetenz", "Strategie", "Kooperation", "Kundenorientierung", "Raumlichkeit", "Vision", "´Dimension",
                        "Mission"));

        // ermitteln, wie viele Worte sich in jeder Liste befinden
        int einsLänge = wortListeEins.size();
        int zweiLänge = wortListeZwei.size();
        int dreiLänge = wortListeDrei.size();

        // drei Zufallszahlen generieren, um Wörter aus den Listen herauszuziehen
        int rand1 = (int) (Math.random() * einsLänge);
        int rand2 = (int) (Math.random() * zweiLänge);
        int rand3 = (int) (Math.random() * dreiLänge);

        // eine Phrase zusammenbauen
        String phrase = wortListeEins.get(rand1) + " " + wortListeZwei.get(rand2) + " " + wortListeDrei.get(rand3);

        // eine Phrase ausgeben
        System.out.println("Was wir brauchen ist ein " + phrase);
    }
}