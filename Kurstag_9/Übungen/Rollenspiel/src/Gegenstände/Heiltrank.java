/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package Gegenstšnde;

public class Heiltrank extends Trank {
    private int heilwert;

    public Heiltrank(int heilwert) {
        this.heilwert = heilwert;
    }

    public int getHeilwert() {
        return heilwert;
    }

    public void setHeilwert(int heilwert) {
        this.heilwert = heilwert;
    }
}
