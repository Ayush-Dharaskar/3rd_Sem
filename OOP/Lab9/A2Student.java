package Lab9;

import java.util.*;

class Student {
    int reg;
    String fname;
    String lname;
    String degree;

    Student() {
    }

    Student(String f, String l, String d, int r) {
        reg = r;
        fname = f;
        lname = l;
        degree = d;
    }
}

public class A2Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[4];
        int n = 2;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter firstname, lastname,degree,Reg:");
            students[i] = new Student(sc.next(), sc.next(), sc.next(), sc.nextInt());
        }
        sc.nextLine();
        System.out.println("enter name to search:");
        String key = sc.nextLine();

        for (int i = 0; i < n; i++) {
            if (key.equals(students[i].fname) || key.equals(students[i].lname)) {
                System.out.println("Student found");
                System.out.println("Registration no.:" + students[i].reg);
            }
            if (i == n - 1) {
                System.out.println("Student not found");
            }
        }
    }
}
