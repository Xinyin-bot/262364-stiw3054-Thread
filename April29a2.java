package Quiz;

public class April29a2 implements Runnable{

    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
        April29a2 myRunnable = new April29a2();

        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);

        t1.start();
        t2.start();
        t3.start();
    }
}