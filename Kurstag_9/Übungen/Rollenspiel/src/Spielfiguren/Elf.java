/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package Spielfiguren;

public class Elf extends Spielfigur {
    private int zauberwert;

    public Elf(String name, int zauberwert) {
        super(name);
        this.zauberwert = zauberwert;
    }

    public int getZauberwert() {
        return zauberwert;
    }

    public void setZauberwert(int zauberwert) {
        this.zauberwert = zauberwert;
    }
}
