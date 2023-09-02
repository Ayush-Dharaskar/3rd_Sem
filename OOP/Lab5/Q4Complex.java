package Lab5;

class Complex {

    int re;
    int im;

    Complex() {
        this.re = 0;
        this.im = 0;
    }

    Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    void add(int a, Complex z) {
        Complex temp = new Complex();
        temp.re = a + z.re;
        temp.im = z.im;
        System.out.println(temp.re + "+" + temp.im + "i");
    }

    void add(Complex z1, Complex z2) {
        Complex temp = new Complex();
        temp.re = z1.re + z2.re;
        temp.im = z1.im + z2.im;
        System.out.println(temp.re + "+" + temp.im + "i");
    }
}

public class Q4Complex {
    public static void main(String[] args) {

        Complex z1 = new Complex(4, 5);
        Complex z2 = new Complex(4, 5);
        // z1.add(3, z1);
        z2.add(z1, z2);

    }
}
