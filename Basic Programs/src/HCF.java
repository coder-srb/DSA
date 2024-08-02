// 23. HCF/GCD Of Two Numbers Program

import java.util.Scanner;

public class HCF {

//    int gcd(int x, int y) {
//        while (x != y) {
//            if (x > y) {
//                x = x - y;
//            } else if (x < y) {
//                y = y - x;
//            }
//        }
//        return x;
//    }

    int gcd(int num1, int num2) {
        int hcf = 0;

        for (int i = 1; i <= num1 || i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        HCF h = new HCF();
        System.out.println(h.gcd(num1, num2));
    }
}
