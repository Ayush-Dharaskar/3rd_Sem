package Lab3;

import java.util.*;

public class NumCombination {
    public static void main(String args[]) {

        int num[] = new int[4];
        int n = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Repetition allowed\n2.Repetition not allowed");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        for (int k = 1; k <= n; k++) {
                            for (int l = 1; l <= n; l++) {
                                System.out.println(i + "" + j + "" + k + "" + l);

                            }
                        }
                    }
                }
                break;

            case 2:
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        for (int k = 1; k <= n; k++) {
                            for (int l = 1; l <= n; l++) {

                                if (i != j & i != k & i != l & j != k & j != l & k != l)
                                    System.out.println(i + "" + j + "" + k + "" + l);

                            }
                        }
                    }
                }

        }

    }

}
