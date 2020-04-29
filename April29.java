package Quiz;

import java.sql.SQLOutput;

public class April29 extends Thread{

    @Override
    public void run()
    {
        System.out.println("Hello First Quiz "+Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        April29 t1 =new April29();
        April29 t2 =new April29();

        t1.start();
        t2.start();
    }
}


