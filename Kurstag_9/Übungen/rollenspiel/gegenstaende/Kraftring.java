/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package gegenstaende;

import spielfiguren.Player;

public class Kraftring extends Zauberring {
    public Kraftring(int description, int weight) {
        super(description, weight);
    }

    public void equip(Player player){
        player.setMaxweigt(player.getMaxweigt() + 5);
    }
}
