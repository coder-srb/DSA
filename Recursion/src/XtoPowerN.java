// 59. calculate x to power n.

public class XtoPowerN {

    static int power(int x, int n) {
        //base condition
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }

    static int optimisedPower(int x, int n) {
        //base condition
        if (n == 0) {
            return 1;
        }
//        int halfPowSquare = optimisedPower(x, n / 2) * optimisedPower(x, n / 2);  //or
        int halfPower = optimisedPower(x, n / 2);
        int halfPowSquare = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowSquare = x * halfPowSquare;
        }
        return halfPowSquare;
    }

    public static void main(String[] args) {
        System.out.println(power(5, 3));
        System.out.println(optimisedPower(5, 3));
    }
}
