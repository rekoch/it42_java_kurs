package zauber;

import spielfiguren.Player;

public abstract class Zauber{
    public int manakosten;

    public Zauber(int manakosten) {
        this.manakosten = manakosten;
    }

    public abstract void cast(Player player);
}
