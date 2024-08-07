// Find th pairs in a sorted arraylist has a target sum

import java.util.ArrayList;

public class o8_PairSum_inSortedArrayList {

    // brute-force method works for all type of array (sorted, sorted rotated, unsorted...)
    public static void pairSum_bruteForce(ArrayList<Integer> list, int target) {  // O(n^2)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.print(list.get(i) + " " + list.get(j));
                    System.out.println();
                }
            }
        }
    }

    public static void pairSum_2pointer(ArrayList<Integer> list, int target) {   // O(n)
        int lp = 0;  // left pointer
        int rp = list.size() - 1;  // right pointer

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {  // case 1
                System.out.print(list.get(lp) + " " + list.get(rp));
                System.out.println();
            }

            if (list.get(lp) + list.get(rp) < target) {  // case 2
                lp++;
            } else {  //case 3
                rp--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        pairSum_bruteForce(list, target);
        pairSum_2pointer(list, target);
    }
}
