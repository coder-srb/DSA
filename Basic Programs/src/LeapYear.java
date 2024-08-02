// 27. Check Leap Year Or Not

import java.util.Scanner;

public class LeapYear {
    static boolean checkForLeapYr(int yr) {
        if (yr % 4 == 0) {
            if (yr % 100 == 0) {
                if (yr % 400 == 0) {
                    return true;
                } else return false;
            } else return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a year: ");
        int yr = in.nextInt();

        if (checkForLeapYr(yr)) System.out.println(yr + " is a leap year");
        else System.out.println(yr + " is not a leap year");
    }
}
