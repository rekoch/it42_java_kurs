/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.Random;

public class dotComField {
    Random random = new Random();
    private dotComCell[][] hiddenMap = new dotComCell[7][7];
    private dotComCell[][] map = new dotComCell[7][7];

    public dotComField(){
       initField();
    }

    private void initField(){
        for(int i = 0; i < 7; i++){
            for(int k = 0; k < 7; k++){
                hiddenMap[i][k] = new dotComCell();
                hiddenMap[i][k].setCellValue(".");
                map[i][k] = new dotComCell();
                map[i][k].setCellValue(".");
            }
        }
    }

    private void generateField(){

        int x = generateRandom();
        int y = generateRandom();
        int countDotComs = 0;

        hiddenMap[x][y].setCellValue("X");
    }

    private int generateRandom(){
        return random.nextInt(8);
    }

}
