/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package gegenstaende;

import spielfiguren.Player;

public class Heiltrank extends Trank {

    @Override
    public void usePot(Player player) {
        //int maxLifepoints = player.getMaxLifePoints();
        //if (player.getLifepoints() != maxLifepoints) {}
            player.setLifepoints(player.getLifepoints() + 100);

    }
}
