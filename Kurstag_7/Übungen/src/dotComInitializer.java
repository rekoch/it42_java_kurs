/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.Scanner;

public class dotComInitializer {
    private Scanner scanner = new Scanner(System.in);

    public int initGame(){
        System.out.println("************************************************");
        System.out.println("**Herzlich Willkommen zum .com-Versenken-Spiel**");
        System.out.println("************************************************");

        boolean isCorrect = false;
        int fieldSize = 8;
        while(!isCorrect){
            System.out.println("\nGeben Sie die Feldgrösse an. Sie muss mindestens 9 sein");
            String input = scanner.nextLine();
            if(input.matches("[0-9]+")){
                fieldSize = Integer.parseInt(input);
                if(fieldSize >= 8){
                    isCorrect = true;
                }else{
                    System.out.println("zu klein");
                }
            }else{
                System.out.println("Falsche Eingabe");
            }
        }
        return fieldSize;

    }
}
