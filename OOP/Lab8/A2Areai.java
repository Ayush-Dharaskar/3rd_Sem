package Lab8;

import java.util.Scanner;

interface Area {
    abstract double area();

    abstract void display();
}

class Square implements Area {
    double l;

    Square() {
    };

    Square(double len) {
        l = len;

    }

    public double area() {
        return (l * l);
    }

    public void display() {
        System.out.println("Area of Square:" + area());
    }

}

class Triangle implements Area {
    double b, h;

    Triangle() {
    };

    Triangle(double br, double he) {
        b = br;
        h = he;
    }

    public double area() {
        return (0.5 * b * h);
    }

    public void display() {
        System.out.println("Area of circle:" + area());
    }

}

public class A2Areai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter l of Square:");
        Square sq = new Square(sc.nextDouble());

        System.out.println("Enter base, height of triangle:");
        Triangle tri = new Triangle(sc.nextDouble(), sc.nextDouble());

        sq.display();
        tri.display();
    }

}
