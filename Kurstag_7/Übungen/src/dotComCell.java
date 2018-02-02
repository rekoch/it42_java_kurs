/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

public class dotComCell {
    private String cellValue;
    private boolean hasNeighbours;
    private boolean isCoveredUp;

    public boolean isCoveredUp() {
        return isCoveredUp;
    }

    public void setCoveredUp(boolean coveredUp) {
        isCoveredUp = coveredUp;
    }


    public boolean isHasNeighbours() {
        return hasNeighbours;
    }

    public void setHasNeighbours(boolean hasNeighbours) {
        this.hasNeighbours = hasNeighbours;
    }

    public String getCellValue() {
        return cellValue;
    }

    public void setCellValue(String cellValue) {
        this.cellValue = cellValue;
    }


}
