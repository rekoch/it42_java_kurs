/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.hotel;

import java.util.Calendar;

public class Datum {

    private final int tagNummer; // Die Tag-Nummer wird berechnet als die Anzahl Tage zum Beispiel ab 1.1.2000

    public Datum(int tagNummer) {
        this.tagNummer = tagNummer;
    }



    public boolean kommtVor(Datum anderesDatum) {
        return tagNummer < anderesDatum.tagNummer;
    }

    public int getTagNummer() {
        return tagNummer;
    }


    @Override
    public String toString() {
        return String.valueOf(tagNummer);
    }


    // Nur bis hier ist wichtig.
    // ---------------------------------------------------------------------------------------
    // Der folgende Teil zeigt auf, wie man einfach von einem "normalen" Datum zu unserer Repraesentation eines Datums kommt:

    private static final double MILLISEKUNDEN_PRO_TAG = 24L * 3600L * 1000L;

    // Dieser Konstruktor war nicht Teil der Aufgabe, er steht nur der Vollstaendigkeit halber hier:
    // Er zeigt, wie man ein richtiges Datum, z.B.  "31.12.2017", in unser Datum konvertieren könnte.
    public Datum(String datumString) {
        Calendar ersterJanuar2000 = convertToCalendar("01.01.2000");
        Calendar datum = convertToCalendar(datumString);

        long differenzZumErstenJanuar2000InMillisekunden = (datum.getTime().getTime() - ersterJanuar2000.getTime().getTime());
        tagNummer = (int) Math.round(differenzZumErstenJanuar2000InMillisekunden / MILLISEKUNDEN_PRO_TAG); // runden wegen Schaltsekunden etc.
    }

    private static Calendar convertToCalendar(String datumString) {
        Calendar datum = Calendar.getInstance();
        datum.set(Calendar.YEAR, Integer.parseInt(datumString.substring(6, 4)));
        datum.set(Calendar.MONTH, Integer.parseInt(datumString.substring(3, 2)));
        datum.set(Calendar.DAY_OF_MONTH, Integer.parseInt(datumString.substring(0, 2)));
        return datum;
    }
}
