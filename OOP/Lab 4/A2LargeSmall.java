package Lab4;

import java.util.*;

public class LargeSmall {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Elements:");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {

            if (arr[i] < min) {
                min = arr[i];

            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }

        System.out.println("max:" + max + "\nmin:" + min);
    }

}
