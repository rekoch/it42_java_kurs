/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package gegenstaende;

import spielfiguren.Player;

public class Stärketrank extends Trank {

    @Override
    public void usePot(Player player) {
        player.getWaffe().setAttackPoints(player.getWaffe().getAttackPoints() * 2);
    }
}
