// 66. Find the sum of digits

public class SumOfDigits {

    static int digitSum(int n) {
        // base condition
        if (n % 10 == n) {  // if one digit is remaining then return that digit.
            return n;
        }
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(1342));
    }
}
