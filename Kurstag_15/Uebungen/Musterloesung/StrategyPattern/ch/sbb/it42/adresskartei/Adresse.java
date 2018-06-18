/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.adresskartei;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Adresse {

    private final String vorname;
    private final String nachname;
    private final int plz;
    private final String ort;
    private final int geburtsjahr;
    private final List<String> bemerkungen;

    public Adresse(String vorname, String nachname, int plz, String ort, int geburtsjahr, String... bemerkungen) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.plz = plz;
        this.ort = ort;
        this.geburtsjahr = geburtsjahr;
        this.bemerkungen = Arrays.asList(bemerkungen);
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

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public List<String> getBemerkungen() {
        return Collections.unmodifiableList(bemerkungen);
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", plz=" + plz +
                ", ort='" + ort + '\'' +
                ", geburtsjahr=" + geburtsjahr +
                ", bemerkungen=" + bemerkungen +
                '}';
    }
}
