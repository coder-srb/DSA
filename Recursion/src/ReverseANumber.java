// 48. Reverse a number.

public class ReverseANumber {

    static int rev1 = 0;
    static int reverse1(int n){
        // base condition
        if(n == 0){
            return rev1;
        }
        rev1 = rev1*10 + (n%10);
        reverse1(n/10);
        return rev1;
    }

    public static void main(String[] args) {
        System.out.println(reverse1(5853));
    }
}
