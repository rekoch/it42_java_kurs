public class Sudoku {

    public int[][] array;

    //Mit dieser Methode können Zahlen gesetzt werden
    //Es wird überprüft, ob in diesem Feld schon ein Wert eingetragen ist
    public void setNumbers(int x, int y, int number) {
        if (array[x][y] == 0) {
            array[x][y] = number;
        } else {
            System.out.println("ERROR: Field already occupied");
            System.out.println("Please enter new coordinates");
        }
    }

    //Daten werden auf die gesamte Spalte und Zeile überprüft
    //Ebenfalls wird überprüft, ob alle Felder abgefüllt sind
    public void evaluation(){
        for(int x=0; x<8; x++) {
            for(int y=0; y<8; y++){
                if (array[x][y] == 0) {
                    System.out.println("ERROR: Please fill out whole Sudoku");
                }
            }
        }

        for(int x=0; x<8; x++){
            int c = 0;
            for(int i = 0; i<8; i++) {
                if (array[x][i] == array[x][c]) {
                    System.out.println("ERROR: Sudoku wrong");
                }
                c++;
            }
        }

        for(int y=0; y<8; y++){
            int b = 0;
            for(int i = 0; i<8; i++) {
                if (array[i][y] == array[b][y]) {
                    System.out.println("ERROR: Sudoku wrong");
                }
                b++;
            }
        }
    }

    //setzen der ersten Zahlen, bevor das Sudoku beginnt
    public void setDefaultNumbers(int x, int y, int defnumber) {
        array[x][y] = defnumber;
    }

    public void setSudoku() {
        int[][] sudoku = new int[8][8];
        this.array = sudoku;
    }


    public static void main(String[] args) {
        //generiert ein zwei-dimensionales Array
        //int[][] sudoku = new int[8][8];

        //setzt die ersten Zahlen, die schon zu beginn des Spieles eingetragen sind
        Sudoku defaultNumbers = new Sudoku();
        defaultNumbers.setDefaultNumbers(2, 5, 9);

        //Zahlen im Sudoku setzten
        Sudoku setnumbers = new Sudoku();
        setnumbers.setNumbers(1, 3, 5);
        setnumbers.setNumbers(2, 4, 9);

        //überprüfung
        Sudoku evaluation = new Sudoku();
        evaluation.evaluation();
    }
}
