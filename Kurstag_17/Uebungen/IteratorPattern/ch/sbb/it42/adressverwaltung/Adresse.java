/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.adressverwaltung;

public class Adresse {

    private final String vorname;
    private final String nachname;
    private final int plz;
    private final String ort;

    public Adresse(String vorname, String nachname, int plz, String ort) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.plz = plz;
        this.ort = ort;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", plz=" + plz +
                ", ort='" + ort +
                '}';
    }
}
