package Lab4;

import java.io.ObjectOutputStream;
import java.util.Scanner;

public class prime1 {
    static boolean Isprime(int n) {
        for (int j = 2; j < n; j++) {

            if (n % j == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Elements:");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            if (Isprime(arr[i])) {
                System.out.print(arr[i] + " ");
            }

        }
    }

}
