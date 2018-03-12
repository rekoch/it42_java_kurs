/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package waffen;

public abstract class Nahkampfwaffe extends Waffe {
    private int defensivPoints;

    public Nahkampfwaffe(int attackPoints, int weight, int defensivPoints) {
        super(attackPoints + (defensivPoints / 2), weight);
    }

    public int getDefensivPoints() {
        return defensivPoints;
    }

    public void setDefensivPoints(int defensivPoints) {
        this.defensivPoints = defensivPoints;
    }
}
