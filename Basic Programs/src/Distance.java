
// 18. Calculate Distance Between Two Points.

import java.lang.Math;
import java.util.Scanner;

public class Distance {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the coordinate of first point(x1, y1): ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.print("enter the coordinate of first point(x2, y2): ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        System.out.println(distance(x1, y1, x2, y2));
    }
}


