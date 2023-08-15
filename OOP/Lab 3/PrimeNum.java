package Lab3;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        while (n <= m)

        {
            boolean flag = false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (flag == false) {
                System.out.println(n + " ");
            }
            n++;

        }
    }

}
