package zauber;

import spielfiguren.Player;

public class Heilungszauber extends Zauber {

    public Heilungszauber() {
        super(50);
    }

    @Override
    public void cast(Player player) {
        player.setLifepoints(player.getLifepoints() + 25);
    }
}
