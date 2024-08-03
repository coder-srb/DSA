// 38. Calculate diagonal Sum of a 2D matrix (https://leetcode.com/problems/matrix-diagonal-sum/description/)

public class DiagonalSum {

    static int calDigonalSum_BruteForce(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // primary digonal
                if (i == j) {
                    sum += matrix[i][j];
                }
                // Secondary diagonal
                else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    static int calDigonalSum_Optimal(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // primary digonal
            sum += matrix[i][i];
            // Secondary diagonal
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
//        System.out.println(calDigonalSum_BruteForce(matrix));
        System.out.println(calDigonalSum_Optimal(matrix));
    }
}
