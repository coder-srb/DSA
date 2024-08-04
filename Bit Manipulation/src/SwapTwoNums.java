// 49. Swap two numbers without using any third variable.

public class SwapTwoNums {

    static void swap(int num1, int num2) {
        System.out.println("Before swapping num1 = " + num1 + ", num2 = " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After swapping num1 = " + num1 + ", num2 = " + num2);
    }

    public static void main(String[] args) {
        swap(23, 6);
    }
}
