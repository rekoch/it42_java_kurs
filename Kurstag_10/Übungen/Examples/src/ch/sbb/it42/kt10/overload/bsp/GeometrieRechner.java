/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.kt10.overload.bsp;

public class GeometrieRechner {


    public double getFlaeche(Kreis kreis) {
        System.out.println("Verwende getFlaeche(Kreis)...");
        return kreis.getRadius() * kreis.getRadius() * Math.PI;
    }


    public int getFlaeche(Rechteck rechteck) {
        System.out.println("Verwende getFlaeche(Rechteck)...");
        return rechteck.getBreite() * rechteck.getLaenge();
    }


    public double getFlaeche(Rechteck rechteck, Kreis kreis) {
        System.out.println("Verwende getFlaeche(Rechteck, Kreis)...");
        return rechteck.getBreite() * rechteck.getLaenge() + kreis.getRadius() * kreis.getRadius() * Math.PI;
    }


    public static void main(String[] args) {
        double flaeche;
        GeometrieRechner rechner = new GeometrieRechner();

        Rechteck rechteck = new Rechteck(2, 3);
        Kreis kreis = new Kreis(1.0);


        flaeche = rechner.getFlaeche(kreis);
        System.out.println("Die Flaeche ist: " + flaeche);

        flaeche = rechner.getFlaeche(rechteck);
        System.out.println("Die Flaeche ist: " + flaeche);

        flaeche = rechner.getFlaeche(rechteck, kreis);
        System.out.println("Die Flaeche ist: " + flaeche);
    }
}
