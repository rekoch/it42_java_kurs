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
    //TODO
    // Passe den folgenden Pfad/den Dateinamen auf dein Notebook an.
    private static final String DATENBANK_DATEINAME = "C:\\Temp\\mk\\adressdatenbank.json";


    //TODO
    // Passe die drei folgenden Methoden in dieser Klasse so an, dass sie nicht mehr
    // "throws Exception" werfen, sondern gar nichts mehr. Stattdessen soll die
    // AdressDatenbankException, die zur Laufzeit geworfen werden koennte, abgefangen werden und
    // die darin enthaltene Fehlermeldung fuer den Benutzer sauber ausgegeben werden.


    public void speichereAdressen() throws Exception {
        Adresse adresse1 = new Adresse("Sybille", "Meyer", 3000, "Bern");
        Adresse adresse2 = new Adresse("Andreas", "Huber", 2503, "Biel", "Fussball-Fan", "Ferrari-Fahrer", "hat 8 Kinder");
        Adresse adresse3 = new Adresse("Hansueli", "Kohl", 3600, "Thun");

        List<Adresse> adressen = new ArrayList<>();
        adressen.add(adresse1);
        adressen.add(adresse2);
        adressen.add(adresse3);

        AdressDatenbank datenbank = new AdressDatenbank(DATENBANK_DATEINAME);
        datenbank.speichereAdressen(adressen);
    }


    public void ladeAdressen() throws Exception {
        AdressDatenbank datenbank = new AdressDatenbank(DATENBANK_DATEINAME);
        List<Adresse> adressen = datenbank.ladeAdressen();

        for (Adresse adresse : adressen) {
            System.out.println(adresse);
        }
    }


    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.speichereAdressen();
        main.ladeAdressen();
    }
}
