public class Sudoku {

    //Mit dieser Methode können Zahlen gesetzt werden
    //Es wird überprüft, ob in diesem Feld schon ein Wert eingetragen ist
    public static void setNumbers(int x, int y, int number) {
        if (sudoku[x][y] == null) {
            sudoku[x][y] = number;
        } else {
            System.out.println("ERROR: Field already occupied");
            System.out.println("Please enter new coordinates");
        }
    }

    //Daten werden auf die gesamte Spalte und Zeile überprüft
    //Ebenfalls wird überprüft, ob alle Felder abgefüllt sind
    public static void evaluation(){
        for(x=0; x<8; x++) {
            for(y=0; y<8; y++){
                if (sudoku[x][y] == null) {
                    System.out.println("ERROR: Please fill out whole Sudoku");
                }
            }
        }

        for(x=0; x<8; x++){
            int c = 0;
            for(int i = 0; i<8; i++) {
                if (sudoku[x][i] == sudoku[x][c]) {
                    System.out.println("ERROR: Sudoku wrong");
                }
                c++;
            }
        }

        for(y=0; y<8; y++){
            int b = 0;
            for(int i = 0; i<8; i++) {
                if (sudoku[i][y] == sudoku[b][y]) {
                    System.out.println("ERROR: Sudoku wrong");
                }
                b++;
            }
        }
    }

    //setzen der ersten Zahlen, bevor das Sudoku beginnt
    public static void seDefaultNumbers(int x, int y, int defnumber) {
        sudoku[x][y] = defnumber;
    }



    public static void main(String[] args) {
        //generiert ein zwei-dimensionales Array
        int[][] sudoku = new int[8][8];

        //setzt die ersten Zahlen, die schon zu beginn des Spieles eingetragen sind
        setDefaultNumbers(2, 5, 9);

        //Zahlen im Sudoku setzten
        setNumbers(1, 3, 5);
        setNumbers(2, 4, 9);

        //überprüfung
        evaluation();
    }
}
