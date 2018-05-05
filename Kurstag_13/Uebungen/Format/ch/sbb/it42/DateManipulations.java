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

        //TODO: formatiere das ein wenig angenehmer
        System.out.printf("Formatiere mich hübsch: %s ", now);
        System.out.println();

        //TODO: ziehe 5 Tage vom Datum ab

        //TODO: gib das Datum in schön aus

        //TODO: ziehe eine Stunde vom Datum ab

        //TODO: gib das Datum in schön aus


        //Jetzt wirds etwas bunter. Diese API musst du googeln und findest sie nicht im Buch!

        LocalTime onlyTime = LocalTime.now();
        //TODO: formatiere das ein wenig angenehmer
        System.out.printf("Formatiere mich hübsch: %s ", onlyTime);
        System.out.println();

        //TODO: Setze die Zeit auf heute Mitternacht
        //TODO: gib es in schön aus
        System.out.printf("Formatiere mich hübsch: %s ", onlyTime);
        System.out.println();


        LocalDateTime dateAndTime = LocalDateTime.now();
        //TODO: Setze das Datum auf den 21. Januar 2012 um 14:33:21
        //TODO: gib es in schön aus
        System.out.printf("Formatiere mich hübsch: %s ", dateAndTime);
        System.out.println();

        //TODO: Berechne die Anzahl der Tage zwischen damals und heute und gib das aus


        //TODO: nun ein etwas sinnvollere Anwendung dafür. Mache das gleiche mit deinem Geburstag und berechne dein alter in Jahren, Monaten und Tagen und gib es aus

        //TODO: Kriegst du auch hin, wie viele Stunden alt du bist?

    }
}
