package Lab6;

class Bank {
    String accNo;
    double balance;

    Bank() {
    };

    Bank(double balance) {
        this.balance = balance;
    }

    void getInterest() {
        double rate = 10;
        double interest = balance * rate / 100;
        System.out.println("interest:" + interest);
    }
}

class SBI extends Bank {
    SBI() {
    };

    SBI(double balance) {
        super(balance);
    }

    void getInterest() {
        double rate = 8;
        double interest = balance * rate / 100;
        System.out.println("interest:" + interest);
    }

}

class ICICI extends Bank {
    ICICI() {
    };

    ICICI(double balance) {
        super(balance);
    }

    void getInterest() {
        double rate = 7;
        double interest = balance * rate / 100;
        System.out.println("interest:" + interest);
    }

}

class AXIS extends Bank {
    AXIS() {
    };

    AXIS(double balance) {
        super(balance);
    }

    void getInterest() {
        double rate = 9;
        double interest = balance * rate / 100;
        System.out.println("interest:" + interest);
    }

}

public class Q3 {
    public static void main(String[] args) {
        SBI sbi = new SBI(1000);
        ICICI icici = new ICICI(1000);
        AXIS axis = new AXIS(1000);

        sbi.getInterest();
        icici.getInterest();
        axis.getInterest();

    }

}
