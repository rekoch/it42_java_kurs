/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.sbb.grossmann.christoph.it42.java_von_kopf_bis_fuss_s16;

/**
 *
 * @author ch.grossmann
 */
public class Phras_O_Mat {
    
    public static void main(String[] args) {
      
        String [] wortListeEins = {"verlässlich","webbasiert","erfolgsorientiert","allumfassende","clevere","kundenorientierte","pfadkritische","dynamische","konkurenzfähige","verteilte","zielgerichtete"};
        
        String [] wortListeZwei = {"gepowerte ","haftende ","Mehrwert-","zentriert ","geclusterte ","prosktive ","Out-of-the-Box ","positionierte ","vernetzte ","fokusierte ","kraftvolle ","geordnete ","geteilte ","kooperative ","beschleunigte ","Multi-Tier-","Enterprise-","B2B-","Frontend-"};
        
        String [] wortListeDrei = {"Schicht","Endstufe","Lösung","Architektur","Kernkompetenz","Strategie","Kooperation","Ausrichtung","Räumlichkeiten","Vision","Dimension","Mission"};
        
        
        int einsLänge = wortListeEins.length;

        int zweiLänge = wortListeZwei.length;

        int dreiLänge = wortListeDrei.length;
        
        
        int rand1 = (int) (Math.random() * einsLänge);
        
        int rand2 = (int) (Math.random() * zweiLänge);
        
        int rand3 = (int) (Math.random() * dreiLänge);
        
        
        String phrase = wortListeEins[rand1] + " " + wortListeZwei[rand2] + wortListeDrei[rand3];
        
        System.out.println("Was wir brauchen, ist eine " + phrase);
        
      
      
      
    }
    
}
