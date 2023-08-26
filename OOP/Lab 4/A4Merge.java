package Lab4;

import java.util.Scanner;

public class Merge {
    static void sort(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Size of a:");
        int n = sc.nextInt();
        System.out.println("Size of b:");
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];
        int c[] = new int[m + n];

        System.out.println("Elements of a:");
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
            c[i] = a[i];
        }

        System.out.println("Elements of b:");
        for (int i = 0; i < m; i++) {

            b[i] = sc.nextInt();
            c[n + i] = b[i];
        }

        sort(c, m + n);
        System.out.print("C:");
        for (int i = 0; i < m + n; i++) {

            System.out.print(c[i] + " ");
        }

    }

}
