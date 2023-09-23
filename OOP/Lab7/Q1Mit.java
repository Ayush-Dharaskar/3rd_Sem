package Lab7;

import java.util.*;

class StudentDetail {
    String name;
    int id;
    String college;

    StudentDetail() {
    };

    StudentDetail(String name, String college, int id) {
        this.name = name;
        this.college = college;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name:" + name);
        System.out.println("ID:" + id);
        System.out.println("College:" + college);
    }

}

public class Q1Mit {
    public static void main(String[] args) {
        System.out.println("Enter name, college, id:");
        Scanner sc = new Scanner(System.in);

        StudentDetail s1 = new StudentDetail(sc.nextLine(), sc.nextLine(), sc.nextInt());

        s1.displayDetails();

    }

}
