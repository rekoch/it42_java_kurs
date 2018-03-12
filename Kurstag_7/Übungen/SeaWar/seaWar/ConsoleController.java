package seaWar;

import java.util.Scanner;

public class ConsoleController {
    private int inputLength;
    private int inputHeigth;

    ConsoleController() {
        createGameField();
    }

    protected void displayField(String[][] field) {
        System.out.println("");
        System.out.println("Welcome To Sea-War");
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        System.out.print("  ");
        for (int i = 0; i < inputLength; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 0; i < field.length; i++) {
            System.out.print(alphabet[i] + " ");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }
    }

    private void createGameField() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sea-War");
        System.out.println("How big should be the GameField?");
        System.out.print("Your length:");
        inputLength = sc.nextInt();
        System.out.print("Your height:");
        inputHeigth = sc.nextInt();
    }

    public int getInputHeigth() {
        return inputHeigth;
    }

    public int getInputLength() {
        return inputLength;
    }
}
