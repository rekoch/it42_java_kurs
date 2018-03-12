/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package gegenstaende;

import spielfiguren.Player;

public class Stärketrank extends Trank {

    public Stärketrank(int description, int weight) {
        super(description, weight);
    }

    @Override
    public void use(Player player) {
        player.getWaffe().setAttackPoints(player.getWaffe().getAttackPoints() * 2);
    }

}
