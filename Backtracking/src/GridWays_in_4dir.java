// gridWays_in_4directions
// find number of ways to reach from (0,0) to (n-1, m-1) in  n x m grid. Allowed moves => right or down or left or up
// rat in maze moving in all 4 directions

//https://www.youtube.com/watch?v=PAgvK1Oku6U&t=1357s

public class GridWays_in_4dir {
    public static void printMazePath(int startingRow, int startingCol, int endingRow, int endingCol, boolean[][] isVisited, String path) {
        // base case
        if (startingRow > endingRow || startingCol > endingCol || startingRow < 0 || startingCol < 0) {  // condition for boundary-cross
            return;
        }
        if (startingRow == endingRow && startingCol == endingCol) {   // condition for last cell
            System.out.println(path);
            return;
        }
        if (isVisited[startingRow][startingCol] == true) return;     // if the cell is already visited then return

        isVisited[startingRow][startingCol] = true;  // update isVisited
        // go down
        printMazePath(startingRow + 1, startingCol, endingRow, endingCol, isVisited, path + "D");
        // go Right
        printMazePath(startingRow, startingCol + 1, endingRow, endingCol, isVisited, path + "R");
        // go Left
        printMazePath(startingRow, startingCol - 1, endingRow, endingCol, isVisited, path + "L");
        // go Up
        printMazePath(startingRow - 1, startingCol, endingRow, endingCol, isVisited, path + "U");

        isVisited[startingRow][startingCol] = false;    // backtracking

    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        boolean[][] isVisited = new boolean[m][n];
        printMazePath(0, 0, m - 1, n - 1, isVisited, "");
    }
}
