// 51. Convert uppercase characters to lowercase using bits

public class UpperToLowerCase {
    static String upper(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (arr[i] & ~32);
        }
        return new String(arr);
    }

    static String lower(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] |= 32;
        }
        return new String(arr);
    }

    static String convert(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] ^= 32;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "srbIOJSB";
        System.out.println(upper(str.toCharArray()));
        System.out.println(lower(str.toCharArray()));
        System.out.println(convert(str.toCharArray()));
    }
}
