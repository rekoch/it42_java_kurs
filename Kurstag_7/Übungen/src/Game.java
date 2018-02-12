import java.util.Scanner;
import java.io.*;

public class Game {
    Field fieldClass = new Field();
    Cell cellClass = new Cell();
    Scanner src = new Scanner(System.in);

    public Game(){
        this.startGame();
    }

    private void startGame(){
        System.out.println("Willkommen mein Bootsführer\nWie du Unten sehen kannst, haben wir eine kleine Karte, auf welchem sich versteckte Boote befinden.\nDein Ziel ist es diese zu finden und sie Zu elimnieren. Gib mir einfach die Koordinaten,\nWo du die Racketen feuern möchtest.(z.B 3 5)\n ");
        fieldClass.generateField();
        String[][] workArray = fieldClass.fillField();
        String[][] showArray = fieldClass.showArray;
        for ( int zeile = 0; zeile < workArray.length; zeile++ )
        {
            for ( int spalte=0; spalte < workArray[zeile].length; spalte++ )
                System.out.print( workArray[zeile][spalte] + "  ");
            System.out.println();
        }
        System.out.println("Gib deine Koordinaten ein: ");
        String choosCoordinate = src.nextLine();
        String[] array1 = choosCoordinate.split(" ");
        int Y = Integer.parseInt(array1[0]);
        int X = Integer.parseInt(array1[1]);
        for ( int zeile = 0; zeile < showArray.length; zeile++ )
        {
            for ( int spalte=0; spalte < showArray[zeile].length; spalte++ )
                System.out.print( showArray[zeile][spalte] + "  ");
            System.out.println();
        }
        cellClass.ckeckCell(Y,X, workArray, showArray);
    }




}
