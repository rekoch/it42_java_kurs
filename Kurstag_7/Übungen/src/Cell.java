public class Cell {

    public void ckeckCell(int Y, int X, String[][] showArray, String[][] workArray){
        if(workArray[Y][X] =="X"){
            System.out.println("\nDu hast ein Schiff getroffen");
            showArray[Y][X] = "X";

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
    }
}
