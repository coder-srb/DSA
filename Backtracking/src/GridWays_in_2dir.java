// GridWays_in_2dir
// find number of ways to reach from (0,0) to (n-1, m-1) in  n x m grid. Allowed moves => right or down only
// Rat in maze moving in only 2 directions(down & Right) https://youtu.be/PAgvK1Oku6U?si=55IVj5MqxaBzo0v9

public class GridWays_in_2dir {

    // total number of ways in which we can move from start to end.
    static int TotalNumberOfWays(int sr, int sc, int er, int ec) {
        //base condition
        if (sr == er && sc == ec) {  // condition for last cell
            return 1;
        } else if (sr > er || sc > ec) {  // condition for boundary-cross
            return 0;
        }

        int downWays = TotalNumberOfWays(sr + 1, sc, er, ec);  // moving down
        int rigthWays = TotalNumberOfWays(sr, sc + 1, er, ec);  // moving right
        return downWays + rigthWays;  // total number of ways
    }

    static void printPaths(int sr, int sc, int er, int ec, String path) {
        if (sr == er && sc == ec) {
            System.out.println(path);
            return;
        }
        if (sr > er || sc > ec) {
            return;
        }
        printPaths(sr + 1, sc, er, ec, path + "D"); // Down movement
        printPaths(sr, sc + 1, er, ec, path + "R"); // Right movement
    }

    public static void main(String[] args) {
        int endingRow = 3, endingCol = 3;
        System.out.println(TotalNumberOfWays(1, 1, endingRow, endingCol));
        printPaths(0, 0, endingRow - 1, endingCol - 1, "");
    }
}
