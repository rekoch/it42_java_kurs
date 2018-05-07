package ch.sbb.it42;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class DateManipulations {

    public static void main(String[] args) {
        new DateManipulations().run();
    }

    private void run() {
        //TODO: Wieso muss getIstance verwendet werden? Was ist das spezielle an diesem Aufruf?
        Calendar now = Calendar.getInstance();

        System.out.printf("Datumsausgabe: %s ", now);
        System.out.println();

        //TODO: ziehe 5 Tage vom Datum ab

        //TODO: gib das Datum in schön aus

        //TODO: ziehe eine Stunde vom Datum ab

        //TODO: gib das Datum in schön aus


        //TODO: Jetzt wirds etwas bunter. Diese API musst du googeln und findest sie nicht im Buch!
        //TODO: zeige auf, was an der "neuen" Java API (Java Time) sonst noch so cool ist. Die folgenden
        //Uebungen sollen dir dabei helfen.

        LocalTime onlyTime = LocalTime.now();
        System.out.printf("Datumsausgabe: %s ", onlyTime);
        System.out.println();

        //TODO: Setze die Zeit auf heute Mitternacht
        System.out.printf("Datumsausgabe: %s ", onlyTime);
        System.out.println();


        LocalDateTime dateAndTime = LocalDateTime.now();
        //TODO: Setze das Datum auf den 21. Januar 2012 um 14:33:21
        System.out.printf("Datumsausgabe: %s ", dateAndTime);
        System.out.println();

        //TODO: Berechne die Anzahl der Tage zwischen damals und heute und gib das aus


        //TODO: nun ein etwas sinnvollere Anwendung dafür. Mache das gleiche mit deinem Geburstag und berechne dein alter in Jahren, Monaten und Tagen und gib es aus

        //TODO: Kriegst du auch hin, wie viele Stunden alt du bist?

    }
}
