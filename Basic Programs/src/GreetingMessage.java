// 2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class GreetingMessage {
    static void greeting(String name) {
        System.out.println("hlo " + name + " , it's nice to meet you.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your name: ");

        greeting(in.nextLine());
    }
}

