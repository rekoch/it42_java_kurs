/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.musterloesung.kurstag05.sudoku;/**
 * Eine Zelle des Sudokus.
 */
public class Feld {
    private boolean initialGesetzt;
    private Integer wert;

    public boolean isInitialGesetzt() {
        return initialGesetzt;
    }

    public Integer getWert() {
        return wert;
    }

    public void setWert(Integer wert) {
        this.wert = wert;
    }

    public boolean isLeer() {
        return (wert == null);
    }

    public void setInitialGesetzt() {
        initialGesetzt = true;
    }

    public String toString() {
        return wert == null ? "[ ]" : "[" + wert.intValue() + "]";
    }
}
