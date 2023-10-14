package Lab10;

import java.util.*;

public class Q2ArrayOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter elements:");
        try {
            for (int i = 0; i < 100; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array overflow ");
        }
    }
}
