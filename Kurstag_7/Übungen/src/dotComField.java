/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

public class dotComField {
    private dotComCell[][] map;
    private int dotComAmountInField = 0;
    private dotComShipGenerator generator = new dotComShipGenerator();
    private int fieldSize;

    public dotComField(int fieldSize){
        this.fieldSize = fieldSize;
        map = new dotComCell[fieldSize+2][fieldSize+2];
        initMap();
    }

    private void initMap(){
        for(int i = 0; i < fieldSize+2; i++){
            for(int j = 0; j < fieldSize+2; j++){
                map[i][j] = new dotComCell();
                map[i][j].setCellValue("-");
            }
        }
    }

    public void generateShips(int amount, int size){
        map = generator.generateShip(map, amount, size);
        dotComAmountInField += amount*size;
        generator.resetCountShips();
    }

    public void showMap(int from, int to){
        for (int h = 0; h < map.length-2; h++){
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
