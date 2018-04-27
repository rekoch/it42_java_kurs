/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag10.runtimeerror;

public class LaufzeitFehler {

    public static void main(String[] args) {
        String string = null;

        Object object = new Object();

        string = (String) object; // kann nicht gecastet werden, weil object kein String ist --> ClassCastException!
    }
}
