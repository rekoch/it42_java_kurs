/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.musterloesung.kurstag11.adressverwaltung;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Adresse adresse;

        AdressVerwaltung av = new AdressVerwaltung();

        System.out.println("Adressverwaltung enthaelt momentan "+av.getAnzahlAdressen()+" Adressen");

        adresse = new Adresse("Hans", "Meier", "Froehnstrasse 4", 4711, "XYZ");
        av.fuegeHinzu(adresse);

        adresse = new Adresse("Silvia", "Honegger", "Xstrasse 4", 3030, "Z");
        av.fuegeHinzu(adresse);


        System.out.println("Adressverwaltung enthaelt momentan "+av.getAnzahlAdressen()+" Adressen");

        List<Adresse> dieMeiers = av.findeAdressenMitNachname("meieR");

        for (Adresse meier : dieMeiers) {
            av.entferneAdresse(meier);
        }

        System.out.println("Adressverwaltung enthaelt momentan "+av.getAnzahlAdressen()+" Adressen");

    }
}
