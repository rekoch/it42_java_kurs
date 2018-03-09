/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package spielfiguren;

public class Troll extends Player {
    public Troll(String name) {
        super(name);
        this.setKampfwert(this.getKampfwert() * 2);
    }
}
