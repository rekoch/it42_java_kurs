public class Cell {
    int counter= 0;
    public int ckeckCell(int Y, int X, String[][] workArray, String[][] showArray){
        if(workArray[Y][X] =="X"){
            System.out.println("\nDu hast ein Schiff getroffen");
            showArray[Y][X] = "X";
            counter++;
            for ( int zeile = 0; zeile < showArray.length; zeile++ )
            {
                for ( int spalte=0; spalte < showArray[zeile].length; spalte++ )
                System.out.print( showArray[zeile][spalte] + "  ");
                System.out.println();
            }
        }
        else{
            System.out.println("\nDu hast kein Schiff getroffen");
            showArray[Y][X] = "~";

            for ( int zeile = 0; zeile < showArray.length; zeile++ )
            {
                for ( int spalte=0; spalte < showArray[zeile].length; spalte++ )
                    System.out.print( showArray[zeile][spalte] + "  ");
                System.out.println();
            }
        }
        return counter;
    }
}
