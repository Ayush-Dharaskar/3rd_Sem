package Lab5;

import java.util.*;

class Employee {

    String name;
    String city;
    double salary;
    double DA;
    double HRA;
    double total;

    void getdata(String n, String c, double s, double DA, double HRA) {
        name = n;
        city = c;
        salary = s;
        this.DA = DA;
        this.HRA = HRA;
    }

    void calculate() {
        total = salary + salary * DA / 100 + salary * HRA / 100;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("City:" + city);
        System.out.println("Total:" + total);
    }
}

public class Employeeee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        System.out.println("Enter name, city, basic salary,dearness allowance (DA%) and house rent (HRA%):");
        e1.getdata(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        e1.calculate();
        e1.display();
    }

}
