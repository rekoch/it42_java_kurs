/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package waffen;

public class Nahkampfwaffe extends Waffe {
    private int defensivPoints;



    public Nahkampfwaffe(int attackPoints, int weight, int defensivPoints) {
        super(attackPoints, weight);
        this.defensivPoints = (attackPoints / 2);
    }
}
