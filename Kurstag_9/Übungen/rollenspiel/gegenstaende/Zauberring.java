/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package gegenstaende;

import spielfiguren.Player;

public abstract class Zauberring extends Item {
    public Zauberring(int description, int weight) {
        super(description, weight);
    }

    public abstract void equip(Player player);
}
