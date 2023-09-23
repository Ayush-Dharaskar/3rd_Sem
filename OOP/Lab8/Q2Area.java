package Lab8;

import java.util.Scanner;

abstract class Area {
    abstract double area();

    abstract void display();
}

class Rectangle extends Area {
    double l, b;

    Rectangle() {
    };

    Rectangle(double len, double br) {
        l = len;
        b = br;
    }

    double area() {
        return (l * b);
    }

    void display() {
        System.out.println("Area of rectangle:" + area());
    }

}

class Circle extends Area {
    double r;

    Circle() {
    };

    Circle(double rad) {
        r = rad;
    }

    double area() {
        return (Math.PI * r * r);
    }

    void display() {
        System.out.println("Area of circle:" + area());
    }

}

public class Q2Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter l,b of rectangle");
        Rectangle rect = new Rectangle(sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter radius of circle:");
        Circle cir = new Circle(sc.nextDouble());

        rect.display();
        cir.display();
    }

}
