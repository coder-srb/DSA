// Find and print all permutations of a string...
//  Mathematical formula => if size is "n" then, permutations = n!

public class Permutations {

    static void findPermutations(String str, String ans) {
        // base condition
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // creating a new string by removing the current character...
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans + currentChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
