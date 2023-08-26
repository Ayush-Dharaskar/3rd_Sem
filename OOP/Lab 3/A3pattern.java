package Lab3;

public class pattern {
    public static void main(String args[]) {

        int num = 1;
        int n = 4;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print(num + " ");
                num++;
            }
            System.out.println("");

        }
    }

}
