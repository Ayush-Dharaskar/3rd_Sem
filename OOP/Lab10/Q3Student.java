package Lab10;

import java.util.*;

public class Q3Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[3];
        try {
            System.out.print("Enter name:");
            String name = sc.nextLine();

            System.out.print("Roll:");
            int roll = Integer.parseInt(sc.nextLine());

            System.out.print("Enter marks of 3 subjects:");
            float per = 0;
            for (int i = 0; i < 3; i++) {
                marks[i] = Integer.parseInt(sc.nextLine());
                per += marks[i];
            }
            per /= 3;
            System.out.println("Percentage:" + per);
            System.out.println("Grade:" + per / 10);
        } catch (NumberFormatException e) {
            System.out.println("invalid input");
        }

    }
}
