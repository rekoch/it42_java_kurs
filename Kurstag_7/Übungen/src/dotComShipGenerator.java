/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class dotComShipGenerator {
    private final Random random = new Random();
    private dotComCell[][] map;
    private int x;
    private int y;
    private int countShips = 0;

    public dotComCell[][] generateShip(dotComCell[][] field, int amountOfShips, int size){

        map = field.clone();
        while (countShips < amountOfShips) {
            int alignment = generateRandom(2, 0);
            if (checkForSpace(alignment, size)){
                addShip(alignment, size);
            }
        }
        return map;
    }

    private boolean checkForSpace(int alignment, int size){
        List<Boolean> values = new ArrayList<>();

        if(alignment == 0){ //bei 0 ist die Ausrichtung horizontal -> sonst ist sie vertikal ^
            x = generateRandom((map.length-1-size), 1);
            y = generateRandom((map.length-2), 1);
            for (int i = -1; i < 1+size; i++){
                for (int j = -1; j < 2; j++){
                    if(map[x+i][y+j].getCellValue().equals("-")){
                        values.add(true);
                    } else {
                        values.add(false);
                    }
                }
            }
        }else {
            x = generateRandom((map.length-2), 1);
            y = generateRandom((map.length-1-size), 1);
            for (int i = -1; i < 2; i++){
                for (int j = -1; j < (1+size); j++){
                    if(map[x+i][y+j].getCellValue().equals("-")){
                        values.add(true);
                    } else {
                        values.add(false);
                    }
                }
            }
        }

        for(boolean b : values){
            if(!b){
                return false;
            }
        }
        return true;
    }

    private void addShip(int alignment, int size){
        if (alignment == 0){ //bei 0 ist die Ausrichtung horizontal -> sonst ist sie vertikal ^
            for(int i = 0; i < size; i++){
                map[x+i][y].setCellValue("X");
            }
            countShips++;
        }else{
            for(int i = 0; i < size; i++){
                map[x][y+i].setCellValue("X");
            }
            countShips++;
        }
    }

    public void resetCountShips(){
        countShips = 0;
    }

    private int generateRandom(int bound, int offset){
        return random.nextInt(bound) + offset;
    }
}