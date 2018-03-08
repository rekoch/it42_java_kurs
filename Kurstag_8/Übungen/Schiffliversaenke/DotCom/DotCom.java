/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

public class DotCom {
    int groesse;
    String name;

    // TRUE = UP
    // FALSE = DOWN
    boolean direction;

    public DotCom(String name, boolean direction) {
        this.groesse = 3;
        this.name = name;
        this.direction = direction;
    }
}
