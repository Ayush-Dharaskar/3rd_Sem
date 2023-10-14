package Lab10;

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

public class Q4User {
    public static void main(String[] args) {
        try {
            throw new MyException("My Error message");
        }

        catch (MyException e) {
            System.out.println("Catch block");
            System.out.println(e.getMessage());
        }
    }
}
