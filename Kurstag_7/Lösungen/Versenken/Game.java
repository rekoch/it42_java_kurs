import java.io.IOException;
import java.util.Scanner;

public class Game extends Grundmethoden {

    Scanner scanner = new Scanner(System.in);
    String eingabe = "";
    Spielfeld spielfeld = new Spielfeld();

    public Game(){
        gameAblauf();
    }

    //Steuert den ganzen Ablauf des Spieles
    public void gameAblauf(){
        gameStart();
        int versuche = gameSpiel();
        gameEnde(versuche);
    }

    //Start des Spieles mit diversen Ausgaben
    public void gameStart(){
        print("Willkommen zum Schiffe versenken");
        print("--------------------------------");
        spielfeld.showSpielfeld();
        print("--------------------------------");
        print("Wenn sie sich das Spielfeld gemerkt haben, dann Tippen sie Start");
        print("--------------------------------");
        do{
            eingabe = scanner.nextLine();
        }while(!eingabe.equalsIgnoreCase("Start"));
        for(int i = 0; i < 20000; i++){
            print("");
        }
    }

    //Ablauf des Spieles
    public int gameSpiel(){
        //Lokale Variable
        int schiffCounter = 0;
        int versuchCounter = 0;
        int x;
        int y;

        do{
            do {
                print("Geben sie zuerst die x und dann die y Kordinate ein.");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
                System.out.println(x);
                System.out.println(y);
            }while(x < 0 || x >= 10 || y < 0 || y >= 10);

            if(spielfeld.zelle[x][y].getIsSchiff() && spielfeld.zelle[x][y].isHit() == false) {
                spielfeld.zelle[x][y].isHit = true;
                schiffCounter++;
                versuchCounter++;
                print("Sie haben ein Schiff getroffen");
            }
            else if(spielfeld.zelle[x][y].isHit()){
                print("Sie haben ein Feld ausgewählt, welches schon aufgedeckt wurde");
            }
            else{
                spielfeld.zelle[x][y].isHit = true;
                versuchCounter++;
                print("Sie haben ein Wasserfeld getroffen");
            }

            spielfeld.showSpielfeldPlayView();

        }while(schiffCounter != 10);
        return versuchCounter;
    }

    public void gameEnde(int versuche){
        print("Sie haben " + versuche + " Versuche benötigt um alle Schiffe aufzudecken");
        if(versuche < 15){
            print("Dies ist eine sehr gute Leistung");
        }
        else if(versuche > 14 && versuche < 50){
            print("Ordendliche Leistung");
        }
        else{
            print("Schwache Leistung. Versuche es noch einmal besser");
        }
    }

}

