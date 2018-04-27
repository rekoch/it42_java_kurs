/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */
package ch.sbb.it42javakurs.musterloesung.kurstag03;

class musterloesung_buch {
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

        // drei Zufallszahlen generieren, um Wörter aus den Listen herauszuziehen
        int rand1 = (int) (Math.random() * einsLänge);
        int rand2 = (int) (Math.random() * zweiLänge);
        int rand3 = (int) (Math.random() * dreiLänge);

        // eine Phrase zusammenbauen
        String phrase = wortListeEins[rand1] + " " + wortListeZwei[rand2] + " " + wortListeDrei[rand3];

        // eine Phrase ausgeben
        System.out.println("Was wir brauchen ist ein " + phrase);
    }
}