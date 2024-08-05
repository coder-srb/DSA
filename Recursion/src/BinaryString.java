// 63. print all binary string of size n without consecutive 1's.

public class BinaryString {

    static void printBinaryStrings(int n, int lastPlace, String str) {

        // base condition
        if (n == 0) {
            System.out.println(str);
            return;
        }

//        if(lastPlace == 0){
//            printBinaryStrings(n-1, 0, str + "0");
//            printBinaryStrings(n-1, 1, str + "1");
//        }else{
//            printBinaryStrings(n-1, 0, str + "0");
//        }

        printBinaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }
}
