/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package waffen;

public abstract class Nahkampfwaffe extends Waffe {
    private int defensivPoints;

    public Nahkampfwaffe(int attackPoints, int weight, int defensivPoints) {
        super(attackPoints, weight);
        this.defensivPoints = (attackPoints / 2);
    }

    public int getDefensivPoints() {
        return defensivPoints;
    }

    public void setDefensivPoints(int defensivPoints) {
        this.defensivPoints = defensivPoints;
    }
}
