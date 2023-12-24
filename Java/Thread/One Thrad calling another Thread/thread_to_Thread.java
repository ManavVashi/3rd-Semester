import java.util.Random;
class MyThread extends Thread
{
    int a;
    MyThread(int num)
    {
        a=num;
    }
    EvenThread e=new EvenThread();
    OddThread o=new OddThread();
    public void run()
    {
        if(a%2==0)
        {
            e.start();
        }
        else
        {
            o.start();
        }
    }
}
class EvenThread extends Thread
{
    public void run()
    {
        System.out.println("\nEvenThread is called.");
    }
}
class OddThread extends Thread{
    public void run()
    {
        System.out.println("\nOddThread is called.");
    }
}
class thread_to_Thread {
    public static void main(String [] args)
    {
        int num;
        Random r=new Random();
        num=r.nextInt(11);
        MyThread m=new MyThread(num);
        m.start(); 
    }
}
