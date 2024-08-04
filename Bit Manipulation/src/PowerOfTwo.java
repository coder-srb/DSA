// 45. check a number is power of two or not!

public class PowerOfTwo {
    static boolean powerOf2(int num){
        return (num & (num-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(powerOf2(16));
    }
}
