import java.util.Scanner;
interface Recyclable
{
    default void message()
    {
        System.out.println("Give proper input");
    }
    public String toString();
}
class Paper implements Recyclable
{
    public String toString()
    {
        return "Paper";
    }
}
class Bottle implements Recyclable
{
    public String toString()
    {
        return "Bottle";
    }
}
class Fabric implements Recyclable
{
    public String toString()
    {
        return "Fabric";
    }
}
class Main
{
    public static void main(String[] args) {
        System.out.println("1 - Clothes\n" +
                "2 - Bottles\n" +
                "3 - Newspapers\n" +
                "4 - Exit");
        Scanner sc=new Scanner(System.in);
        Paper p=new Paper();
        Fabric f=new Fabric();
        Bottle b=new Bottle();
        int choice=0;
        while(choice!=4){
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println(f.toString());
            break;
            case 2:
            System.out.println(b.toString());
            break;
            case 3:
            System.out.println(p.toString());
            break;
            case 4:
            System.out.println("ThankYou for comming...");
            break;
            default:
            f.message();
            break;
        }
    }
    }
}