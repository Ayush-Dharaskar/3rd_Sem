package Lab5;

class Time {

    int h;
    int m;
    int s;

    Time() {
        h = 0;
        m = 0;
        s = 0;
    }

    Time(int hr, int min, int sec) {
        h = hr;
        m = min;
        s = sec;
    }

    void display() {
        System.out.println("Time: " + h + ":" + m + ":" + s);
    }

    Time add(Time t1) {

        Time temp = new Time();
        int carry = 0;
        if (this.s + t1.s > 60) {
            carry = 1;
            temp.s = (this.s + t1.s) % 60;
        } else {
            temp.s = (this.s + t1.s) % 60;
        }

        if (this.m + t1.m + carry > 60) {
            carry = 1;
            temp.m = (this.m + t1.m + carry) % 60;
        } else {
            temp.m = (this.m + t1.m + carry) % 60;
        }

        temp.h = (this.h + t1.h + carry);
        return temp;

    }
}

public class TickTock {
    public static void main(String[] args) {

        Time t1 = new Time(8, 30, 20);
        Time t2 = new Time(1, 45, 50);
        Time tot = new Time();

        tot = t1.add(t2);
        tot.display();

    }

}
