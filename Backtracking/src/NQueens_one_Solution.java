// place N queens on an NxN chessboard such that no 2 queens can attack each other. give only one solution.

public class NQueens_one_Solution {

    static boolean isSafe(char[][] board, int row, int col) {
        // check vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // check diagonally left-up
        for (int i =row-1, j= col-1; i>=0 && j>=0 ;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // check diagonally right-up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    static boolean nQueens_allWays(char[][] board, int row) {
        // base condition
        if (board.length == row) {
            return true;
        }

        // find the safe way in which queens won't attack each other
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                if (nQueens_allWays(board, row + 1)){
                    return true;
                }
                // replacing prev "Q" with "X"
                board[row][col] = 'X';  // backtracking step
            }
        }
        return false;
    }

    static void printBoard(char[][] board) {
        System.out.println("-------- chess board --------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        if (nQueens_allWays(board, 0)){
            System.out.println("solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }

    }
}








