/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.sbb.grossmann.christoph.it42.java_von_kopf_bis_fuss_s16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ch.grossmann
 */
public class Phras_O_Mat_ArrayList_Endless_FileReading {
    
    public static void main(String[] args) {
        
        final String fileName = "/Users/ch.grossmann/NetBeansProjects/CHG/it42_java_kurs/Kurstag_3/Übungen/it42_kurstag_3/src/ch/sbb/grossmann/christoph/it42/java_von_kopf_bis_fuss_s16/Phras-O-Mat-Text";
        List<String> linesFromTextFile = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                linesFromTextFile.add(line);
            }
        } catch (Exception ex){
            System.out.println("something went wrong.");
        }
        
        String[] wortListeEins = linesFromTextFile.get(0).split(",");
        String[] wortListeZwei = linesFromTextFile.get(1).split(",");
        String[] wortListeDrei = linesFromTextFile.get(2).split(",");
        
        
        int einsLänge = wortListeEins.length;
        int zweiLänge = wortListeZwei.length;
        int dreiLänge = wortListeDrei.length;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean stillRunning = true;
        while (stillRunning) { 
             
        int rand1 = (int)(Math.random()* einsLänge);
        int rand2 = (int)(Math.random()* zweiLänge);
        int rand3 = (int)(Math.random()* dreiLänge);
        
        String phrase = wortListeEins[rand1] + " " + wortListeZwei[rand2] + " " + wortListeDrei[rand3];
        
        System.out.println("Was wir brauchen ist eine " + phrase);
        
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
/*
Lies nun bitte die Seiten aus dem Buch von 11-26 durch. Mache dazu auch 
die Übungen, die aufgeführt sind. Commite / Pushe bitte alles entsprechend auf GIT.

Zusätzlicher Auftrag:

Wenn dir die Aufgabe Phras-O-Mat zu einfach ist, dann eisungen erweitere 
sie wie folgt (du kannst auch nur eine der nachfolgenden Erweiterungen umsetzen):

1. Anstelle von Arrays verwende eine ArrayList → was verändert sich im Code alles?

Objekte / Datentypen und Referenztypen

2. Anstelle von fix codierten Text-Bausteinen soll das Programm diese aus 
einem zusätzlichen File lesen und verarbeiten.

e versenken Teil 1

3. Das Programm soll es dem Benutzer ermöglichen, nen lernen, mehrere Schiffe 
Zufalls versenken - Texte zu Teil generieren. 2 Nur auf ein bestimmte Aktion 
wird das Programm beendet.

4. Bei Fehlern gib eine saubere Fehlermeldung aus und weise den Benutzer hin, 
was er machen kann (Exception Objekts Handling)
*/