/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package gegenstaende;

public abstract class Item {
    private int description;
    private int weight;
    private ItemStatus status;

    public Item(int description, int weight) {
        this.description = description;
        this.weight = weight;
        this.status = ItemStatus.UNUSED;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
