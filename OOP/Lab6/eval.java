package Lab6;

import java.util.*;

class NumArray {
    int arr[] = new int[10];

    NumArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void isodd() {
        int ctr = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println("true");
                ctr++;
            } else {
                System.out.println("false");
            }
            System.out.println(ctr);
        }
    }

    void isPrime() {
        int ctr = 0;
        outer: for (int i = 0; i < 10; i++) {
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    System.out.println("false");
                    continue outer;
                }

            }
            System.out.println("true");
            ctr++;

        }
        System.out.println(ctr);
    }

    void isPalindrome() {
        int ctr = 0;
        for (int i = 0; i < 10; i++) {
            int rev = 0;
            int n = arr[i];
            while (n > 0) {
                int dig = n % 10;
                rev = dig + rev * 10;
                n = n / 10;
            }
            if (rev == arr[i]) {
                System.out.println("Palindrome");
                ctr++;
            } else {
                System.out.println("Not a Palindrome");
            }

        }
        System.out.println(ctr);
    }
}

public class eval {
    public static void main(String[] args) {
        NumArray na = new NumArray();
        System.out.println("isODD FN:");
        na.isodd();
        System.out.println("isEVEN FN:");
        na.isPrime();
        System.out.println("isPALINEDROME FN:");
        na.isPalindrome();

    }

}
