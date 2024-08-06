// https://youtu.be/OBSqZ2L0G10?si=gM4VZxkUwfStEmUa

// https://leetcode.com/problems/check-knight-tour-configuration/description/
// check knight tour configuration

public class KnightTour_Configuration {

    public static boolean helper(int[][] grid, int row, int col, int val) {
        int n = grid.length;

        // base case
        if (grid[row][col] == n * n - 1) return true;

        int i, j;
        // up-left (2up-1left)
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == val + 1) return helper(grid, i, j, val + 1);

        // up-right (2up-1right)
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == val + 1) return helper(grid, i, j, val + 1);

        // down-left (2down-1left)
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == val + 1) return helper(grid, i, j, val + 1);

        // down-right (2down-1right)
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && grid[i][j] == val + 1) return helper(grid, i, j, val + 1);

        // left-up (2left-1up)
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == val + 1) return helper(grid, i, j, val + 1);

        // left-down (2left-1down)
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == val + 1) return helper(grid, i, j, val + 1);

        // right-up (2right-1up)
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == val + 1) return helper(grid, i, j, val + 1);

        // right-down (2right-1down)
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == val + 1) return helper(grid, i, j, val + 1);

        return false;
    }

    public static boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) return false;
        return helper(grid, 0, 0, 0);
    }

    public static void main(String[] args) {
        int grid[][] = {
                {0, 11, 16, 5, 20},
                {17, 4, 19, 10, 15},
                {12, 1, 8, 21, 6},
                {3, 18, 23, 14, 9},
                {24, 13, 2, 7, 22}
        };
        System.out.println(checkValidGrid(grid));
    }
}
