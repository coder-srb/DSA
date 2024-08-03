// 33. Find Pairs in Array.

public class Pairs {
    static void printPairs(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + ", ");
                tp++;
            }
            System.out.println(" ");
        }
        System.out.println("Total Pairs: " + tp);
    }

    public static void main(String args[]) {
        int arr[] = {0, 1, 2, 3, 4};
        printPairs(arr);
    }
}
