package Lab5;

import java.util.*;

class Box {

    double l, w, h;

    Box(double l, double w, double h) {

        this.l = l;
        this.w = w;
        this.h = h;
    }

    double vol() {

        return (l * w * h);
    }
}

class Volume {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        Box box1 = new Box(l, w, h);

        System.out.println("Volume:" + box1.vol());

    }
}
