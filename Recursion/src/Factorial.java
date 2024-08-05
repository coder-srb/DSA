// 53. Calculate factorial of a number using recursion.

public class Factorial {

    static int fact(int n) {
        // base condition
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
