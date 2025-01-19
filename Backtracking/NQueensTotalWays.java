package Backtracking;

public class NQueensTotalWays {
    //to count number of ways to put the n queens in n*n chess board
    static int count=0;

    //to check if the position is attackable by other previous queens or not
    public static boolean isSafe(char[][] arr, int row, int coloumn){
        //to check in upword direction
        for(int i=row; i>=0; i--){
            if(arr[i][coloumn] == 'Q'){
                return false;
            }
        }
        //to check in left upward diagonal
        int i=row;
        int j=coloumn;
        while(i>=0 && j>=0){
            if(arr[i][j] == 'Q'){
                return false;
            }
            i--;j--;
        }

        //to check right upward diagonal
        while(row>=0 && coloumn<arr[0].length){
            if(arr[row][coloumn] == 'Q'){
                return false;
            }
            row--;
            coloumn++;
        }
        return true;
    }

    //to place the queens
    public static void nQueens(char[][] arr, int row){
        //when we reach the end of the board 
        if(row == arr.length){
            count++; //increase the count
            return;
        }
        //work
        for(int i=0; i<arr.length; i++){
            //checking if its safe to put the queen
            if(isSafe(arr, row, i)){
                arr[row][i] = 'Q'; //putting the queen
                nQueens(arr, row+1); //going to next row
                arr[row][i] = '*'; //backtracking and removing the queen
            }
        }
    }
    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                board[i][j] = '*';
            }
        }
        nQueens(board, 0);
        System.out.println("There are total of "+count+" ways to put "+n+" Queens in "+n+"x"+n+" Chess Board.");
    }
}
