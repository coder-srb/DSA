// Find & print all subsets of a given string.
// Mathematical formula => if size is "n" then, no. of subsets is 2^n.

public class Subsets {

    static void subsets(String str, String ans, int i) {
        // base condition
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else System.out.println(ans);
            return;
        }
        //choice => "yes"
        subsets(str, ans + str.charAt(i), i + 1);
        //choice => "No"
        subsets(str, ans, i + 1);  // backtracking
    }

    public static void main(String[] args) {
        String str = "abc";
        subsets(str, "", 0);
    }

}
