/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.sbb.grossmann.christoph.it42.java_von_kopf_bis_fuss_s16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ch.grossmann
 */
public class Phras_O_Mat_ArrayList_Endless {
    
    public static void main(String[] args) {
        
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
        wortListeZwei.add("positionierte");
        wortListeZwei.add("fokusierte");
        wortListeZwei.add("kraftvolle");
        wortListeZwei.add("zielgerichtete");
        wortListeZwei.add("geteilte");
        wortListeZwei.add("kooperative");
        wortListeZwei.add("beschleunigte");
        
        
        List<String> wortListeDrei = new ArrayList<>();
        wortListeDrei.add("Schicht");
        wortListeDrei.add("Endstufe");
        wortListeDrei.add("Lösung");
        wortListeDrei.add("Architektur");
        wortListeDrei.add("Kernkompetenz");
        wortListeDrei.add("Strategie");
        wortListeDrei.add("Kooperation");
        wortListeDrei.add("Kundenorientierung");
        wortListeDrei.add("Raeumlichkeit");
        wortListeDrei.add("Vision");
        wortListeDrei.add("Dimension");
        wortListeDrei.add("Mission");
        
        
        int einsLänge = wortListeEins.size();
        int zweiLänge = wortListeEins.size();
        int dreiLänge = wortListeEins.size();
        
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean stillRunning = true;
        while (stillRunning) {  
            
             
        int rand1 = (int)(Math.random()* einsLänge);
        int rand2 = (int)(Math.random()* zweiLänge);
        int rand3 = (int)(Math.random()* dreiLänge);
        
        String phrase = wortListeEins.get(rand1) + " " + wortListeZwei.get(rand2) + " " + wortListeDrei.get(rand3);
        
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