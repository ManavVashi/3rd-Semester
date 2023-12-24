class A implements Runnable
{
    String s;
    A(String s)
    {
        this.s=s;
    }
    public void run()
    {
        synchronized (this){
        for(int i=1;i<6;i++)
        {
            System.out.println(s);
        }}
    }
}

class ObjectSyncronised
{
    public static void main(String[] args) {
        A a1=new A("Ganeshay namah");
        A a2=new A("Jai Hanumanji");
        A a3=new A("Ohm Sai-Ram");
        Thread t1=new Thread(a1);
        Thread t2=new Thread(a2);
        Thread t3=new Thread(a3);

        t1.start();
        t2.start();
        t3.start();
    }
}