package zauber;

import spielfiguren.Player;

public class Zerstörungszauber extends Zauber {

    public Zerstörungszauber(Player gegner) {
        super(10);
        cast(gegner);
    }

    @Override
    public void cast(Player player) {
        player.setLifepoints(player.getLifepoints() - 60);
    }
}
