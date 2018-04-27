/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag04.equals;

public class Main {

    public static void main(String[] args) {
        Kreis k1 = new Kreis(1.0, 1.0, 1.0, "rot");
        Kreis k2 = new Kreis(2.0, 0.0, 3.0, "rot");
        Kreis k3 = new Kreis(2.0, 0.0, 3.0, "zartrosa");

        System.out.println("k1==k2: " + (k1==k2)); // false, weil andere Identität (=anderer Kreis)
        System.out.println("k2==k3: " + (k2==k3)); // false, weil andere Identität (=anderer Kreis)

        System.out.println("k1.equals(k2)=" + k1.equals(k2)); // false, weil verschiedene Position und Radien
        System.out.println("k2.equals(k3)=" + k2.equals(k3)); // true, weil Farbe als nicht relevant definiert wurde für Gleichwertigkeit
    }
}
