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
        hiddenmap.generateTripleShips(3);
        gameLoop();
    }

    private void gameLoop(){
        while(true){
            hiddenmap.showMap(1, hiddenmap.getMap().length-1);
            gameMap.showMap(1, gameMap.getMap().length-1);
            System.out.println("Geben Sie die Koordinaten ein (x y): (Bsp: 5 5)");
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");
            if(validate(inputs)){
                int x = Integer.parseInt(inputs[1]);
                int y = Integer.parseInt(inputs[0]);
                coverUp(x, y);
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
        if(gameMap.getMap()[xInMap][yInMap].getCellValue().equals("X")){
            System.out.println("Treffer");
            gameMap.setDotComAmountInField(gameMap.getDotComAmountInField()+1);
            checkForWin();
        }else{
            gameMap.getMap()[xInMap][yInMap].setCellValue("O");
            System.out.println("Daneben");
        }
    }

    private void checkForWin(){
        if(gameMap.getDotComAmountInField() == hiddenmap.getDotComAmountInField()){
            gameMap.showMap(1, 8);
            System.out.println("Sieg");
            System.exit(0);
        }
    }
}
