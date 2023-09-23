package Lab8;

import java.util.Scanner;

interface Sports {
    void dispTeam();

    int getNumOfGoals();
}

class Hockey {
    String name;
    int goal;

    Hockey() {
    };

    Hockey(String n, int goal) {
        name = n;
        this.goal = goal;
    }

    public int getNumOfGoals() {
        return goal;
    }

    void dispTeam(Hockey t2) {
        if (this.goal > t2.goal) {
            System.out.println("Hockey Team " + this.name + " Won!");
        } else if (this.goal == t2.goal)
            System.out.println("Hockey Team Tied!");
        else
            System.out.println("Hockey Team " + t2.name + " Won!");
    }

}

class Football {
    String name;
    int goal;

    Football() {
    };

    Football(String n, int goal) {
        name = n;
        this.goal = goal;
    }

    public int getNumOfGoals() {
        return goal;
    }

    void dispTeam(Football t2) {
        if (this.goal > t2.goal) {
            System.out.println("Football Team " + this.name + " Won!");
        } else if (this.goal == t2.goal)
            System.out.println("Football Team Tied!");
        else
            System.out.println("Football Team " + t2.name + " Won!");
    }

}

public class A3Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hockey team name,goals scored:");
        Hockey h1 = new Hockey(sc.next(), sc.nextInt());
        // sc.nextInt();
        System.out.println("Enter Hockey team name,goals scored:");
        Hockey h2 = new Hockey(sc.next(), sc.nextInt());

        System.out.println("Enter Football team name,goals scored:");
        Football f1 = new Football(sc.next(), sc.nextInt());
        // sc.nextInt();
        System.out.println("Enter Football team name,goals scored:");
        Football f2 = new Football(sc.next(), sc.nextInt());

        h1.dispTeam(h2);
        f1.dispTeam(f2);
    }
}
