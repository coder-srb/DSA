// 8. To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class PallindromeString {
    public static boolean isPalindrome(String str) {

//        int i = 0, j = str.length() - 1;
//
//        while (i < j) {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;

        // another method
        String rev = "";
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print("write something: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}

