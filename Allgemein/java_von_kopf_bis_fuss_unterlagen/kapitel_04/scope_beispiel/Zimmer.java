/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package kapitel_04.scope_beispiel;

public class Zimmer {
    public double laenge; // public ist b�se, aber auf diese Variable k�nnte man auch von Wohnung zugreifen
    private double breite; // Zugriff nur m�glich von Methoden innerhalb dieser Klasse
    private double flaeche; // Zugriff nur m�glich von Methoden innerhalb dieser Klasse
    private String farbe; // Zugriff nur m�glich von Methoden innerhalb dieser Klasse

    public Zimmer(double laenge, double breite, String farbe) {
        this.laenge = laenge;
        this.breite = breite;
        this.farbe = farbe;
    }

    public Zimmer(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
        // flaeche bleibt hier uninitialisiert, also setzt die JVM den Wert defaultm�ssig auf den 0-Wert f�r double: 0.0
        // Farbe bleibt hier uninitialisiert, also setzt die JVM den Wert defaultm�ssig auf den 0-Wert f�r Referenzvariablen: null
    }

    public void berechneFlaeche() {
        double flaeche = laenge * breite; // diese Variable 'flaeche' "�berdeckt" die obige Instanzvariable 'flaeche'
        this.flaeche = flaeche;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public String getFarbe() {
        return farbe;
    }
}
