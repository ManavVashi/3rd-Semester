class Bank 
{
    double interest_rate;
    Bank(double d)
    {
        interest_rate=d;
    }
}
class Branch extends Bank
{
    int elapsed_time;
    int n;
    Branch(int b,int c,double d)
    {
        super(d);
        elapsed_time=b;
        n=c;
    }
}
class Client extends Branch
{
    int initial_amount;
    double a;
    Client(int e,int b,int c,double d)
    {
        super(b,c,d);
        initial_amount=e;
    }
    void final_amount()
    {
        a=initial_amount*Math.pow(1+(interest_rate/n),n*elapsed_time);
        System.out.println("value of final amount: "+a);
    }
}
class Multilevel_Inheritance
{
    public static void main(String[] args)
    {
        Client c=new Client(10000,6,5,0.05);
        c.final_amount();

    }
}