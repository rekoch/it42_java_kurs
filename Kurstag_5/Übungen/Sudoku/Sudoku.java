/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

import java.util.Random;

public class Sudoku {
    private int[][] sudoku = new int[9][9];

    public void setNumber(int number, int posx, int posy){
        sudoku[posx][posy] = number;
        //check if Sudoku filled
        checkSudoku();
    }

    public void deleteNumber(int posx, int posy){
        sudoku[posx][posy] = 0;
    }

    public Sudoku() {
        this.sudoku = sudoku;
        Random rand = new Random();
        int randomNum = rand.nextInt((9 - 1) + 1) + 1;
    }

    public int[][] getSudoku() {
        return sudoku;
    }

    public void checkSudoku(){

    }
}
