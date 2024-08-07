// Sorting an ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class o4_Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(4);
        list.add(342);
        list.add(0);
        list.add(2);
        System.out.println(list);

        Collections.sort(list);   //  sorting in Ascrnding order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());   // sorting in descending order
        // here reverseOrder() is a comparator function - inside which the logic is written for descending order
        System.out.println(list);
    }
}
