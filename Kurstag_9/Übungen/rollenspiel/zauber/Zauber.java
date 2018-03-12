package zauber;

import gegenstaende.ItemStatus;
import spielfiguren.Player;

public abstract class Zauber {
    private int manakosten;
    private ItemStatus status;

    public Zauber(int manakosten) {
        this.manakosten = manakosten;
        status = ItemStatus.UNUSED;
    }

    public abstract void cast(Player player);
}
