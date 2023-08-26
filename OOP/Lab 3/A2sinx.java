package Lab3;

import java.util.*;
import java.lang.Math;

public class sinx {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = 200;
        System.out.println("Enter x (deg):");
        double x = sc.nextDouble();
        x = x * Math.PI / 180;
        int sign = -1;

        double term = 0;
        for (int i = 1; i <= 2 * n; i += 2) {
            double fact = 1;
            sign = sign * -1;
            for (int j = i; j > 1; j--) {
                fact = fact * j;
            }

            double expo = 1;

            for (int j = i; j > 0; j--) {
                expo = expo * x;
            }

            term = term + (sign * expo) / fact;

        }
        System.out.println(term);

    }

}
