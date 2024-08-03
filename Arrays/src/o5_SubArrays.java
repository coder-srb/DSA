// 34. Print all the subArrays of an Array.

public class o5_SubArrays {
    static void printSubArrays(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ", ");
                }
                System.out.println("");
                ts++;
            }
            System.out.println("");
        }
        System.out.println("Total SubArrays: " + ts);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        printSubArrays(arr);
    }
}
