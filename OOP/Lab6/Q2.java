package Lab6;

import java.util.Scanner;

class Student {
    int regNo;
    String name;
    int age;

    Student() {
    };

    Student(String name, int regNo, int age) {
        this.regNo = regNo;
        this.age = age;
        this.name = name;
    }
}

class UG extends Student {
    int sem;
    double fees;

    UG() {

    }

    UG(String name, int reg, int age, int sem, double fees) {
        super(name, reg, age);
        this.sem = sem;
        this.fees = fees;

    }

    void display() {
        System.out.println("RegNo.:" + regNo);
        System.out.println("Name:" + name);
        System.out.println("Age" + age);
        System.out.println("Sem:" + sem);
        System.out.println("Fees" + fees);
    }
}

class PG extends Student {
    int sem;
    double fees;

    PG(String name, int reg, int age, int sem, double fees) {
        super(name, reg, age);
        this.sem = sem;
        this.fees = fees;

    }

    void display() {
        System.out.println("RegNo.:" + regNo);
        System.out.println("Name:" + name);
        System.out.println("Age" + age);
        System.out.println("Sem:" + sem);
        System.out.println("Fees" + fees);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UG[] ug = new UG[10];
        PG[] pg = new PG[10];

        while (true) {

            System.out.println("1.UG\n2.PG\n3.Exit");
            int opt = sc.nextInt();
            int i = 0, j = 0;
            switch (opt) {
                case 1:
                    System.out.println("Enter Regno., name, age, sem, fees");
                    pg[i] = new PG(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
                    i++;
                    break;
                case 2:
                    System.out.println("Enter Regno., name, age, sem, fees");
                    ug[j] = new UG(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
                    j++;
                    break;
                case 3:
                    return;
            }
        }

    }

}
