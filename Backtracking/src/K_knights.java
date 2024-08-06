// https://youtu.be/OBSqZ2L0G10?si=gM4VZxkUwfStEmUa

// place n knights in a nxn chess board; in such a way they don't attack each other.
// 👉👉 we can put n nights in either (n rows) or (n columns) because knights can't attack each other on a single line.

// Tell the maximum number of knights that can be placed in a given nxn chess board.  👇👇👇
public class K_knights {

    static int maxKnights = -1;

    static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        int i, j;
        // up-left (2up-1left)
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') return false;

        // up-right (2up-1right)
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == 'K') return false;

        // down-left (2down-1left)
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'K') return false;

        // down-right (2down-1right)
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == 'K') return false;

        // left-up (2left-1up)
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') return false;

        // left-down (2left-1down)
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == 'K') return false;

        // right-up (2right-1up)
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'K') return false;

        // right-down (2right-1down)
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'K') return false;

        return true;
    }

    static void nKnights(char[][] board, int row, int col, int num) {
        int n = board.length;

        // base condition
        if (n == row) {
            printBoard(board, num);
            maxKnights = Math.max(maxKnights, num);
            return;
        } else if (isSafe(board, row, col)) {
            board[row][col] = 'K';
            if (col != n - 1) nKnights(board, row, col + 1, num + 1);
            else nKnights(board, row + 1, 0, num + 1);
            // replacing prev "K" with "x"
            board[row][col] = 'X';  // backtracking step
        }

        if (col != n - 1) nKnights(board, row, col + 1, num);
        else nKnights(board, row + 1, 0, num);
    }

    static int noOfKnights = 4;  // mentioned number of Knights; must be present on the board.
    static void printBoard(char[][] board, int num) {
        // print all possible layouts containing knights
//        System.out.println("-------- chess board --------");
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }

        // print only the layouts containing mentioned number of nights
        if(noOfKnights == num){
            System.out.println("-------- chess board --------");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nKnights(board, 0, 0, 0);
        System.out.println("Max knights that can be placed in the chess board: "+maxKnights);
    }
}

