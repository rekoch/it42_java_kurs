/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.hotel;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Initialisierung der Objekte, nur am Anfang:
        Zimmer zimmer1 = new Zimmer(2, "90.00", Zimmer.FEATURE_MEERSICHT, Zimmer.FEATURE_MINIBAR);
        Zimmer zimmer2 = new Zimmer(2, "70.00", Zimmer.FEATURE_MINIBAR);
        Zimmer zimmer3 = new Zimmer(1, "50.00");

        Hotel hotel = new Hotel(zimmer1, zimmer2, zimmer3);

        Main main = new Main();
        main.zeigeVerwendungDerHotelReservation(hotel);
    }

    private void zeigeVerwendungDerHotelReservation(Hotel hotel) {
        Zeitraum zeitraum; // diese temporäre Variable wird immer wiederverwendet

        Person hansMueller = new Person("Hans", "Mueller");
        Gaeste einzelgast = new Gaeste(hansMueller);  // Einzelgast

        Person fritzFrei = new Person("Fritz", "Frei");
        Person fridaFrei = new Person("Frida", "Frei");
        Gaeste paar = new Gaeste(fritzFrei, fridaFrei);     // Paar

        Person ernstAmmann = new Person("Ernst", "Ammann");
        Person annaBauer = new Person("Anna", "Bauer");
        Person viktorCotti = new Person("Viktor", "Cotti");
        Person emmaDubler = new Person("Emma", "Dubler");
        Gaeste gruppe = new Gaeste(ernstAmmann, annaBauer, viktorCotti, emmaDubler);

        // Am Tag 1 kommt der erste Einzelgast und will ein Zimmer mit Meerblick von Tag 1 bis Tag 7
        zeitraum = new Zeitraum(new Datum(1), new Datum(7));
        Buchung buchung1 = hotel.erstelleBuchung(zeitraum, einzelgast, Zimmer.FEATURE_MEERSICHT);

        if (buchung1.istOkay()) { // es gibt also noch ein solches freies Zimmer
            // er bucht, zahlt und checkt ein
            hotel.bestaetige(buchung1);
            hansMueller.bezahle(buchung1);
            hotel.checkIn(hansMueller, buchung1);
            // check-out modellieren wir nicht, wir werfen ihn raus, wenn er am Ende der Buchungsperiode nicht eh selber geht - und bezahlt hat er ja schon
        }

        // Am Tag 2 bucht ein Ehepaar für Übernachtungen ab Tag 3 bis Tag 5, checkt also noch nicht ein, und zahlt auch noch nicht
        Datum tag2 = new Datum(2);
        zeitraum = new Zeitraum(3, 5);
        Buchung buchung2 = hotel.erstelleBuchung(zeitraum, paar);

        if (buchung2.istOkay()) {
            hotel.bestaetige(buchung2);
            // checkin ginge jetzt noch nicht, weil noch nicht bezahlt wurde

            Datum tag3 = new Datum(3);
            fritzFrei.bezahle(buchung2);
            // jetzt können die beiden einchecken:
            hotel.checkIn(fritzFrei, buchung2);
            hotel.checkIn(fridaFrei, buchung2);
        }


        // Jetzt schaut der Hotelier, welche Zimmer denn vom 4. auf den 5. Tag noch frei sind:
        List<Zimmer> freieZimmer = hotel.getFreieZimmer(new Zeitraum(4, 5));
        // im Array 'freieZimmer' ist jetzt nur das Zimmer 3 drin

        // und in einer Woche?
        freieZimmer = hotel.getFreieZimmer(new Zeitraum(10, 11));
        // hier wären im Array alle drei Zimmer drin


        // Eine Gruppe kommt ebenfalls noch am 3. Tag und will 1x übernachten
        zeitraum = new Zeitraum(3, 4);
        Buchung buchung3 = hotel.erstelleBuchung(zeitraum, gruppe);

        if (!buchung3.istOkay()) {
            // hoppla, das geht nicht, es gibt nur noch das freie Einzelzimmer.
            // Die Gruppe entschliesst sich, schon mal für den selben Tag in einer Woche zu buchen:
            zeitraum = new Zeitraum(10, 11);
            buchung3 = hotel.erstelleBuchung(zeitraum, gruppe);
            if (buchung3.istOkay()) {
                // in einer Woche ist im Moment noch alles frei, deshalb bestaetigt das Alphatier der Gruppe:
                hotel.bestaetige(buchung3);

                // wenn er zahlt ...
                ernstAmmann.bezahle(buchung3);
                // ... wird die Gruppe dann in einer Woche einchecken können:
                hotel.checkIn(ernstAmmann, buchung3);
                hotel.checkIn(annaBauer, buchung3);
                hotel.checkIn(viktorCotti, buchung3);
                hotel.checkIn(emmaDubler, buchung3);
            }
        }
    }
}
