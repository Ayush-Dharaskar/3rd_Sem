package Lab4;

import java.util.Scanner;

public class Diagonal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter order:");
        int n = sc.nextInt();
        int sum = 0;

        int arr[][] = new int[n][n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }

            }
        }
        System.out.println();

        System.out.println("Sum:" + sum);

    }

}
