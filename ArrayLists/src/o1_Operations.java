// some basic operations performed on ArrayList
// add, get, remove, set, contains

import java.util.ArrayList;

public class o1_Operations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);  // empty arraylist

        // add operation  ; time complexity = O(1)
        list.add(1);  //O(1)
        list.add(4);  //O(1)
        list.add(0);  //O(1)
        // add operation with given index   ; time complexity = O(n)
        list.add(1, 32);  // it doesn't set the value to the given index
        list.add(2, 62);  // it simply make room at the given index for the new item and shift the previous element to the right.
        System.out.println(list);

        // get operation   ; time complexity = O(1)
        int element = list.get(1);    //O(1)
        System.out.println(element);  //O(1)

        // remove/delete operation   ; time complexity = O(1)
        list.remove(2);
        System.out.println(list);

        // set a new element at a particular index   ; time complexity = O(1)
        list.set(1, 15);  // (index, value)
        System.out.println(list);

        // check an element is present or not
        System.out.println(list.contains(15));
        System.out.println(list.contains(0));

        // Size method
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}