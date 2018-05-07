/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package Sudoku;

public class Sudoku {
    private int[][] sudoku = new int[9][9];

    public void setNumber(int number, int posx, int posy){
        sudoku[posx][posy] = number;
    }

    public void deleteNumber(int posx, int posy){
    sudoku[posx][posy] = 0;
    }

    public Sudoku() {
    this.sudoku = sudoku;
    }

    public int[][] getSudoku() {
    return sudoku;
    }

    public void setSudoku(int[][] sudoku) {
    this.sudoku = sudoku;
    }

    public void generateField(){

    }

    public void checkSudoku(){

    }
}