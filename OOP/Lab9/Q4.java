package Lab9;

import java.util.*;

public class Q4 {
    static char[] caseConvert(char[] str) {
        int n = str.length;
        for (int i = 0; i < n; i++) {
            if (str[i] >= 'a' && str[i] <= 'z') {

                str[i] = (char) (str[i] - 32);
            }

            else if (str[i] >= 'A' && str[i] <= 'Z') {
                str[i] = (char) (str[i] + 32);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, str2;
        char[] ch;
        int opt;
        while (true) {
            System.out.println(
                    "1. To compare two strings\n2. To convert the uppercase character to lower and vice-versa\n3. To display whether an entered string is a substring of the other or not\n4. If the entered string is a substring of the other, replace it with Hello\n5.Exit");

            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter String 1:");
                    str = sc.next();
                    System.out.println("Enter String 2:");
                    str2 = sc.next();
                    ch = str.toCharArray();
                    if (str.compareTo(str2) > 0) {
                        System.out.println("String 1 is greater");
                    } else if (str.compareTo(str2) < 0) {
                        System.out.println("String 2 is greater");
                    } else {
                        System.out.println("Both are equal");
                    }
                    break;
                case 2:
                    System.out.println("Enter String:");
                    str = sc.next();
                    ch = str.toCharArray();
                    System.out.println(new String(caseConvert(ch)));
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter String 1:");
                    str = sc.nextLine();
                    System.out.println("Enter Substring :");
                    str2 = sc.nextLine();

                    if (str.indexOf(str2) == -1) {
                        System.out.println("Substring not found");
                    } else {
                        System.out.println("Found at index :" + str.indexOf(str2));
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Enter String 1:");
                    str = sc.nextLine();
                    System.out.println("Enter Substring :");
                    str2 = sc.nextLine();
                    int index = str.indexOf(str2);

                    if (index == -1) {
                        System.out.println("Substring not found");
                    } else {
                        System.out.println(index);
                        str = str.replaceAll(str2, "Hello");
                    }
                    System.out.println(str);
                    break;
                case 5:
                    return;

            }

        }
    }
}
