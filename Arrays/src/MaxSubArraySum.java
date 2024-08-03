// 35. calculate the maximum Subarray Sum using;
// i. Brute Force method
// ii. Prefix Sum Method.
// iii. Kadane's Algorithm method

public class MaxSubArraySum {

    static void calMaxSubarraySum_BruteForce(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println("Current Sum: " + sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max SubArray Sum: " + maxSum);
    }

    static void calMaxSubarraySum_PrefixSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefixArray[] = new int[arr.length];
        prefixArray[0] = arr[0];
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[i - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("max subArray sum is: " + maxSum);
    }

    // if all the elements of array are negative then kadane's algo wil result zero (Special case)
    static void calMaxSubarraySum_KadaneAlgo(int arr[]) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (sum <= 0 ? 0 : sum) + arr[i];
//            if(maxSum < sum){
//                maxSum = sum;
//            }
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println("max subArray sum is: " + maxSum);
    }

    public static void main(String[] args) {
//        int arr[] = {2,4,6,8,10};
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//        calMaxSubarraySum_BruteForce(arr);
//        calMaxSubarraySum_PrefixSum(arr);
        calMaxSubarraySum_KadaneAlgo(arr);
    }
}
