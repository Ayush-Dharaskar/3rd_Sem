public class Q4 implements Runnable {
    public void run() {
        try{

        
        System.out.println("Thread priority: " + Thread.currentThread().getPriority());
        }

        catch(Exception e)
        {
            System.out.println("thread interrupted");
        }


    }

    public static void main(String[] args) {
        Q4 prio = new Q4();

        Thread t1 = new Thread(prio);
        Thread t2 = new Thread(prio);
        Thread t3 = new Thread(prio);

        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);

        t1.start();
        t2.start();
        
        t3.start();
    }
}