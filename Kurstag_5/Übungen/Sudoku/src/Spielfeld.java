import java.security.spec.ECField;

public class Spielfeld
{
    String[][] spielfeld = new String[9][9];
    int counter;

    public void spielfeldGenerieren()
    {
        for(int x = 0; x < 9; x++)
        {
            for(int y = 0; y < 9; y++)
            {
            spielfeld[x][y] = " ";
        }
        }
    }
    public void spielFeldAnzeigen()
    {
        int x = 0;
        int y = 0;

        for (x = 0; x < 9; x++)
        {
            for (y = 0; y < 9; y++)
            {
                System.out.print(spielfeld[x][y] + "\t");
            }
            System.out.println("");
        }


    }

    public void spielFeldFuellen()
    {
        int zufallX;
        int zufallY;
        int zufallsZahl;

        for(int i = 0; i < 9;)
        {
            zufallX = (int) (Math.random() * 9);
            zufallY = (int) (Math.random() * 9);
            zufallsZahl = (int) (Math.random() * 9);

            if(spielfeld[zufallX][zufallY].equals(" ") && xUeberpuefen(zufallX, zufallY, zufallsZahl) && yUeberpuefen(zufallX, zufallY, zufallsZahl) && feldUeberpuefen(zufallX, zufallY, zufallsZahl))
            {
                spielfeld[zufallX][zufallY] = Integer.toString(zufallsZahl);
                i++;
            }
        }
    }

    public boolean feldUeberpuefen(int xPosition, int yPosition, int zufallzahl)
    {
        for (int x = 0; x < 9; x++)
        {

        }
        return true;
    }

    public boolean yUeberpuefen(int xPosition, int yPosition, int zufallszahl)
    {
        counter = 0;
        for (int y = 0; y < 9; y++)
        {
            if(spielfeld[xPosition][y].equals(zufallszahl))
            {
                counter++;
            }
        }
        if (counter < 2)
        {
            return true;
        }
        return false;
    }

    /*public static void main(String[]args) throws Exception
    {
        Spielfeld spielfeld = new Spielfeld();
        boolean aa = spielfeld.xUeberpuefen(3, 3, 1);
        boolean bb = false;
    }*/

    public boolean xUeberpuefen(int xPosition, int yPosition, int zufallszahl)
    {
        counter = 0;
        for (int x = 0; x < 9; x++)
        {
            if(spielfeld[x][yPosition].equals(zufallszahl))
            {
                counter++;
            }
        }
        if (counter < 2)
        {
            return true;
        }
        return false;
    }
}
