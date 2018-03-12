/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package gegenstaende;

import spielfiguren.Player;

import waffen.Nahkampfwaffe;
import waffen.Waffe;

public class Verteidigungsring extends Zauberring {


    public Verteidigungsring(int description, int weight) {
        super(description, weight);
    }

    // Are rings consumable?
    @Override
    public void equip(Player player) {
        player.setKampfwert(player.getKampfwert() * 2);
    }
}
