package Lab7;

class Demo {
    static int ctr;

    {
        ctr++;
    }

    Demo() {
    };
}

public class Q2Counter {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        System.out.println("Count:" + d1.ctr);

    }

}
