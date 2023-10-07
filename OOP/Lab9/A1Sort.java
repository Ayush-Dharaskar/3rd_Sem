package Lab9;

import java.util.*;

public class A1Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");

        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }

}
