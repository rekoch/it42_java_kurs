package seaWar;

import java.util.Random;

enum Direction {
    LEFT, RIGHT, UP, DOWN;
}

public class SeaWarField {
    private int length;
    private int width;
    private String[][] field;
    private String[][] fieldWithShips;
    private int middleShip = 3;
    private int bigShip = 4;
    private Direction d;

    public SeaWarField(int length, int width) {
        this.length = length;
        this.width = width;
        field = generateBasicField();
        fieldWithShips = generateBasicField();
        setShips(fieldWithShips);
    }

    private String[][] generateBasicField() {
        String[][] tempField = new String[length][width];
        for (int i = 0; i < tempField.length; i++) {
            for (int j = 0; j < tempField[i].length; j++) {
                tempField[i][j] = "O ";
            }
        }
        return tempField;
    }

    public void setShips(String[][] tempField) {
        //SCHIFF1 setzen
        Random r1 = new Random();
        int number1 = r1.nextInt(6);
        int number2 = r1.nextInt(6);
        tempField[number1][number2] = "X ";

        //SCHIFF2 setzen
        boolean tryGenerateShip2 = true;
        boolean tryGenerateShip3 = true;
        boolean tryGenerateShip4 = true;
        boolean placeNotFoundJet = true;
        while (tryGenerateShip2 || tryGenerateShip3 || tryGenerateShip4) {
            int number3 = r1.nextInt(6);
            int number4 = r1.nextInt(6);
            if (tryGenerateShip2) {
                //This Ship takes 2 places
                if (tempField[number3][number4].equals("O ")) {
                    if (tempField[number3][number4 + 1].equals("O ") && placeNotFoundJet) {
                        tempField[number3][number4] = "X ";
                        tempField[number3][number4 + 1] = "X ";
                        placeNotFoundJet = false;
                    } else if (tempField[number3][number4 - 1].equals("O ") && placeNotFoundJet) {
                        tempField[number3][number4] = "X ";
                        tempField[number3][number4 - 1] = "X ";
                        placeNotFoundJet = false;
                    } else if (tempField[number3 + 1][number4].equals("O ") && placeNotFoundJet) {
                        tempField[number3][number4] = "X ";
                        tempField[number3 + 1][number4] = "X ";
                        placeNotFoundJet = false;
                    } else if (tempField[number3 - 1][number4].equals("O ") && placeNotFoundJet) {
                        tempField[number3][number4] = "X ";
                        tempField[number3 - 1][number4] = "X ";
                        placeNotFoundJet = false;
                    }
                    tryGenerateShip2 = false;
                    placeNotFoundJet = true;
                }
            } else if (tryGenerateShip3) {
                //This Ship takes 3 places
                if (tempField[number3][number4].equals("O ")) {
                    if (arePositionsFree(tempField, number3, number4, middleShip, d.LEFT) && placeNotFoundJet) {
                        for (int i = number4; i < (number4 + 3); i++) {
                            tempField[number3][i] = "X ";
                            placeNotFoundJet = false;
                        }
                    } else if (arePositionsFree(tempField, number3, number4, middleShip, d.RIGHT) && placeNotFoundJet) {
                        for (int i = number4; i > (number4 - 3); i--) {
                            tempField[number3][i] = "X ";
                            placeNotFoundJet = false;
                        }
                    } else if (arePositionsFree(tempField, number3, number4, middleShip, d.DOWN) && placeNotFoundJet) {
                        for (int i = number3; i < (number3 + 3); i++) {
                            tempField[i][number4] = "X ";
                            placeNotFoundJet = false;
                        }
                    } else if (arePositionsFree(tempField, number3, number4, middleShip, d.UP) && placeNotFoundJet) {
                        for (int i = number3; i > (number3 - 3); i--) {
                            tempField[i][number4] = "X ";
                            placeNotFoundJet = false;
                        }
                    }
                    tryGenerateShip3 = false;
                    placeNotFoundJet = true;
                }
            } else if (tryGenerateShip4) {
                //This Ship takes 4 places
                if (tempField[number3][number4].equals("O ")) {
                    if (arePositionsFree(tempField, number3, number4, middleShip, d.LEFT) && placeNotFoundJet) {
                        for (int i = number4; i < (number4 + 4); i++) {
                            tempField[number3][i] = "X ";
                            placeNotFoundJet = false;
                        }
                    } else if (arePositionsFree(tempField, number3, number4, middleShip, d.RIGHT) && placeNotFoundJet) {
                        for (int i = number4; i > (number4 - 4); i--) {
                            tempField[number3][i] = "X ";
                            placeNotFoundJet = false;
                        }
                    } else if (arePositionsFree(tempField, number3, number4, middleShip, d.DOWN) && placeNotFoundJet) {
                        for (int i = number3; i < (number3 + 4); i++) {
                            tempField[i][number4] = "X ";
                            placeNotFoundJet = false;
                        }
                    } else if (arePositionsFree(tempField, number3, number4, middleShip, d.UP) && placeNotFoundJet) {
                        for (int i = number3; i > (number3 - 4); i--) {
                            tempField[i][number4] = "X ";
                            placeNotFoundJet = false;
                        }
                    }
                    tryGenerateShip4 = false;
                    placeNotFoundJet = true;
                }
            }
        }
        fieldWithShips = tempField;
    }

    private boolean arePositionsFree(String[][] tempField, int pos1, int pos2, int shipSize, Direction d) {
        boolean arePositionsFree = true;
        switch (d) {
            case LEFT:
                if (pos2 + shipSize >= tempField.length) {
                    return false;
                }
                for (int i = pos2; i < (pos2 + shipSize); i++) {
                    if (tempField[pos1][i].equals("X ")) {
                        arePositionsFree = false;
                    }
                }
                break;
            case RIGHT:
                if (pos2 + shipSize >= tempField.length) {
                    return false;
                }
                for (int i = pos2; i > (pos2 - shipSize); i--) {
                    if (tempField[pos1][i].equals("X ")) {
                        arePositionsFree = false;
                    }
                }

                break;
            case DOWN:
                if (pos2 + shipSize >= tempField.length) {
                    return false;
                }
                for (int i = pos1; i < (pos1 + shipSize); i++) {
                    if (tempField[i][pos2].equals("X ")) {
                        arePositionsFree = false;
                    }
                }
                break;
            case UP:
                if (pos2 + shipSize >= tempField.length) {
                    return false;
                }
                for (int i = pos1; i > (pos1 - shipSize); i--) {
                    if (tempField[i][pos2].equals("X ")) {
                        arePositionsFree = false;
                    }
                }
                break;
        }
        return arePositionsFree;
    }

    public String[][] getField() {
        return field;
    }

    public void setField(String[][] field) {
        this.field = field;
    }

    public boolean findShipPosition(String[] position) {
        boolean foundShip = false;
        switch (position[0]) {
            case "A":
                foundShip = searchArray(0, position[1]);
                break;
            case "B":
                foundShip = searchArray(1, position[1]);
                break;
            case "C":
                foundShip = searchArray(2, position[1]);
                break;
            case "D":
                foundShip = searchArray(3, position[1]);
                break;
            case "E":
                foundShip = searchArray(4, position[1]);
                break;
            case "F":
                foundShip = searchArray(5, position[1]);
                break;
            case "G":
                foundShip = searchArray(6, position[1]);
                break;
            default:
                foundShip = false;
                break;

        }
        return foundShip;
    }

    private boolean searchArray(int pos2, String posString) {
        int pos1 = Integer.parseInt(posString);
        if (fieldWithShips[pos1][pos2].equals("X ")) {
            return true;
        } else {
            return false;
        }
    }
}
