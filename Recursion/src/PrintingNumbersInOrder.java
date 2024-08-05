// 52. print numbers in decreasing order and increasing order using recursion.

public class PrintingNumbersInOrder {

    static void print(int n) {
        // base condition
        if (n == 0) {
            System.out.println(0);
            return;
        }
        // decreasing order
        System.out.println(n);
        print(n - 1);
        // increasing order
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(10);
    }
}
