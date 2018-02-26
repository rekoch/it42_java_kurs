import java.util.Random;

public class Spielfeld {
    Zelle[][] zelle = new Zelle[10][10];

    public Spielfeld(){
        loadSpielfeld();
        setSchiffe();
    }

    //Generiert ein leeres Spielfeld mit Zellen Objekten
    public void loadSpielfeld(){
        for (int i = 0; i < zelle.length; i++){
            for(int j = 0; j < zelle.length;j++){
                zelle[i][j] = new Zelle(i, j, false);
            }
        }
    }

    //Setzt 10 Schiffe
    public void setSchiffe(){
        Random random = new Random();
        int x;
        int y;
        for(int i = 0; i < 10; i++){
            do{
                x = random.nextInt(10);
                y = random.nextInt(10);
            }
            while(setSchiff(x, y));
        }
    }

    //Überprüft ob auf einem Feld schon ein Schiff ist und setzt ein wenn dies false ist
    public boolean setSchiff(int x, int y){
        if(zelle[x][y].getIsSchiff() == false){
            zelle[x][y].setSchiff(true);
            return false;
        }
        else{
            return true;
        }
    }

    //Zeigt das ganze Spielfeld an. 0 für leere Felder und 1 für Schiffe
    public void showSpielfeld(){
        System.out.println("     1.  2.  3.  4.  5.  6.  7.  8.  9. 10.");
        for (int i = 0; i < zelle.length; i++){
            System.out.print((i + 1)+ ".");
            for(int j = 0; j < zelle.length;j++){
                if(zelle[i][j].getIsSchiff()){
                    System.out.print("   +");
                }
                else{
                    System.out.print("   O");
                }
            }
            System.out.println();
        }
    }

    //Zeigt das Spielfeld in der Form an wie es schon bespielt wurde
    public void showSpielfeldPlayView(){
        System.out.println("     1.  2.  3.  4.  5.  6.  7.  8.  9. 10.");
        for (int i = 0; i < zelle.length; i++) {
            System.out.print((i + 1) + ".");
            for (int j = 0; j < zelle.length; j++) {
                if (zelle[i][j].isHit() && zelle[i][j].getIsSchiff()) {
                    System.out.print("   +");
                } else if (zelle[i][j].isHit()) {
                    System.out.print("   O");
                } else {
                    System.out.print("   -");
                }
            }
            System.out.println();
        }
    }
}
