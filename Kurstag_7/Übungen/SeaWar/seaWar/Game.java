package seaWar;

public class Game {
    public static void main(String[] args) {
        ConsoleController cc = new ConsoleController();
        Field field = new Field(cc.getInputHeigth(), cc.getInputLength());
        cc.displayField(field.getGameField());

        Ship karve = new Ship("karve", 1);
        field.placeShipInField(karve);
        Ship schooner = new Ship("schooner", 2);
        field.placeShipInField(schooner);
        Ship destroyer = new Ship("destroyer", 3);
        field.placeShipInField(destroyer);
        Ship aircraftCarrier = new Ship("aircraftCarrier", 4);
        field.placeShipInField(aircraftCarrier);

        cc.displayField(field.getFieldOfShips());
    }
}