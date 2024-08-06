// Keypad Combinations https://youtu.be/4yMtvToiJE0?si=rywenGjT3sxJpekm
// print all possible letter combinations that the number could represent.

import java.util.Scanner;

public class KeyPadCombinations {
    static String[] codes = {"",".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void print_kpc(String digits, String ans) {
        //base case
        if (digits.length() == 0) {
            System.out.print(ans+" ");
            return;
        }
        char currDigit = digits.charAt(0);
        String restDigits = digits.substring(1);

//        String codesForCurrentDigit = codes[currDigit];   // incorrect, bcz we are passing the index as a character instead of an integer
        String codesForCurrentDigit = codes[currDigit - '0'];  // to get the integer value of a character(number), subtract '0' from the character value.
        for (int i = 0; i < codesForCurrentDigit.length(); i++) {
            char currChoice = codesForCurrentDigit.charAt(i);
            print_kpc(restDigits, ans + currChoice);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the digits: ");
        String str = in.nextLine();

        print_kpc(str, "");
    }
}
