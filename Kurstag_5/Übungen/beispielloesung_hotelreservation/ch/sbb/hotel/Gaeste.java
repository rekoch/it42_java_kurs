/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.hotel;


/**
 * Ein Ansammlung von Menschen: eine/r, zwei oder mehr.
 */
public class Gaeste {

    private Person[] personen;

    public Gaeste(Person... personen) {
        this.personen = personen;
    }

    public int getAnzahl() {
        return personen.length;
    }

    public boolean enthalten(Person person) {
        for (Person p : personen) {
            if (person.equals(p)) {
                return true;
            }
        }
        return false;
    }
}
