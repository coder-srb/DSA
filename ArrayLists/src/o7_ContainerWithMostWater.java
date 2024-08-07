// Container with most water
// For given n lines on x-axis, use 2 lines to form a container such that it holds maximum water

import java.util.ArrayList;

public class o7_ContainerWithMostWater {

    public static int bruteForce(ArrayList<Integer> height) {
        int maxWaterTrapped = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));  // we have to pick the smaller height to calculate area of the container
                int width = j - i;
                int trappedWater = ht * width;   // area of the current container
                maxWaterTrapped = Math.max(maxWaterTrapped, trappedWater);   // selecting the larger area
            }
        }
        return maxWaterTrapped;
    }

    public static int optimised_2pointers(ArrayList<Integer> height) {
        int leftPointer = 0;
        int rightPointer = height.size() - 1;

        int maxWaterTrapped = 0;
        while (leftPointer < rightPointer) {
            int ht = Math.min(height.get(leftPointer), height.get(rightPointer));  // we have to pick the smaller height to calculate area of the container
            int width = rightPointer - leftPointer;
            int trappedWater = ht * width;    // area of the current container
            maxWaterTrapped = Math.max(maxWaterTrapped, trappedWater);   // selecting the larger area

            // pointer with smaller height will be shifted from its place. and the other one will remain still.
            if (height.get(leftPointer) < height.get(rightPointer)) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxWaterTrapped;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(bruteForce(height));
        System.out.println(optimised_2pointers(height));
    }
}
