public class Ablauf {
    public static void main(String[] args){
        Spielfeld spielfeld = new Spielfeld();
        spielfeld.getSpielfeld();
        boolean gewonnen = false;
        while(gewonnen == false){
            spielfeld.eingabe();
            spielfeld.getSpielfeld();
            spielfeld.ueberpruefenGewinn();
        }
    }
}
