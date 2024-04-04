package L85_Multithreadingg;

public class MyThread extends Thread{

    @Override
    public void run()
    {
        for (int i = 10; i > 0; i--)
        {
            System.out.println("Thread #1 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // System.out.println(1/0); ---> thread 2 still continues
        }

        System.out.println("== Thread #1 is finished! ");
    }
}
