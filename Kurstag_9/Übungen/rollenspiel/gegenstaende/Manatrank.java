package gegenstaende;

import spielfiguren.Player;

public class Manatrank extends Trank {
    public Manatrank() {
    }

    @Override
    public void use(Player player) {
        player.setMana(player.getMana() + 25);
    }
}
