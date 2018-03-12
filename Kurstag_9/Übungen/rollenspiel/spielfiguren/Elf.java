/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package spielfiguren;

public class Elf extends Player {
    // Zauberpunkte
    private int intelligence;

    public Elf(String name, double lifepoints, int intelligence) {
        super(name, lifepoints);
        this.intelligence = intelligence;
        this.setKampfwert(this.getKampfwert() + (intelligence / 2));
    }

    public void cast(){

    }
}
