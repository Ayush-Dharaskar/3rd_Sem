package Lab5;

class Number {

    private double num;

    Number(int n) {
        num = n;
    }

    boolean isZero() {
        if (num == 0) {
            return true;
        }
        return false;

    }

    boolean isPositive() {
        if (num > 0)
            return true;
        return false;
    }

    boolean isNegative() {
        if (num < 0)
            return true;
        return false;
    }

    boolean isEven() {
        if (num % 2 == 0)
            return true;
        return false;
    }

    boolean isOdd() {
        if (num % 2 == 1)
            return true;
        return false;
    }

    boolean isPrime() {
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Q5Num {
    public static void main(String[] args) {

        Number n = new Number(7);
        System.out.println(n.isZero());
        System.out.println(n.isEven());
        System.out.println(n.isOdd());
        System.out.println(n.isPositive());
        System.out.println(n.isNegative());
        System.out.println(n.isPrime());

    }

}
