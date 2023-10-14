package Lab10;

import java.util.*;

class NegativeNumber extends Exception {

    NegativeNumber(String s) {
        super(s);
    }
}

public class Q6Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        try {
            int n = sc.nextInt();
            if (n < 0) {
                throw new NegativeNumber("Negative number");
            }

            double root = Math.sqrt(n);
            System.out.println("Root:" + root);
        } catch (NegativeNumber e) {
            System.out.println("Negative number entered, unable to find square root.");
        }
    }
}
