/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package spielfiguren;

import waffen.Keule;
import waffen.Waffe;

public abstract class Player {
    private String name;
    private double lifepoints;
    private int maxweigt;

    private Waffe waffe;

    public Player(String name) {
        this.name = name;
        this.waffe = new Keule(5,1,5);
    }

    public int getMaxweigt() {
        return maxweigt;
    }

    public void setMaxweigt(int maxweigt) {
        this.maxweigt = maxweigt;
    }

    public double getLifepoints() {
        return lifepoints;
    }

    public void setLifepoints(double lifepoints) {
        this.lifepoints = lifepoints;
    }

    public Waffe getWaffe() {
        return waffe;
    }

    public void setWaffe(Waffe waffe) {
        this.waffe = waffe;
    }
}
