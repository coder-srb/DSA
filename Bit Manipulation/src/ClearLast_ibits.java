// 43. clear last i bits

public class ClearLast_ibits {

    static int clear(int num, int i){
        int bitMask = -1 << i;  // -1 or ~0 (both are same in binary form)
        return num & bitMask;
    }

    public static void main(String[] args) {
        int num = 15;
        int i = 3;
        System.out.println(clear(num, i));
    }
}
