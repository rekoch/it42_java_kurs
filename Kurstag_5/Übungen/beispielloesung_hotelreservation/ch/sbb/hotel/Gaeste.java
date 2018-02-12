/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.hotel;

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
