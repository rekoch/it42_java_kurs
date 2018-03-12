/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package gegenstaende;

import spielfiguren.Player;

public abstract class Trank extends Item {
    public Trank(int description, int weight) {
        super(description, weight);
    }

    public abstract void use(Player player);
}
