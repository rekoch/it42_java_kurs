/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.jsondb;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class AdressDatenbank {
    // benoetigt gson-2.8.4.jar im lib-Verzeichnis

    private final String datenbankDateiname;

    public AdressDatenbank(String datenbankDateiname) {
        this.datenbankDateiname = datenbankDateiname;
    }

    //TODO
    // Entferne bei den folgenden beiden Methoden das " throws Exception" und wirf im Code stattdessen
    // wenn noetig aussagekraeftigere AdressDatenbankExceptions zusammen mit einer sinnvollen
    // Fehlermeldung/Fehlerursache.
    // Beispiel: Wenn das Datenbank-File gar nicht existiert, aber bereits Adressen daraus gelesen
    // werden sollen, dann soll z.B. eine Fehlermeldung "Datei <blahblub.xyz> existiert noch nicht."
    // ausgegeben werden. Wenn die Datei nicht gelesen werden kann, weil das Format nicht korrekt ist und von
    // Gson nicht gelesen werden kann, dann soll ausgegeben werden: "Die Datei <...> hat ein unlesbares Format,
    // es steht kein gueltiges JSON drin.". Testen kannst du das, indem du mal kurz die Zeile
    // "writer.newLine();" auskommentierst. Wenn die Datei nicht geschrieben werden kann, weil Berechtigungen
    // fehlen, soll ausgegeben werden "Die Datei <xyz> darf wegen ungenuegenden Berechtigungen nicht
    // geschrieben werden." (oder aehnlich). Sorge dafuer, dass bei jeder Methode jeweils mindestens zwei
    // verschiedene Fehlermeldungen geliefert werden koennen.
    // Sorge auch dafuer, dass immer garantiert alle Writer und Reader sauber geschlossen werden.
    //
    // Commite und pushe deine Aenderungen auf deinen Branch
    // Kurstag_14\Uebungen\JsonDb\ch\sbb\it42\jsondb


    public void speichereAdressen(List<Adresse> adressen) throws Exception {
        Gson jsonConverter = new Gson();
        BufferedWriter writer = new BufferedWriter(new FileWriter(datenbankDateiname));
        for (Adresse adresse : adressen) {
            String json = jsonConverter.toJson(adresse);
            writer.write(json);
            writer.newLine(); // <-- das ist noetig, damit der BufferedReader readLine() verwenden kann!
        }
        writer.close();
    }


    public List<Adresse> ladeAdressen() throws Exception {
        Gson jsonConverter = new Gson();
        BufferedReader reader = new BufferedReader(new FileReader(datenbankDateiname));
        List<Adresse> adressen = new ArrayList<>();
        while (true) {
            String json = reader.readLine();
            if (json == null) {
                break;
            }
            Adresse adresse = jsonConverter.fromJson(json, Adresse.class);
            adressen.add(adresse);
        }
        reader.close();
        return adressen;
    }


    //TODO
    // Optionale Aufgabe (erst am Schluss machen, Antworten direkt hier reinschreiben):
    //
    // Was passiert, wenn du in Adresse.java einen Attributnamen änderst (z.B. "vorname" nach "vornamen")
    // und du nach dieser Aenderung eine Datenbank-Datei einliest, die noch *vor* dieser Aenderung
    // geschrieben wurde? (--> Ausprobieren!!)
    // Antwort: ...
    //
    // Was passiert, wenn du in einer bereits geschriebenen Datenbank-Datei einen Attributnamen aenderst, z.B.
    // "plz" nach "postleitzahl" und du eine solche Datenbank einliest?
    // Antwort: ...
    //
    // Was ist in beiden dieser Faelle das Problem?
    // Antwort: ...
    //
    // Warum ist das nicht nur ein Problem, sondern eventuell sogar eine gute Sache?
    // Antwort: ...
    //
    // Nenne mindestens einen Einsatzzweck, wo es dennoch Sinn machen koennte, so einen Ansatz (naemlich: Json
    // in eine lokale Datei zu schreiben) fuer die Datenspeicherung zu verwenden.
    // Antwort: ...
    //
    // [Super-Optional]:
    // Mit Gson "funktioniert alles automatisch" (mit den obigen Vor-/Nachteilen).
    // Gson kann aber auch so verwendet werden, dass man jedes gueltige JSON einlesen kann,
    // unabhaengig von der zu deserialisierenden Datenklasse (in unserem Fall: Adresse.java).
    // Mache dich im Internet schlau, wie das geht. Probiere kurz, diesen Ansatz fuer das Laden deiner
    // Adressen zu verwenden (nicht einchecken)!
    // Wie heissen die beiden wichtigsten Gson-Klassennamen, die du bei diesem Ansatz verwenden muesstest?
    // Antwort: ...
}
