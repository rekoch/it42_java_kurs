/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag04.scope;

public class Zimmer {
    public double laenge; // public ist böse, aber auf diese Variable könnte man auch von Wohnung zugreifen
    private double breite; // Zugriff nur möglich von Methoden innerhalb dieser Klasse
    private double flaeche; // Zugriff nur möglich von Methoden innerhalb dieser Klasse
    private String farbe; // Zugriff nur möglich von Methoden innerhalb dieser Klasse

    public Zimmer(double laenge, double breite, String farbe) {
        this.laenge = laenge;
        this.breite = breite;
        this.farbe = farbe;
    }

    public Zimmer(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
        // flaeche bleibt hier uninitialisiert, also setzt die JVM den Wert defaultmässig auf den 0-Wert für double: 0.0
        // Farbe bleibt hier uninitialisiert, also setzt die JVM den Wert defaultmässig auf den 0-Wert für Referenzvariablen: null
    }

    public void berechneFlaeche() {
        double flaeche = laenge * breite; // diese Variable 'flaeche' "überdeckt" die obige Instanzvariable 'flaeche'
        this.flaeche = flaeche;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public String getFarbe() {
        return farbe;
    }
}
