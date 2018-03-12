package seaWar;

import java.util.Random;

public class Field {
    private int heigth;
    private int length;
    private String[][] gameField;
    private String[][] shipField;

    Field(int heigth, int length) {
        this.heigth = heigth;
        this.length = length;
        gameField = generateBasicField();
        shipField = generateBasicField();
    }

    private String[][] generateBasicField() {
        Cell cell = new Cell();
        String[][] tempField = new String[heigth][length];
        for (int i = 0; i < tempField.length; i++) {
            for (int j = 0; j < tempField[i].length; j++) {
                tempField[i][j] = cell.getPositionIsFree();
            }
        }
        return tempField;
    }

    public void placeShipInField(Ship ship) {
        Random r = new Random();
        int randomNumber1 = r.nextInt(heigth);
        int randomNumber2 = r.nextInt(length);
        boolean placeNotfound = true;
        Cell cell = new Cell();
        while (placeNotfound){
            if (gameField[randomNumber1][randomNumber2].equals(cell.getPositionIsFree())) {
                if(checkPosition(ship, randomNumber1, randomNumber2)){
                    placeNotfound = false;
                }
            }
        }
    }
    private boolean checkPosition(Ship ship, int num1, int num2){
        Random r = new Random();
        int position = r.nextInt(4);
        switch (position){
            case 1:
                for (int i = num2; i < (ship.getSize() + num2); i++){

                }
                break;
            case 2:
                for (int i = num2; i < (ship.getSize() + num2); i++){

                }
                break;
            case 3:
                for (int i = num2; i < (ship.getSize() + num2); i++){

                }
                break;
            case 4:
                for (int i = num2; i < (ship.getSize() + num2); i++){

                }
                break;
            default:
                return false;
        }
        return true;
    }

    private void placeShip(){
        Cell cell = new Cell();
        /*for (int i = randomNumber2; i < (ship.getSize()+randomNumber2); i++) {
            field[randomNumber1][i] = cell.getPositionTakesShip();
        }*/
    }

    public String[][] getGameField() {
        return gameField;
    }

    public void setGameField(String[][] gameField) {
        this.gameField = gameField;
    }

    public String[][] getFieldOfShips() {
        return shipField;
    }

    public void setShipFields(String[][] shipField) {
        this.shipField = shipField;
    }
}
