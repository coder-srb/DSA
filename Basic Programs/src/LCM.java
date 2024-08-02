// 24. LCM Of Two Numbers

import java.util.Scanner;

public class LCM {

    int lcm(int num1, int num2) {
        int lcm = 0;
        int i = num1 > num1 ? num1 : num2;
        while (true) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
            i++;
        }
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        LCM h = new LCM();
        System.out.println(h.lcm(num1, num2));
    }
}
