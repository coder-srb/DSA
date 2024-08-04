// 50. Add 1 to an integer using Bit Manipulation.

public class Adding_1 {
    static int add(int num) {
        return -(~num);
    }

    public static void main(String[] args) {
        System.out.println(add(5));
    }
}
