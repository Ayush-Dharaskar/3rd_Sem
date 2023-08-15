package Lab4;

import java.util.Scanner;

public class Symmetric {
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
                if (arr[i][j] != arr[j][i]) {
                    System.out.println("Not symmetric");
                    return;
                }
            }
        }
        System.out.println("Symmetric");
    }
}
