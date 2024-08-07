// Find the largest element of an ArrayList.

import java.util.ArrayList;

public class o2_MaxElement {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(4);
        list.add(342);
        list.add(0);
        list.add(2);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) > max){
//                max = list.get(i);
//            }
            max = Math.max(list.get(i), max);
        }
        System.out.println(max);
    }
}
