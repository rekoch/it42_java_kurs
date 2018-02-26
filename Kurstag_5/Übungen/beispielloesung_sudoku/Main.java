/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */


/**
 * Zeigt die Verwendung der Sudoku-Klassen auf.
 */
public class Main {

    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();

        sudoku.setzeInitialWert(2, 3, 9);
        sudoku.setzeInitialWert(1, 6, 4);
        //...

        sudoku.setzeWert(1, 3, 2);
        System.out.println(sudoku.istFertigAusgefuellt());
        System.out.println(sudoku.istKonfliktFrei());
        System.out.println(sudoku.istGeloest());

        sudoku.setzeWert(2, 6, 4);
        System.out.println(sudoku.istFertigAusgefuellt());
        System.out.println(sudoku.istKonfliktFrei());
        System.out.println(sudoku.istGeloest());

        sudoku.setzeWert(2, 6, null); // Wert zuruecksetzen
        System.out.println(sudoku.istFertigAusgefuellt());
        System.out.println(sudoku.istKonfliktFrei());
        System.out.println(sudoku.istGeloest());

        sudoku.setzeWert(7, 5, 2);
        System.out.println(sudoku.istFertigAusgefuellt());
        System.out.println(sudoku.istKonfliktFrei());
        System.out.println(sudoku.istGeloest());
        //...

        sudoku.zeigen();
    }
}
