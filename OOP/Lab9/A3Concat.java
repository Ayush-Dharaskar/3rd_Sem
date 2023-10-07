package Lab9;

import java.util.*;

public class A3Concat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ans = "";

        for (int i = 0; i < 5; i++) {

            ans = ans.concat(sc.nextLine());
        }
        System.out.println("String:" + ans);

    }
}
