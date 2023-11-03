class MyClass {
    int ctr;

    public synchronized void synchronizedMethod() {
        for (int i = 0; i < 5; i++) {
            ctr++;
            System.out.println(Thread.currentThread().getName() + " increased to " + ctr);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void synchronizedStatement() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                ctr--;
                System.out.println(Thread.currentThread().getName() + " decreased to " + ctr);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Q5 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Thread t1 = new Thread(() -> obj.synchronizedMethod());
        Thread t2 = new Thread(() -> obj.synchronizedMethod());
        Thread t3 = new Thread(() -> obj.synchronizedStatement());
        Thread t4 = new Thread(() -> obj.synchronizedStatement());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}