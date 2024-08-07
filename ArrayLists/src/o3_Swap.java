// Swap the elements in the given indices of an ArrayList.

import java.util.ArrayList;

public class o3_Swap {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {

//        String temp = list.get(idx1);
//        list.set(idx1, list.get(idx2));
//        list.set(idx2, temp);

        // bit manipulation
        list.set(idx1, (list.get(idx1) ^ list.get(idx2)));
        list.set(idx2, list.get(idx2) ^ list.get(idx1));
        list.set(idx1, list.get(idx1) ^ list.get(idx2));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(4);
        list.add(342);
        list.add(0);
        list.add(2);
        System.out.println(list);

        int index1 = 0, index2 = 3;
        swap(list, index1, index2);
        System.out.println(list);
    }
}
