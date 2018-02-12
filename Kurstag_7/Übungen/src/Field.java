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

    String[][] workArray = {                                //Sehr hässliche Möglichkeit zum Deklarieren
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


    Random rnd = new Random();
/*-------------------------------------METHODEN------------------------------------------------------*/

    public String[][] generateField() {
        // das Array ausgeben
        for ( int zeile = 0; zeile < showArray.length; zeile++ )
        {
            for ( int spalte=0; spalte < showArray[zeile].length; spalte++ )
                System.out.print( showArray[zeile][spalte] + "  ");
            System.out.println();
        }
        return showArray;
    }

    public String[][] fillField(){
        for(int k = 0; k <4;k++) {
            //koordinaten überprüfen
            int coordinatesX = rnd.nextInt(9) + 1;
            int coordinatesY = rnd.nextInt(9) + 1;
            if(coordinatesX == 1){
                if(workArray[coordinatesY][coordinatesX] == "X" || workArray[coordinatesY][coordinatesX+1] == "X" || workArray[coordinatesY][coordinatesX+2] == "X" ) {
                    coordinatesX = rnd.nextInt(9) + 1;
                    coordinatesY = rnd.nextInt(9) + 1;
                }
            }else if(coordinatesX == 9){
                if(workArray[coordinatesY][coordinatesX] == "X" || workArray[coordinatesY][coordinatesX-1] == "X" || workArray[coordinatesY][coordinatesX-2] == "X" ) {
                    coordinatesX = rnd.nextInt(9) + 1;
                    coordinatesY = rnd.nextInt(9) + 1;
                }
            }
            else{
                if(workArray[coordinatesY][coordinatesX] == "X" || workArray[coordinatesY][coordinatesX+1] == "X" || workArray[coordinatesY][coordinatesX-1] == "X" ) {
                    coordinatesX = rnd.nextInt(9) + 1;
                    coordinatesY = rnd.nextInt(9) + 1;
                }
            }

            //Setzten der Schiffe
            workArray[coordinatesY][coordinatesX] = "X";
                for (int i = 1; i < 3; i++) {
                    if (coordinatesX == 1) {
                        int coordinatesXcal = coordinatesX + i;
                        workArray[coordinatesY][coordinatesXcal] = "X";
                    } else if (coordinatesX == 9) {
                        int coordinatesXcal = coordinatesX - i;
                        workArray[coordinatesY][coordinatesXcal] = "X";
                    } else {
                        int coordinatesXcal = coordinatesX + 1;
                        workArray[coordinatesY][coordinatesXcal] = "X";
                        int coordinatesXcal2 = coordinatesX - 1;
                        workArray[coordinatesY][coordinatesXcal2] = "X";
                    }
                }
            }




            //ausgabe
        /*for ( int zeile = 0; zeile < workArray.length; zeile++ )
        {
            for ( int spalte=0; spalte < workArray[zeile].length; spalte++ )
                System.out.print( workArray[zeile][spalte] + "  ");
            System.out.println();
        }*/
        return workArray;
    }
}