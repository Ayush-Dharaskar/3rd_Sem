package Lab9;

import java.util.*;

public class Q1Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        int len = ch.length;

        int words = (str.split(" ")).length;
        System.out.println(words);

        int lines = (str.split("\\.")).length;
        System.out.println(lines);

        int vowels = 0;
        for (int i = 0; i < len; i++) {
            if (ch[i] == 'a' | ch[i] == 'e' | ch[i] == 'i' | ch[i] == 'o' | ch[i] == 'u') {
                vowels++;
            }
        }
        System.out.println("Characters:" + len);
        System.out.println("Words:" + words);
        System.out.println("Lines:" + lines);
        System.out.println("Vowels:" + vowels);

    }
}
