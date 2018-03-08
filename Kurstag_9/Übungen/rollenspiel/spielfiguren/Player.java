/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package spielfiguren;

import waffen.Keule;
import waffen.Waffe;

public class Player {
    private String name;
    private double lifepoints;
    private int maxweigt;

    private Waffe waffe;

    public Player(String name) {
        this.name = name;
        this.waffe = new Keule(5,1,5);
    }
}
