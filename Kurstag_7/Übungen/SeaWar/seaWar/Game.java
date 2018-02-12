package seaWar;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private static SeaWarField swf = new SeaWarField(7, 7);

    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }

    private void displayField(String[][] field) {
        System.out.println("  A B C D E F G");
        for (int i = 0; i < field.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }
    }

    private void playGame() {
        boolean notFinishedYet = true;
        int tries = 1;

        startScreen();
        System.out.println("A Guess may be: A;0");
        while (notFinishedYet) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Take your " + tries + " attempt:");
            String n = reader.next();
            String[] position = n.split(";", 2);
            if(swf.findShipPosition(position)){
                changeGameField(position);
                displayField(swf.getField());
            } else {
                System.out.println("Don't waste your munition. There is nothing here: " + n);
            }
            tries++;
        }
    }

    private void changeGameField(String[] position) {
        String[][] tempField = swf.getField();
        int pos2, pos1;
        switch (position[0]) {
            case "A":
                pos2 = 0;
                pos1 = Integer.parseInt(position[1]);
                tempField[pos1][pos2] = "X ";
                swf.setField(tempField);
                break;
            case "B":
                pos2 = 1;
                pos1 = Integer.parseInt(position[1]);
                tempField[pos1][pos2] = "X ";
                swf.setField(tempField);
                break;
            case "C":
                pos2 = 2;
                pos1 = Integer.parseInt(position[1]);
                tempField[pos1][pos2] = "X ";
                swf.setField(tempField);
                break;
            case "D":
                pos2 = 3;
                pos1 = Integer.parseInt(position[1]);
                tempField[pos1][pos2] = "X ";
                swf.setField(tempField);
                break;
            case "E":
                pos2 = 4;
                pos1 = Integer.parseInt(position[1]);
                tempField[pos1][pos2] = "X ";
                swf.setField(tempField);
                break;
            case "F":
                pos2 = 5;
                pos1 = Integer.parseInt(position[1]);
                tempField[pos1][pos2] = "X ";
                swf.setField(tempField);
                break;
            case "G":
                pos2 = 6;
                pos1 = Integer.parseInt(position[1]);
                tempField[pos1][pos2] = "X ";
                swf.setField(tempField);
                break;
            default:
                break;
        }
    }

    private void startScreen() {
        boolean inputIsNotCorrect = true;

        System.out.println("    Sea-War");
        displayField(swf.getField());
        System.out.println("");
        System.out.println("There are 4 ships:");
        System.out.println("Aircraft Carrier: X X X X");
        System.out.println("Destroyer: X X X");
        System.out.println("Brig: X X");
        System.out.println("Karve: X");
        System.out.println("");
        System.out.println("Guess where the ships are ;)");
    }
}