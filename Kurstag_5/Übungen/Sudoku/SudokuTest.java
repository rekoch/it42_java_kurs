/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

public class SudokuTest {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        int[][] pf = sudoku.getSudoku();

        sudoku.setNumber(1,1,1);
        sudoku.deleteNumber(1, 1);
    }



}
