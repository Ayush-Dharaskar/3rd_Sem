package Lab4;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order: ");

        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        int rsum = 0;
        int csum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            rsum = 0;
            for (int j = 0; j < n; j++) {
                rsum = rsum + arr[i][j];
            }
            if (rsum != sum) {
                System.out.print("Not magic square" + "sum:" + sum + " rsum:" + rsum);
                return;
            }
        }
        for (int i = 0; i < n; i++) {
            csum = 0;
            for (int j = 0; j < n; j++) {
                csum = csum + arr[j][i];
            }
            if (csum != sum) {
                System.out.print("Not magic square" + "sum:" + sum + " rsum:" + rsum + "csum:" + csum);
                return;
            }

        }

        System.out.println("Magic square");
    }

}
