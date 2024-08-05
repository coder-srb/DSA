// 60. how many ways tiles can be arranged in a (2 x n) floor or (4 x n) etc.

public class TilingProblem {

    static int tiling(int n) {  // 2 x n (floor size) it also works for 4 x n and others also.
        // base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical choices
        int fnm1 = tiling(n - 1);

        // horizontal choices
        int fnm2 = tiling(n - 2);

        return fnm1 + fnm2;
    }

    public static void main(String args[]) {
        System.out.println(tiling(1));
    }
}
