/*
A maze is an N°N binary matrix of blocks where the upper left block is known as the Source block, and the lower rightmost block is known as the Destination block.
If we consider the maze, then maze[0][0] is the source, and maze [N-1] [N-1] is the destination. Our main task is to reach the destination from the source.
We have considered a rat as a character that can move either forward or downwards. In the maze matrix, a few dead blocks will be denoted by 0
and active blocks will be denoted by 1. A rat can move only in the active blocks.
 */

//https://www.youtube.com/watch?v=PAgvK1Oku6U&t=1357s

public class GridWays_Rat_in_deadMaze {

    // Rat can move only in (Right, Down) directions
    private static void pathsIn_2dir(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if (sr > er || sc > ec) return;
        if (maze[sr][sc] == 0) return; // if cell contains "0" then return
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        // go right
        pathsIn_2dir(sr, sc + 1, er, ec, s + "R", maze);
        // go down
        pathsIn_2dir(sr + 1, sc, er, ec, s + "D", maze);
    }

    // Rat can move in all 4 directions
    public static void pathsIn_4dir(int sr, int sc, int er, int ec, String path, int[][] maze, boolean[][] isVisited){
        // base case
        if (sr > er || sc > ec || sr < 0 || sc < 0) {  // condition for boundary-cross
            return;
        }
        if(maze[sr][sc] == 0) return;  // if cell contains "0" then return
        if (sr == er && sc == ec) {   // condition for last cell
            System.out.println(path);
            return;
        }
        if (isVisited[sr][sc] == true) return;     // if the cell is already visited then return

        isVisited[sr][sc] = true;  // update isVisited
        // go down
        pathsIn_4dir(sr + 1, sc, er, ec, path + "D", maze, isVisited);
        // go Right
        pathsIn_4dir(sr, sc + 1, er, ec, path + "R", maze, isVisited);
        // go Left
        pathsIn_4dir(sr, sc - 1, er, ec, path + "L", maze, isVisited);
        // go Up
        pathsIn_4dir(sr - 1, sc, er, ec, path + "U", maze, isVisited);

        isVisited[sr][sc] = false;    // backtracking

    }

    // optimised version of Rat moving in all 4 directions
    public static void pathsIn_4dir_optimised(int sr, int sc, int er, int ec, String path, int[][] maze){
        // base case
        if (sr > er || sc > ec || sr < 0 || sc < 0) {  // condition for boundary-cross
            return;
        }
        if(maze[sr][sc] == 0) return;  // if cell contains "0" then return
        if (sr == er && sc == ec) {   // condition for last cell
            System.out.println(path);
            return;
        }
        if (maze[sr][sc] == -1) return;     // if the cell is already visited then return

        maze[sr][sc] = -1;  // update isVisited
        // go down
        pathsIn_4dir_optimised(sr + 1, sc, er, ec, path + "D", maze);
        // go Right
        pathsIn_4dir_optimised(sr, sc + 1, er, ec, path + "R", maze);
        // go Left
        pathsIn_4dir_optimised(sr, sc - 1, er, ec, path + "L", maze);
        // go Up
        pathsIn_4dir_optimised(sr - 1, sc, er, ec, path + "U", maze);

        maze[sr][sc] = 1;    // backtracking

    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;
        int[][] maze = {
                {1, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 1},
                {0, 1, 1, 1, 1, 1},
                {0, 0, 1, 0, 1, 1}
        };

        // Rat can move only in (Right, Down) directions
        pathsIn_2dir(0, 0, rows - 1, cols - 1, "", maze);
        System.out.println("---------------------");

        // Rat can move in all 4 directions
        boolean[][] isVisited = new boolean[rows][cols];
        pathsIn_4dir(0, 0, rows - 1, cols - 1, "", maze, isVisited);
        System.out.println("---------------------");

        // optimised version of Rat moving in all 4 directions
        pathsIn_4dir_optimised(0, 0, rows - 1, cols - 1, "", maze);
    }

}