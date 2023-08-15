package Lab3;
import java.util.Scanner;

class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int num = n;

        while (n > 0) {

            sum = sum + (n % 10) * (n % 10) * (n % 10);
            n = n / 10;
        }
        if (sum == num) {
            System.out.println("Armstrong number" + sum);
        } else {
            System.out.println("Not a armstrong number" + sum);
        }
    }
}