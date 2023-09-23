package Lab8;

import java.util.Scanner;

interface Area {
    abstract double area();

    abstract void display();
}

class Rectangle implements Area {
    double l, b;

    Rectangle() {
    };

    Rectangle(double len, double br) {
        l = len;
        b = br;
    }

    public double area() {
        return (l * b);
    }

    public void display() {
        System.out.println("Area of rectangle:" + area());
    }

}

class Circle implements Area {
    double r;

    Circle() {
    };

    Circle(double rad) {
        r = rad;
    }

    public double area() {
        return (Math.PI * r * r);
    }

    public void display() {
        System.out.println("Area of circle:" + area());
    }

}

public class Q3Areai {
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
