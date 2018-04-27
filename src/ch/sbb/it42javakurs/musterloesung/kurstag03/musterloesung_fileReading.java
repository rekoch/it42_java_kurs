/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */
package ch.sbb.it42javakurs.musterloesung.kurstag03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class musterloesung_fileReading {
    public static void main(String[] args) {
        final String fileName = "D://devsbb/code/phrasOMatText.txt";
        List<String> linesFromTextFile = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                linesFromTextFile.add(line);
            }
        } catch (Exception ex) {
            System.out.println("something went wrong.");
        }

        String[] wortListeEins = linesFromTextFile.get(0).split(",");
        String[] wortListeZwei = linesFromTextFile.get(1).split(",");
        ;
        String[] wortListeDrei = linesFromTextFile.get(2).split(",");
        ;

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