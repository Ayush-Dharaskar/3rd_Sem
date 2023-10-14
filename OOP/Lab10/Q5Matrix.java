package Lab10;

import java.util.*;

class NotSquare extends Exception {

    NotSquare(String s) {
        super(s);
    }
}

public class Q5Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter order:");
        try {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m != n) {
                throw new NotSquare("Not a square matrix");
            }

            System.out.println("Enter elements:");
            int arr[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("Entered matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        } catch (NotSquare e) {
            System.out.println(e.getMessage());
        }

    }
}
