/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

public class Cell {
    private String value;
    private boolean isEditable;

    public Cell(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
