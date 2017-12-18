/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

import java.util.Scanner;

class Field {
    private final Scanner scanner = new Scanner(System.in);
    private Cell[][] field;
    private int x;
    private int y;
    private String value;

    public Field(){
        generateField();
        startGame();
    }

    private void generateField(){
        field = new Cell[9][9];
        initField();
    }

    private void initField(){
        for (int y = 0; y < 9; y++){
            for (int x = 0; x < 9; x++){
                field[x][y] = new Cell(".");
            }
        }
        doStupidHardcode();
    }

    private void doStupidHardcode(){
        field[0][0].setValue("3");
        field[0][3].setValue("7");
        field[1][1].setValue("2");
        field[1][5].setValue("3");
        field[1][7].setValue("4");
        field[2][0].setValue("5");
        field[2][4].setValue("8");
        field[2][6].setValue("1");
        field[2][8].setValue("3");
        field[3][1].setValue("6");
        field[3][4].setValue("7");
        field[4][3].setValue("4");
        field[4][5].setValue("8");
        field[5][4].setValue("6");
        field[5][7].setValue("2");
        field[6][0].setValue("9");
        field[6][2].setValue("7");
        field[6][4].setValue("3");
        field[6][8].setValue("4");
        field[7][2].setValue("3");
        field[7][3].setValue("9");
        field[7][7].setValue("1");
        field[8][5].setValue("4");
        field[8][8].setValue("5");
    }

    private void startGame(){
        while (true){
            showField();
            readInput();
            setValues();
        }
    }

    private void readInput(){
        System.out.println("Geben Sie die Position an: (Format: 1,5) ");
        String input = scanner.nextLine();
        x = Integer.parseInt(input.split(",")[0]);
        y = Integer.parseInt(input.split(",")[1]);

        System.out.println("Geben Sie den Wert ein: (Format: 4)");
        value = scanner.nextLine();
    }

    private void setValues() {
        field[x][y].setValue(value);
    }

    private void showField(){
        for (int y = 0; y < 9; y++){
            for (int x = 0; x < 9; x++){
                System.out.print(field[x][y].getValue() + "    ");
                if(x == 2){
                    System.out.print("|    ");
                }else if(x == 5){
                    System.out.print("|    ");
                }
            }
            if(y == 2){
                System.out.print("\n---------------------------------------------------");
            }else if(y == 5){
                System.out.print("\n---------------------------------------------------");
            }
            System.out.print("\n");
        }
    }
}
