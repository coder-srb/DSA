// 61. write the string by removing duplicates from it (String contains only small characters.)

public class RemoveDuplicates {

    static void noDuplicates(String str, int index, StringBuilder newStr, boolean[] map) {
        // base condition
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);

        if (map[currChar - 'a']) {  // map[currChar - 'a'] == true
            noDuplicates(str, index + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            noDuplicates(str, index + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnacollege";
        noDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
