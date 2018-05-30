/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.jsondb;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdressDatenbank {
    // benoetigt gson-2.8.4.jar im lib-Verzeichnis

    private final String datenbankDateiname;

    public AdressDatenbank(String datenbankDateiname) {
        this.datenbankDateiname = datenbankDateiname;
    }

    public void speichereAdressen(List<Adresse> adressen) { // throws AdressDatenbankException kann man machen, ist aber nicht noetig!
        Gson jsonConverter = new Gson();
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(datenbankDateiname));
            for (Adresse adresse : adressen) {
                String json = jsonConverter.toJson(adresse);
                writer.write(json);
                writer.newLine(); // <-- das ist noetig, damit der BufferedReader readLine() verwenden kann!
            }
        } catch (FileNotFoundException fnfEx) {
            // Es kann nicht unterschieden werden zwischen z.B. nicht vorhandenem Verzeichnis oder fehlenden
            // Schreib-Berechtigungen. Deshalb kann es hier Sinn machen, die urspruengliche Fehlermeldung
            // mitauszugeben.
            throw new AdressDatenbankException("Dateiproblem mit " + fnfEx.getMessage(), fnfEx);
        } catch (IOException ioEx) {
            throw new AdressDatenbankException("Beim Speichern ist ein Fehler aufgetreten", ioEx);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    // Auch beim Schliessen kann wieder ein Problem auftreten. Exception hier dennoch nicht
                    // weiterreichen. Grund: finally wird auch beim rethrowen einer anderen Exception
                    // durchlaufen, und dann würde die urspruengliche durch diese Exception hier "verdeckt".
                    System.err.println("Schliessen fehlgeschlagen.");
                }
            }
        }
    }


    public List<Adresse> ladeAdressen() throws AdressDatenbankException {// throws-Klausel ist nicht unbedingt noetig!
        Gson jsonConverter = new Gson();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(datenbankDateiname));
            List<Adresse> adressen = new ArrayList<>();
            while (true) {
                String json = reader.readLine();
                if (json == null) {
                    break;
                }
                Adresse adresse = jsonConverter.fromJson(json, Adresse.class);
                adressen.add(adresse);
            }
            return adressen;
        } catch (JsonSyntaxException mjEx) {
            throw new AdressDatenbankException("Die Datei " + datenbankDateiname + " enthaelt mindestens eine Zeile mit einem ungueltigen oder falsch formatierten JSON-Objekt.", mjEx);
        } catch (FileNotFoundException fnfEx) {
            throw new AdressDatenbankException("Datei " + datenbankDateiname + " existiert (noch) nicht.", fnfEx);
        } catch (IOException ioEx) {
            throw new AdressDatenbankException("Konnte keine weitere Zeile aus der Datei " + datenbankDateiname + " lesen.", ioEx);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new AdressDatenbankException("Datei " + datenbankDateiname + " konnte nach dem Lesen nicht mehr .", e);

                }
            }
        }
    }


    //
    // Was passiert, wenn du in Adresse.java einen Attributnamen änderst (z.B. "vorname" nach "vornamen")
    // und du nach dieser Aenderung eine Datenbank-Datei einliest, die noch *vor* dieser Aenderung
    // geschrieben wurde? (--> Ausprobieren!!)
    // Antwort: Die Attribute werden nicht gelesen und behalten stattdessen ihren null-Wert.
    //
    // Was passiert, wenn du in einer bereits geschriebenen Datenbank-Datei einen Attributnamen aenderst, z.B.
    // "plz" nach "postleitzahl" und du eine solche Datenbank einliest?
    // Antwort: Das geaenderte Attribut in der Datei wird ueberlesen, plz erhaelt wiederum null als Wert.
    //
    // Was ist in beiden dieser Faelle das Problem?
    // Antwort: GSON uerprueft defaultmaessig nicht, ob die Inputdaten mit den abzufuellenden JSON-Daten
    // uebereinstimmen.
    //
    // Warum ist das nicht nur ein Problem, sondern eventuell sogar eine gute Sache?
    // Antwort: Bei Erweiterungen der Modellklasse koennten solche Effekte gewuenscht sein, weil man dann eine
    // solche Erweiterung ohne umstaendliche Datenmigration machen kann.
    //
    // Nenne mindestens einen Einsatzzweck, wo es dennoch Sinn machen koennte, so einen Ansatz (naemlich: Json
    // in eine lokale Datei zu schreiben) fuer die Datenspeicherung zu verwenden.
    // Antwort: Generell bei Daten, bei denen es nicht so schlimm ist, wenn sie nicht in allen Faellen korrekt
    // zurueckgelesen werden. Beispiel: Programmeinstellungen eines Benutzers.
    //
    // [Super-Optional]:
    // Mit Gson "funktioniert alles automatisch" (mit den obigen Vor-/Nachteilen).
    // Gson kann aber auch so verwendet werden, dass man jedes gueltige JSON einlesen kann,
    // unabhaengig von der zu deserialisierenden Datenklasse (in unserem Fall: Adresse.java).
    // Mache dich im Internet schlau, wie das geht. Probiere kurz, diesen Ansatz fuer das Laden deiner
    // Adressen zu verwenden (nicht einchecken)!
    // Wie heissen die beiden wichtigsten Gson-Klassennamen, die du bei diesem Ansatz verwenden muesstest?
    // Antwort: JsonObject, JsonArray usw.
}
