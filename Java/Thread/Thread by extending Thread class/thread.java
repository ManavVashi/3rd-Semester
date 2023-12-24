import java.util.Scanner;
class Thread_Demo extends Thread
{
    int num;
    Thread_Demo(int num)
    {
        this.num=num;
    }
    public void run()
    {
        if(num%2!=0)
        {
            System.out.println("cube:"+num*num*num);
        }
        else{
            System.out.println("Square: "+num*num);
        }
    }
}
class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        Thread_Demo d=new Thread_Demo(num);
        d.start();
    }
}