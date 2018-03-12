/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package spielfiguren;

public class Elf extends Player {
    // Zauberpunkte
    private int intelligence;

    public Elf(String name, double lifepoints, int intelligence, int mana) {
        super(name, lifepoints);
        this.intelligence = intelligence;
        this.setKampfwert(this.getKampfwert() + (intelligence / 2));
        this.setMana(mana);
    }

    public void cast(){

    }
}
