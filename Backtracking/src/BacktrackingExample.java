// backtracking on arrays.

public class BacktrackingExample {

    static void changeArr(int arr[], int idx, int val) {
        //base condition
        if (idx == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[idx] = val;
        changeArr(arr, idx + 1, val + 1);  // function-call step
        arr[idx] = val - 2;  // backtracking step
    }

    static void printArr(int arr[]) {  // printing array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}