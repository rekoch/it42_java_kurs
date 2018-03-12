/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.kt10.runtimeerror.bsp;

public class LaufzeitFehler {

    public static void main(String[] args) {
        String string = null;

        Object object = new Object();

        string = (String) object; // kann nicht gecastet werden, weil object kein String ist --> ClassCastException!
    }
}
