/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.ArrayList;
import java.util.List;

public class dotComSpaceValidator {

    public boolean generateShip(dotComCell[][] field, int alignent, int amountOfShips, int size, int x, int y){

        boolean isEmpty = checkForSpace(field, alignent, amountOfShips, size, x, y);
        System.out.println(isEmpty);
        return isEmpty;
    }

    private boolean checkForSpace(dotComCell[][] field, int alignent, int amountOfShips, int size, int x, int y){
        List<Boolean> values = new ArrayList<>();

        for (int i = -1; i < 1+size; i++){
            for (int j = -1; j < 2; j++){
                if(field[x+i][y+j].getCellValue().equals("-")){
                    values.add(true);
                } else {
                    values.add(false);
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
}
