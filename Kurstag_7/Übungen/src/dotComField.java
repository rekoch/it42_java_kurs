/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.Random;

public class dotComField {
    Random random = new Random();
    private dotComCell[][] hiddenMap = new dotComCell[9][9];
    private dotComCell[][] map = new dotComCell[9][9];

    public dotComField(){
       initMap();
       generateMap();
    }

    private void initMap(){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                hiddenMap[i][j] = new dotComCell();
                hiddenMap[i][j].setCellValue("-");
                map[i][j] = new dotComCell();
                map[i][j].setCellValue("-");
            }
        }
    }

    private void generateMap(){

        int x;
        int y;
        int countDotComs = 0;
        int view;

        while (countDotComs < 3) {
            view = generateRandom(2, 0);

            if (view == 0){ //bei 0 ist die Ausrichtung horizontal -> sonst ist sie vertikal ^
                x = generateRandom(5, 1);
                y = generateRandom(7, 1);
                if (hiddenMap[x-1][y].getCellValue().equals("-") && hiddenMap[x][y].getCellValue().equals("-") && hiddenMap[x+1][y].getCellValue().equals("-") && hiddenMap[x+2][y].getCellValue().equals("-") && hiddenMap[x+3][y].getCellValue().equals("-") &&
                    hiddenMap[x-1][y-1].getCellValue().equals("-") && hiddenMap[x][y-1].getCellValue().equals("-") && hiddenMap[x+1][y-1].getCellValue().equals("-") && hiddenMap[x+2][y-1].getCellValue().equals("-") && hiddenMap[x+3][y-1].getCellValue().equals("-") &&
                    hiddenMap[x-1][y+1].getCellValue().equals("-") && hiddenMap[x][y+1].getCellValue().equals("-") && hiddenMap[x+1][y+1].getCellValue().equals("-") && hiddenMap[x+2][y+1].getCellValue().equals("-") && hiddenMap[x+3][y+1].getCellValue().equals("-")
                ){

                    hiddenMap[x][y].setCellValue("X");
                    hiddenMap[x + 1][y].setCellValue("X");
                    hiddenMap[x + 2][y].setCellValue("X");
                    countDotComs++;
                }
            } else{
                x = generateRandom(7, 1);
                y = generateRandom(5, 1);
                if (hiddenMap[x][y-1].getCellValue().equals("-") && hiddenMap[x][y].getCellValue().equals("-") && hiddenMap[x][y+1].getCellValue().equals("-") && hiddenMap[x][y+2].getCellValue().equals("-") && hiddenMap[x][y+3].getCellValue().equals("-") &&
                    hiddenMap[x-1][y-1].getCellValue().equals("-") && hiddenMap[x-1][y].getCellValue().equals("-") && hiddenMap[x-1][y+1].getCellValue().equals("-") && hiddenMap[x-1][y+2].getCellValue().equals("-") && hiddenMap[x-1][y+3].getCellValue().equals("-") &&
                    hiddenMap[x+1][y-1].getCellValue().equals("-") && hiddenMap[x+1][y].getCellValue().equals("-") && hiddenMap[x+1][y+1].getCellValue().equals("-") && hiddenMap[x+1][y+2].getCellValue().equals("-") && hiddenMap[x+1][y+3].getCellValue().equals("-")
                ){
                    hiddenMap[x][y].setCellValue("X");
                    hiddenMap[x][y + 1].setCellValue("X");
                    hiddenMap[x][y + 2].setCellValue("X");
                    countDotComs++;
                }
            }
        }

        showMap();

    }

    private int generateRandom(int bound, int offset){
        return random.nextInt(bound) + offset;
    }

    private void showMap(){
        map = hiddenMap.clone();
        /*for(int i = 1; i < 8; i++){
            for(int j = 1; j < 8; j++){
                System.out.print(map[i][j].getCellValue() + "\t");
            }
            System.out.println("\n");
        }*/
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                //System.out.print(map[i][j].getCellValue() + "\t");
                System.out.print(hiddenMap[i][j].getCellValue() + "\t");
            }
            System.out.println("\n");
        }
    }
}
