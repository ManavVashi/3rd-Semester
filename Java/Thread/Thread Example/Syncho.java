class SynchroTest extends Thread
{
    void display()
    {
        for(int i=1;i<20;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
    public void run()
    {
        display();
    }
}
class SynchroTest_2 extends Thread
{
    SynchroTest t;
    int a;
    SynchroTest_2(SynchroTest t,int a)
    {
        this.t=t;
        this.a=a;

    }
    public void run()
    {
        try{
            t.display();
        }
        catch(InterruptedException e){
            throw new InterruptedException(e);
        }
        
    }
}
class Syncho
{
    public static void main(String[] args) {
        SynchroTest a=new SynchroTest();
        SynchroTest_2 b=new SynchroTest_2();
        a.start();
        b.start();
    }
   
}