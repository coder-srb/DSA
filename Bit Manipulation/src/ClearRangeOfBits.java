// 44. clear the bits within a range

public class ClearRangeOfBits {

    static int clear(int num, int i, int j) {
        int a = ~0 << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return num & bitMask;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(clear(num, 2, 4));
    }
}
