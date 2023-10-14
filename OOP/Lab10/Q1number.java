package Lab10;

import java.util.*;

public class Q1number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        String str = sc.nextLine();
        try {
            int n = Integer.parseInt(str);
            System.out.println("Integer:" + n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");

        }
    }
}
