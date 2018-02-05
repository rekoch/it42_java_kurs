/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.Scanner;

public class dotComGame {
    private Scanner scanner = new Scanner(System.in);
    private dotComField gameMap = new dotComField();
    private dotComField hiddenmap = new dotComField();
    private String pattern = "[0-9]+";

    public dotComGame(){
        hiddenmap.generateShips();
        gameLoop();
    }

    private void gameLoop(){
        while(true){
            gameMap.showMap(1, 8);
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");
            if(validate(inputs)){
                int x = Integer.parseInt(inputs[0]);
                int y = Integer.parseInt(inputs[1]);
                coverUp(x , y);
            }else{
                System.out.println("Falsche Eingabe");
            }

        }

    }

    private boolean validate(String[] inputs){
        return inputs.length == 2 && inputs[0].matches(pattern) && inputs[1].matches(pattern);
    }

    private void coverUp(int x, int y){
        int xInMap = x+1;
        int yInMap = y+1;
        gameMap.getMap()[xInMap][yInMap] = hiddenmap.getMap()[xInMap][yInMap];
        gameMap.getMap()[xInMap][yInMap].setCoveredUp(true);
        checkForWin();
    }

    private void checkForWin(){
         //doStuff
    }
}
