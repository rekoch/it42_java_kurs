/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package waffen;

public class Waffe {
    private int attackPoints;
    private int weight;

    public Waffe(int attackPoints, int weight) {
        this.attackPoints = attackPoints;
        this.weight = weight;
    }

    public int getAttackPoints() {
        return attackPoints;
    }


}
