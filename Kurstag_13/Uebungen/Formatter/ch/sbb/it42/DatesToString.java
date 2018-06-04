package ch.sbb.it42;

import java.util.Calendar;
import java.util.Date;

public class DatesToString {
    public static void main(String[] args) {
        new DatesToString().run();
    }

    private void run() {
        Date now = new Date();

        System.out.println("ich bin noch nicht so hübsch wie ich sein könnte: " + now);

        //TODO: Das Datum soll nur den Wochentag anzeigen
        System.out.printf("%tA", now);

        //TODO: Das Datum soll folgendes Format anzeigen: Tag Monat Jahr
        System.out.printf("\n%1$tA, %1$tm, %1$ty", now);

        //TODO: Das Datum soll folgendes Format anzeigen: Tag"." Monat Stunde":"Minute":"
        System.out.printf("\n%1$td.%1$tm %1$tH:%1$tM", now);

        //TODO: weitere kreative Vorschläge?

    }
}
