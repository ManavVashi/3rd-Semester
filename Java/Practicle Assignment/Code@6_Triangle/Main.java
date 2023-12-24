import java.util.Scanner;
import java.lang.Math;
class Triangle
{
    private double side1,side2,side3;
    Triangle()
    {
        side1=side2=side3=1.0;
    }
    Triangle(double a,double b,double c)
    {
        side1=a;
        side2=b;
        side3=c;
    }
    double acc_side1()
    {
        return side1;
    }
    double acc_side2()
    {
        return side2;
    }
    double acc_side3()
    {
        return side3;
    }
    double getPerimeter()
    {
        return (side1+side2+side3);
    }
    double getArea()
    {
        double s=(side1+side2+side3)/2;
        double a=s-side1;
        double b=s-side2;
        double c=s-side3;
        return (Math.sqrt(s*a*b*c));
    }
    public String toString()
    {
        return("Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
    }
}
class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Triangle t=new Triangle();

        System.out.println("Enter the length of 3 sides of the triangle");
        System.out.print("Side-1: ");
        double side1=sc.nextDouble();
        System.out.print("Side-2");
        double side2=sc.nextDouble();
        System.out.print("Side-3");
        double side3=sc.nextDouble();
        Triangle t1=new Triangle(side1, side2, side3);

        System.out.println("perameters you given:-");
        System.out.println(t1.toString());
        System.out.println("Perimeter of the triangle is: "+t1.getPerimeter());
        System.out.println("Area of the triangle is: "+t1.getArea());
    }
}