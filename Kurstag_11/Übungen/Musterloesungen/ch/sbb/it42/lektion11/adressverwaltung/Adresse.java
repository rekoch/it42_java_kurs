/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.lektion11.adressverwaltung;

public class Adresse {
    private String vorname;
    private String nachname;
    private String strasseNr;
    private int postleitzahl;
    private String ort;


    public Adresse(String vorname, String nachname, String strasseNr, int postleitzahl, String ort) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasseNr = strasseNr;
        this.postleitzahl = postleitzahl;
        this.ort = ort;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getStrasseNr() {
        return strasseNr;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public String getOrt() {
        return ort;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", strasseNr='" + strasseNr + '\'' +
                ", postleitzahl=" + postleitzahl +
                ", ort='" + ort + '\'' +
                '}';
    }



    // equals/hashCode implementieren, damit man auch Adressen aus der Adress-Verwaltung löschen kann, die man
    // zum Beispiel kopiert hat -> List#remove(Object) funktioniert mit equals!
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Adresse)) {
            return false;
        }

        Adresse adresse = (Adresse) o;

        if (postleitzahl != adresse.postleitzahl) {
            return false;
        }
        if (vorname != null ? !vorname.equals(adresse.vorname) : adresse.vorname != null) {
            return false;
        }
        if (nachname != null ? !nachname.equals(adresse.nachname) : adresse.nachname != null) {
            return false;
        }
        if (strasseNr != null ? !strasseNr.equals(adresse.strasseNr) : adresse.strasseNr != null) {
            return false;
        }
        return ort != null ? ort.equals(adresse.ort) : adresse.ort == null;
    }

    @Override
    public int hashCode() {
        int result = vorname != null ? vorname.hashCode() : 0;
        result = 31 * result + (nachname != null ? nachname.hashCode() : 0);
        result = 31 * result + (strasseNr != null ? strasseNr.hashCode() : 0);
        result = 31 * result + postleitzahl;
        result = 31 * result + (ort != null ? ort.hashCode() : 0);
        return result;
    }
}
