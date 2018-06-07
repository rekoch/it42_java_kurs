/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.jsondb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Adresse {

    private final String vorname;
    private final String nachname;
    private final int plz;
    private final String ort;
    private final List<String> bemerkungen;

    public Adresse(String vorname, String nachname, int plz, String ort, String... bemerkungen) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.plz = plz;
        this.ort = ort;
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

    public List<String> getBemerkungen() {
        return Collections.unmodifiableList(bemerkungen);
    }

    @Override
    public String toString() {
        return vorname + " " + nachname + ", " + plz + " " + ort + "  " + bemerkungen;
    }
}
