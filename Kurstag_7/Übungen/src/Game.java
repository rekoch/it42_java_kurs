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
        fieldClass.fillField();
        System.out.println("Gib deine Koordinaten ein: ");
        int choosCoordinate = src.nextInt();

        cellClass.ckeckCell(choosCoordinate);
    }




}
