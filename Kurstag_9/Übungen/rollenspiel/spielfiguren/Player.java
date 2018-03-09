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

    private Waffe waffe;

    public Player(String name) {
        this.name = name;
        this.waffe = new Keule(1);
        this.setMaxweigt(this.getMaxweigt() - waffe.getWeight());
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

    public double getKampfwert(){
        Random rand = new Random();
        return this.getWaffe().getAttackPoints() * rand.nextDouble() * ((1.1 - 0.9) + 0.9);
    }

    public void setKampfwert(double kampfwert){ this.kampfwert = kampfwert; }

    public void swapWeapon(Waffe waffe){
        if (this.maxweigt > waffe.getWeight()) {
            this.setMaxweigt(this.getMaxweigt() + this.getWaffe().getWeight());
            this.setWaffe(waffe);
            this.setMaxweigt(this.getMaxweigt() - waffe.getWeight());
            if (waffe.getClass().isInstance(Bogen.class) && (this.getClass().isInstance(Elf.class) || this.getClass().isInstance(Goblin.class))){
                this.setKampfwert(this.getKampfwert() * 1.5);
            }
            if (!waffe.getClass().isInstance(Keule.class) && this.getClass().isInstance(Troll.class)){
                this.setKampfwert(this.getKampfwert() / 2);
            }
        }
        else {
            System.out.println("Nicht genug Tragkraft!");
        }
    }

    public void loot(Item item){
        if (this.getMaxweigt() != 0 && item.getWeight() < this.getMaxweigt()){
            this.setMaxweigt(this.getMaxweigt() - item.getWeight());
        }
    }
}
