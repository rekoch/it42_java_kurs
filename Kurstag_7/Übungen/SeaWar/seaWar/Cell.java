package seaWar;

public class Cell {
    private String positionIsFree = "O ";
    private String positionTakesShip = "S ";
    private String positionIsStroke = "X ";

    Cell(){

    }

    public String getPositionIsFree() {
        return positionIsFree;
    }

    public String getPositionIsStroke() {
        return positionIsStroke;
    }

    public String getPositionTakesShip() {
        return positionTakesShip;
    }
}
