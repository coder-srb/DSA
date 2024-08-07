// Find if any pair in a sorted & rotated arraylist has a target sum

import java.util.ArrayList;

public class o9_PairSum_inSortedRotatedArrayList {

    public static boolean pairSum_bruteForce(ArrayList<Integer> list, int target) {  // O(n^2)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // using 2pointer approach
    public static boolean pairSum_2pointer(ArrayList<Integer> list, int target) {   // O(n^2)
        int breakPoint = -1;
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {  // fiding breaking point
                breakPoint = i;
                break;
            }
        }

        int lp = breakPoint + 1;
        int rp = breakPoint;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(pairSum_bruteForce(list, target));
        System.out.println(pairSum_2pointer(list, target));
    }
}
