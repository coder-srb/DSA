// place N queens on an NxN chessboard such that no 2 queens can attack each other. Find all the possible ways.

public class NQueens_all_Solutions {

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

    static void nQueens_allWays(char[][] board, int row) {
        // base condition
        if (board.length == row) {
            printBoard(board);
            count++;  // total ways to solve NQueens_all_Solutions problem
            return;
        }

//        // column loop; find all the ways in which queens can be arranged without considering any attack.
//        for (int col = 0; col < board.length; col++) {
//            board[row][col] = 'Q';
//            nQueens_allWays(board, row + 1);
//            // replacing prev "Q" with "."
//            board[row][col] = 'X';  // backtracking step
//        }

        // find the safe way in which queens won't attack each other
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens_allWays(board, row + 1);
                // replacing prev "Q" with "X"
                board[row][col] = 'X';  // backtracking step
            }
        }
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
        nQueens_allWays(board, 0);
        System.out.println("total ways to solve NQueens_all_Solutions problem: "+count);
    }
}
