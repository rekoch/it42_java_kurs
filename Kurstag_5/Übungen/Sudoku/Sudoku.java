public class Sudoku {

    public static void setNumbers(int x, int y, int number) {
        if (sudoku[x][y] == null) {
            sudoku[x][y] = number;
        } else {
            System.out.println("ERROR: Field already occupied");
            System.out.println("Please enter new coordinates");
        }
    }

    public void evalutaion(){
        for(x=0; x<8; x++) {
            for(y=0; y<8; y++){
                if (sudoku[x][y] == null) {
                    System.out.println("ERROR: Please fill out whole Sudoku");
                }
            }
        }

        for(x=0; x<8; x++){
            for(int i = 0; i<8; i++) {

            }
        }
    }


    public static void seDefaultNumbers(int x, int y, int defnumber) {
        sudoku[x][y] = defnumber;
    }



    public static void main(String[] args) {
        int[][] sudoku = new matchfield[8][8];

        setDefaultNumbers(2, 5, 9);

        setNumbers(1, 3, 5);
        setNumbers(2, 4, 9);
    }
}
