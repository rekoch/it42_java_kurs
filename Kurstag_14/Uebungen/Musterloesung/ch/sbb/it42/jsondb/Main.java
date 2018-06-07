/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.jsondb;

import java.util.ArrayList;
import java.util.List;


/**
 * Zeigt die Verwendung der AdressDatenbank-Klasse auf.
 */
public class Main {
    private static final String DATENBANK_DATEINAME = "C:\\Temp\\adressdatenbank.json";


    public void speichereAdressen() {
        Adresse adresse1 = new Adresse("Sybille", "Meyer", 3000, "Bern");
        Adresse adresse2 = new Adresse("Andreas", "Huber", 2503, "Biel", "Fussball-Fan", "Ferrari-Fahrer", "hat 8 Kinder");
        Adresse adresse3 = new Adresse("Hansueli", "Kohl", 3600, "Thun");

        List<Adresse> adressen = new ArrayList<>();
        adressen.add(adresse1);
        adressen.add(adresse2);
        adressen.add(adresse3);

        AdressDatenbank datenbank = new AdressDatenbank(DATENBANK_DATEINAME);
        try {
            System.out.println("Speichere Adressen...");
            datenbank.speichereAdressen(adressen);
        } catch (AdressDatenbankException ex) {
            System.err.println("Beim Speichern ist ein Fehler aufgetreten. Grund: " + ex.getFehlertext() + "\n");
            ex.printStackTrace();
        }
    }


    public void ladeAdressen() {
        AdressDatenbank datenbank = new AdressDatenbank(DATENBANK_DATEINAME);

        try {
            System.out.println("Lade Adressen...");
            List<Adresse> adressen = datenbank.ladeAdressen();
            for (Adresse adresse : adressen) {
                System.out.println(adresse);
            }
        } catch (AdressDatenbankException ex) {
            System.err.println("Beim Laden ist ein Fehler aufgetreten. Grund: " + ex.getFehlertext() + "\n");
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.speichereAdressen();
        main.ladeAdressen();
    }
}
