public class MainSudoku
{
    public static void main(String[] args)
    {
        Spielfeld spielfeld = new Spielfeld();
        spielfeld.spielfeldGenerieren();
        spielfeld.spielFeldFuellen();
        spielfeld.spielFeldAnzeigen();
    }
}
