import java.io.Reader;
import java.util.Scanner;

public class Spielfeld {
    Zelle arrayGeheim[][] = new Zelle[9][9];

    public Spielfeld(){
        generateSpielfeld();
    }

    public void generateSpielfeld(){
        for(int i = 0; i < 9; i++){
            for(int j = 0;j < 9; j++){
                arrayGeheim[i][j] = new Zelle(i, j,0);
            }
        }
    }

    public void getSpielfeld(){
        for(int i = 0; i < 9; i++){
            for(int j = 0;j < 9; j++){
                Integer Wert = arrayGeheim[i][j].getWert();
                if(Wert == 0){
                    System.out.print("-");
                }
                else {
                    System.out.print(Wert);
                }
            }
            System.out.println();
        }
    }

    public void eingabe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie einen Spalten Wert ein");
        int x = 0;
        int y = 0;
        do{
            x = Integer.parseInt(scanner.nextLine());
        }while(x <= 0 || x >= 10);
            System.out.println("Geben sie einen Längen Wert ein");
        do{
            y = scanner.nextInt();
        }while(y <= 0 || y >= 10);
            System.out.println("Geben sie den Wert ein den sie füllen wollen");
        Integer inhalt = scanner.nextInt();
        arrayGeheim[x-1][y-1].setWert(inhalt);
    }

    public boolean ueberpruefenGewinn(){
        //Muss noch implementiert werden.
        return  false;
    }
}
