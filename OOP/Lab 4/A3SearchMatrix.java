package Lab4;

import java.util.Scanner;

public class SearchMatrix {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter order:");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Element to search:");
        int ele = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == ele) {
                    System.out.println("Found at:" + "(" + i + "," + j + ")");
                    cnt++;
                }
            }
        }
        System.out.println("Occurances:" + cnt);
    }

}
