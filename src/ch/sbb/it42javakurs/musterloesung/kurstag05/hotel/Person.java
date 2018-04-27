/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.musterloesung.kurstag05.hotel;

import java.math.BigDecimal;

/**
 * Ein Mensch.
 */
public class Person {
    private final String vorname; // nicht unbedingt noetig
    private final String nachname; // nicht unbedingt noetig

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void bezahle(Buchung buchung) {
        if (buchung.isBestaetigt()) {
            BigDecimal preis = buchung.getPreis();
            // hier würde die Zahlungsabwicklung aufgerufen werden - ist aber nicht wichtig
            // ...
            // Jetzt Buchung als 'bezahlt' markieren:
            buchung.setBezahlt();
        }
        else {
            System.out.println("Buchung kann nicht bezahlt werden, sie muss zuerst bestaetigt werden.");
        }
    }


    public String toString() {
        return vorname + " " + nachname;
    }

}
