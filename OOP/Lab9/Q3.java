package Lab9;

import java.util.*;

public class Q3 {
    static boolean palindrome(char[] str) {
        for (int i = 0; i < str.length / 2; i++) {
            if (str[i] != str[str.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    static char[] reverse(char[] str) {
        for (int i = 0; i < str.length / 2; i++) {
            char temp = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length - i - 1] = temp;
        }
        return str;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        char[] ch;
        int opt;
        while (true) {
            System.out.println(
                    "1. palindrome or not\n2.Alphabetical order\n3. Reverse the string\n4. Concatenate the original string and the reversed string\n5.Exit");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter String:");
                    str = sc.next();
                    ch = str.toCharArray();
                    System.out.println(palindrome(ch));
                    break;
                case 2:
                    System.out.println("Enter String:");
                    str = sc.next();
                    ch = str.toCharArray();
                    Arrays.sort(ch);

                    System.out.println("Sorted:" + new String(ch));
                    break;
                case 3:
                    System.out.println("Enter String:");
                    str = sc.next();
                    ch = str.toCharArray();
                    char[] rev = reverse(ch);
                    System.out.println("Reversed:" + new String(rev));
                    break;
                case 4:
                    System.out.println("Enter String:");
                    str = sc.next();
                    ch = str.toCharArray();
                    char[] r = reverse(ch);
                    System.out.println("Concatenated:" + new String((str.concat(new String(r)))));
                    break;
                case 5:
                    return;
            }
        }
    }
}
