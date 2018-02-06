/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

public class dotComField {
    private dotComCell[][] map = new dotComCell[9][9];
    private int dotComAmountInField = 0;
    private dotComShipGenerator validator = new dotComShipGenerator();

    public dotComField(){
       initMap();
    }

    private void initMap(){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                map[i][j] = new dotComCell();
                map[i][j].setCellValue("-");
            }
        }
    }

    public void generateTripleShips(int amount){
        int size = 2;
        map = validator.generateShip(map, amount, size);
        dotComAmountInField += amount*size;
    }

    public void showMap(int from, int to){
        for (int h = 0; h < 7; h++){
            System.out.print("\t" + h);
        }
        int temp = 0;
        System.out.println("\n");
        for(int i = from; i < to; i++){
            for(int j = from; j < to; j++){
                if(j == from){
                    System.out.print(temp++ + "\t" + map[i][j].getCellValue());
                }else {
                    System.out.print("\t" + map[i][j].getCellValue());
                }
            }
            System.out.println("\n");
        }
    }

    public dotComCell[][] getMap() {
        return map;
    }

    public void setDotComAmountInField(int dotComAmountInField) {
        this.dotComAmountInField = dotComAmountInField;
    }

    public int getDotComAmountInField() {
        return dotComAmountInField;
    }
}
