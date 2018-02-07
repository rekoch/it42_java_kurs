import java.util.Random;

public class Field {

/*-------------------------------------DEKLARIEREN--------------------------------------------------*/
    String[][] showArray = {                                //Sehr hässliche Möglichkeit zum Deklarieren
            { " ","1","2","3","4","5","6","7","8","9"},
            { "1"," "," "," "," "," "," "," "," "," "},
            { "2"," "," "," "," "," "," "," "," "," "},
            { "3"," "," "," "," "," "," "," "," "," "},
            { "4"," "," "," "," "," "," "," "," "," "},
            { "5"," "," "," "," "," "," "," "," "," "},
            { "6"," "," "," "," "," "," "," "," "," "},
            { "7"," "," "," "," "," "," "," "," "," "},
            { "8"," "," "," "," "," "," "," "," "," "},
            { "9"," "," "," "," "," "," "," "," "," "},
    };

    String[][] workArray = showArray.clone();

    Random rnd = new Random();
/*-------------------------------------METHODEN------------------------------------------------------*/

    public void generateField() {
        // das Array ausgeben
        for ( int zeile = 0; zeile < showArray.length; zeile++ )
        {
            for ( int spalte=0; spalte < showArray[zeile].length; spalte++ )
                System.out.print( showArray[zeile][spalte] + "  ");
            System.out.println();
        }
        System.out.println("---------------------------------------------------------");
    }

    public void fillField(){
        int coordinatesX = rnd.nextInt(9)+1;
        int coordinatesY = rnd.nextInt(9 )+1;

        workArray[coordinatesY][coordinatesX] = "X";

        for ( int zeile = 0; zeile < workArray.length; zeile++ )
        {
            for ( int spalte=0; spalte < workArray[zeile].length; spalte++ )
                System.out.print( workArray[zeile][spalte] + "  ");
            System.out.println();
        }
        System.out.println(coordinatesY +" "+coordinatesX);
    }
}