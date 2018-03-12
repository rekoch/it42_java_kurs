/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package spielfiguren;

import gegenstaende.Item;
import waffen.Bogen;
import waffen.Keule;
import waffen.Waffe;

import java.util.Random;

public abstract class Player {
    private String name;
    private double lifepoints;
    private int maxweigt;
    private double kampfwert;
    Random rand = new Random();


    private Waffe waffe;

    public Player(String name, double lifepoints) {
        this.name = name;
        this.waffe = new Keule(5);
        this.setMaxweigt(this.getMaxweigt() - waffe.getWeight());
        this.lifepoints = lifepoints;
        this.kampfwert = this.getWaffe().getAttackPoints() * rand.nextDouble() * ((1.1 - 0.9) + 0.9);
        this.maxweigt = 50 - this.getWaffe().getWeight();
    }

    public int getMaxweigt() {
        return maxweigt;
    }

    public void setMaxweigt(int maxweigt) {
        this.maxweigt = maxweigt;
    }

    public double getLifepoints() {
        return lifepoints;
    }

    public void setLifepoints(double lifepoints) {
        this.lifepoints = lifepoints;
    }

    public Waffe getWaffe() {
        return waffe;
    }

    public void setWaffe(Waffe waffe) {
        this.waffe = waffe;
    }

    public double getKampfwert() {
        return kampfwert;
    }

    public void setKampfwert(double kampfwert) {
        this.kampfwert = kampfwert;
    }

    public void swapWeapon(Waffe waffe) {
        if (this.maxweigt > waffe.getWeight()) {
            this.setMaxweigt(this.getMaxweigt() + this.getWaffe().getWeight());
            this.setWaffe(waffe);
            this.setMaxweigt(this.getMaxweigt() - waffe.getWeight());
            if (waffe.getClass().isInstance(Bogen.class) && (this.getClass().isInstance(Elf.class) || this.getClass().isInstance(Goblin.class))) {
                this.setKampfwert(this.getKampfwert() * 1.5);
            }
            if (!waffe.getClass().isInstance(Keule.class) && this.getClass().isInstance(Troll.class)) {
                this.setKampfwert(this.getKampfwert() / 2);
            }
        } else {
            System.out.println("Nicht genug Tragkraft!");
        }
    }

    public void loot(Item item) {
        if (this.getMaxweigt() != 0 && item.getWeight() < this.getMaxweigt()) {
            this.setMaxweigt(this.getMaxweigt() - item.getWeight());
        }
    }

    public boolean kaempfeGegen(Player gegner) {
        boolean sieg = false;
        for (int runde = 1; runde < 20; runde++) {
            if ((runde%2) == 0) {
                gegner.setLifepoints(gegner.getLifepoints() - this.getKampfwert());
            } else {
                this.setLifepoints(this.getLifepoints() - gegner.getKampfwert());
            }

            System.out.println("\b----------------------------------------------------------");
            System.out.println("Du hast noch " + this.getLifepoints() + " Leben");
            System.out.println("Dein Gegner hat noch " + gegner.getLifepoints() + " Leben");
            System.out.println("----------------------------------------------------------");

            if (gegner.getLifepoints() <= 0 || (runde == 19 && this.getLifepoints() > gegner.getLifepoints())) {
                sieg = true;
                break;
            } else if (this.getLifepoints() <= 0 || (runde == 19 && this.getLifepoints() > gegner.getLifepoints())) {
                break;
            }
        }
        return sieg;
    }
}
