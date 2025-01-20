package Backtracking;

public class Sudoku {
    public static void printSudoku(int[][] sudoku){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] arr, int row, int coloumn, int num){
        //check in the row
        for (int i=0; i<9; i++){
            if(arr[row][i] == num){
                return false;
            }
        }

        //check in the coloumn
        for (int i=0; i<9; i++){
            if(arr[i][coloumn] == num){
                return false;
            }
        }

        //checking in the matrix
        int r = (row/3) * 3; //always retunr either 0, 3, 6 which are the starting point of the matrix
        int c = (coloumn/3) *3;

        for(int i=r; i<r+3; i++){
            for(int j=c; j<c+3; j++){
                if(arr[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solveSudoku(int[][] arr, int row, int coloumn){
        //recusion
        //if we reach beyond the column index, its time to switch the row to next one 
        if(coloumn + 1 == 9){
            row = row+1;
            coloumn = 0;
        }
        
        
        //base case when we reach beyond the end of the sudoku
        if(row == 9){
            printSudoku(arr);
            return true;
        }

        
        

        //checking if the particular box alreayd contains a pre filled number
        if(arr[row][coloumn] != 0){
            return solveSudoku(arr, row, coloumn+1);
        }
        
        //work
        for(int i=1; i<10; i++){
            if(isSafe(arr, row, coloumn, i)){
                arr[row][coloumn] = i;
                if(solveSudoku(arr, row, coloumn+1)){
                    return true;
                }
                arr[row][coloumn] = 0;        
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] sudokuPuzzle = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(!solveSudoku(sudokuPuzzle, 0, 0)){
            System.out.println("Solution does not exist");
        }

    }
}
