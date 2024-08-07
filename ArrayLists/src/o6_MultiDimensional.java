// Multidimensional ArrayList creation and printing

import java.util.ArrayList;

public class o6_MultiDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(213);
        list1.add(345);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(5);
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list3.add(i * 1);
            list4.add(i * 3);
            list5.add(i * i);
        }

        mainList.add(list3);
        mainList.add(list4);
        mainList.add(list5);

        list3.remove(4);
        list5.remove(2);

        System.out.println(mainList);
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currentList = mainList.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
