/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.Random;

public class dotComField {
    Random random = new Random();
    private dotComCell[][] map = new dotComCell[9][9];
    private int dotComsInField = 0;

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

        int x;
        int y;
        int countShips = 0;
        int view;

        while (countShips < amount) {
            view = generateRandom(2, 0);

            if (view == 0){ //bei 0 ist die Ausrichtung horizontal -> sonst ist sie vertikal ^
                x = generateRandom(5, 1);
                y = generateRandom(7, 1);
                if (map[x-1][y].getCellValue().equals("-") && map[x][y].getCellValue().equals("-") && map[x+1][y].getCellValue().equals("-") && map[x+2][y].getCellValue().equals("-") && map[x+3][y].getCellValue().equals("-") &&
                    map[x-1][y-1].getCellValue().equals("-") && map[x][y-1].getCellValue().equals("-") && map[x+1][y-1].getCellValue().equals("-") && map[x+2][y-1].getCellValue().equals("-") && map[x+3][y-1].getCellValue().equals("-") &&
                    map[x-1][y+1].getCellValue().equals("-") && map[x][y+1].getCellValue().equals("-") && map[x+1][y+1].getCellValue().equals("-") && map[x+2][y+1].getCellValue().equals("-") && map[x+3][y+1].getCellValue().equals("-")
                ){

                    map[x][y].setCellValue("X");
                    map[x + 1][y].setCellValue("X");
                    map[x + 2][y].setCellValue("X");
                    countShips++;
                    dotComsInField += 3;
                }
            } else{
                x = generateRandom(7, 1);
                y = generateRandom(5, 1);
                if (map[x][y-1].getCellValue().equals("-") && map[x][y].getCellValue().equals("-") && map[x][y+1].getCellValue().equals("-") && map[x][y+2].getCellValue().equals("-") && map[x][y+3].getCellValue().equals("-") &&
                    map[x-1][y-1].getCellValue().equals("-") && map[x-1][y].getCellValue().equals("-") && map[x-1][y+1].getCellValue().equals("-") && map[x-1][y+2].getCellValue().equals("-") && map[x-1][y+3].getCellValue().equals("-") &&
                    map[x+1][y-1].getCellValue().equals("-") && map[x+1][y].getCellValue().equals("-") && map[x+1][y+1].getCellValue().equals("-") && map[x+1][y+2].getCellValue().equals("-") && map[x+1][y+3].getCellValue().equals("-")
                ){
                    map[x][y].setCellValue("X");
                    map[x][y + 1].setCellValue("X");
                    map[x][y + 2].setCellValue("X");
                    countShips++;
                    dotComsInField += 3;
                }
            }
        }
    }

    private int generateRandom(int bound, int offset){
        return random.nextInt(bound) + offset;
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

    public int getDotComsInField() {
        return dotComsInField;
    }
}
