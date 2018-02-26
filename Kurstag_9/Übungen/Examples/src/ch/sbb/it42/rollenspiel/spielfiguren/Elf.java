package Kurstag_9.Übungen.Examples.src.ch.sbb.it42.rollenspiel.spielfiguren;

public class Elf extends Spielfigur {

    private int zauberwert;

    public Elf(String name, int zauberwert) {
        super(name);
        this.zauberwert = zauberwert;
    }

    /**
     * Nur Elf:
     * Kampfwert + (Zauberwert / 2)
     * Nur Elf und Goblin:
     * Wenn Bogen als Waffe aktiv Kampfwert um 50% erhöht.
     * @return Kampfwert der Spielfigur
     */
    public int getKampfwert(){

    }
}
