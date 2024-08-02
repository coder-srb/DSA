// 21. Reverse A String In Java

import java.util.Scanner;

public class ReverseString {
    static String reverse(String str) {
//        String s = "";
//        for (int i = str.length()-1; i >=0; i--) {
//            s += str.charAt(i);
//        }
//        return s;

        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string");
        String str = in.nextLine();
        System.out.println(reverse(str));
    }
}
