class MyThread implements Runnable
{
    public void run()
    {
        System.out.println("\nMy thread is called.");
    }
}
public class ThreadImpliments {
    public static void main(String[] args) {
        MyThread m=new MyThread();
        Thread t=new Thread(m);
        t.start();
        //m.start();
}
}
    
