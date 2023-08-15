package Lab4;

import java.util.Scanner;

public class MatricMulti {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of a: ");

        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter order of b: ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (n != x) {
            System.out.println("Invalid ");
            return;
        }

        int a[][] = new int[m][n];
        int b[][] = new int[x][y];
        int c[][] = new int[m][y];

        System.out.println("Enter Elements a:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Elements b:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < y; j++) {
                c[i][j] = 0;

                for (int k = 0; k < n; k++) {
                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }

        System.out.println("Result:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }

}
