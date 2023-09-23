package Lab8;

import java.util.Scanner;

abstract class Area {
    abstract double area();

    abstract void display();
}

class Square extends Area {
    double l;

    Square() {
    };

    Square(double len) {
        l = len;

    }

    double area() {
        return (l * l);
    }

    void display() {
        System.out.println("Area of Square:" + area());
    }

}

class Triangle extends Area {
    double b, h;

    Triangle() {
    };

    Triangle(double br, double he) {
        b = br;
        h = he;
    }

    double area() {
        return (0.5 * b * h);
    }

    void display() {
        System.out.println("Area of circle:" + area());
    }

}

public class A1Area {
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
