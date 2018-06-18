/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.lektion11.adressverwaltung;

import java.util.ArrayList;
import java.util.List;

public class AdressVerwaltung {
    private final List<Adresse> adressen = new ArrayList<>();


    public void fuegeHinzu(Adresse adresse) {
        adressen.add(adresse);
    }

    public List<Adresse> findeAdressenMitNachname(String nachname) {
        List<Adresse> gewuenschteAdressen = new ArrayList<>();
        for (Adresse a : adressen) {
            if (a.getNachname().equalsIgnoreCase(nachname)) {
                gewuenschteAdressen.add(a);
            }
        }
        return gewuenschteAdressen;
    }

    public void entferneAdresse(Adresse adresse) {
        boolean warVorhanden = adressen.remove(adresse);
        if (!warVorhanden) {
            System.err.println("Achtung: adressKartei.Adresse "+ adresse+" war gar nicht in der Verwaltung!");
        }
    }

    public int getAnzahlAdressen() {
        return adressen.size();
    }
}
