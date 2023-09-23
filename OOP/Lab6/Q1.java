package Lab6;

import java.util.*;

class Account {
    String name;
    int accNo;
    String type;
    double balance = 2000;

    void deposit(double depo) {
        balance += depo;
    }

    void withdraw(double amt) {
        if (balance < amt) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amt;
    }

    void display() {
        System.out.println(
                "\nName: " + name + "\nacc no: " + accNo + "\nType: " + type + " account\nBalance: " + balance + "\n");
    }
}

class CurrentAcc extends Account {
    int min = 1000;
    int service = 100;

    CurrentAcc(String name, int accNo) {
        this.name = name;
        this.accNo = accNo;
        type = "Cur";
    }

    void withdraw(double amt) {
        if (balance < amt) {
            System.out.println("Insufficient funds in current account");
            return;
        }
        balance -= amt;

        if (balance < min) {
            System.out.println("balance less than mininum balance, service tax will be imposed");
            balance -= 100;
        }
    }

}

class SavingsAcc extends Account {
    SavingsAcc(String name, int accNo) {
        this.name = name;
        this.accNo = accNo;
        type = "savings";
    }

    void computeInterest() {
        double interest = balance * 0.027;
        System.out.println("Interest:" + interest);
        balance += interest;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;

        while (true) {
            System.out.println("Create \n1.Current account\n2.Savings account\n3.Exit");
            opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("Enter name and acc number:");
                    CurrentAcc Curacc = new CurrentAcc(sc.nextLine(), sc.nextInt());

                    outer: while (true) {
                        System.out.println("1.Withdraw\n2.Deposit\n3.Account Info\n4.exit");
                        int opt2 = sc.nextInt();
                        switch (opt2) {
                            case 1:
                                System.out.println("Amount:");
                                Curacc.withdraw(sc.nextDouble());
                                break;

                            case 2:
                                System.out.println("Amount:");
                                Curacc.deposit(sc.nextDouble());
                                break;

                            case 3:
                                Curacc.display();
                                break;

                            case 4:
                                break outer;

                        }

                    }
                    break;
                case 2:
                    System.out.println("Enter name and acc number:");
                    SavingsAcc Savacc = new SavingsAcc(sc.nextLine(), sc.nextInt());
                    outer: while (true) {
                        System.out.println("1.Withdraw\n2.Deposit\n3.Account Info\n4.Compute Interest\n5.exit");
                        int opt2 = sc.nextInt();
                        switch (opt2) {
                            case 1:
                                System.out.println("Amount:");
                                Savacc.withdraw(sc.nextDouble());
                                break;

                            case 2:
                                System.out.println("Amount:");
                                Savacc.deposit(sc.nextDouble());
                                break;

                            case 3:
                                Savacc.display();
                                break;

                            case 4:
                                Savacc.computeInterest();
                                break;
                            case 5:
                                break outer;

                        }

                    }
                    break;
                case 3:
                    return;

            }

        }

    }
}
