class Programming
{
    String name;
    Programming (String name)
    {
        this.name=name;
    }
    public synchronized void display()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(name);
        }
        
    }
}
class MyThread extends Thread
{
    Programming p;
    MyThread(Programming p)
    {
        this.p=p;
    }
    public void run()
    {
        p.display();
    }
}
class MethodSyncronised
{
    public static void main(String[] args) {
        Programming p1=new Programming("Ohm Ganeshay namah");
        Programming p2=new Programming("Jai Hanuman ji");
        Programming p3=new Programming("Ohm Sai-Ram");
        MyThread th1=new MyThread(p1);
        MyThread th2=new MyThread(p2);
        MyThread th3=new MyThread(p3);
        th1.start();
        th2.start();
        th3.start();
    }
}