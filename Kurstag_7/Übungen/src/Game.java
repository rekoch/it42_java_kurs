import java.util.Scanner;

public class Game {
    Field fieldClass = new Field();
    Cell cellClass = new Cell();
    Scanner src = new Scanner(System.in);
    String[][] workArray = fieldClass.fillField();
    String[][] showArray = fieldClass.showArray;
    int counter;
    int tries = 0;

    public Game(){
        this.startGame();
    }

    private void startGame(){
        System.out.println("Willkommen mein Bootsführer\nWie du Unten sehen kannst, haben wir eine kleine Karte, auf welchem sich versteckte Boote befinden.\nDein Ziel ist es diese zu finden und sie Zu elimnieren. Gib mir einfach die Koordinaten,\nWo du die Racketen feuern möchtest.(y x)(z.B 3 5)\n ");
        fieldClass.generateField();
        for ( int zeile = 0; zeile < workArray.length; zeile++ )
        {
            for ( int spalte=0; spalte < workArray[zeile].length; spalte++ )
                System.out.print( workArray[zeile][spalte] + "  ");
            System.out.println();
        }
        gameProcedure();

    }

    public void gameProcedure(){
        while (wonGame(counter, tries)== false) {
            System.out.println("Gib deine Koordinaten ein: ");
            String choosCoordinate = src.nextLine();
            String[] array1 = choosCoordinate.split(" ");
            int Y = Integer.parseInt(array1[0]);
            int X = Integer.parseInt(array1[1]);
            counter = cellClass.ckeckCell(Y, X, workArray, showArray);
            tries++;
        }
        wonGame(counter, tries);
    }



    public boolean wonGame(int counter,int tries){
        if(counter == 12){
            System.out.println("Du hast das spiel mit "+ tries +" GEWONNEN!!");
            return true;
        }
        else
            return false;

    }



}
