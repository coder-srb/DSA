// 65. Find the product of digits

public class ProductOfDigits {

    static int digitProduct(int n) {
        // base condition
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * digitProduct(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(digitProduct(1320));
    }
}
