package gegenstaende;

import spielfiguren.Player;

public class Manatrank extends Trank {


    public Manatrank(int description, int weight) {
        super(description, weight);
    }

    @Override
    public void use(Player player) {
        player.setMana(player.getMana() + 25);
    }
}
