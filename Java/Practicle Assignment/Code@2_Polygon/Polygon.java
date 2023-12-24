import java.util.Scanner;
import java.lang.Math;

class RegularPolygon
{
    private int n;
    private double side,x,y;
    RegularPolygon()
    {
        n=3;
        side=1;
        x=0;
        y=0;
    }
    RegularPolygon(int n,double side,double x,double y)
    {
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    int acc_NoOfSides()
    {
        return n;
    }
    double acc_LengthOfSides()
    {
        return side;
    }
    double acc_Xaxis()
    {
        return x;
    }
    double acc_Yaxis()
    {
        return y;
    }
    double getPerimeter()
    {
        return (n*side);
    }
    double getArea()
    {
        double temp1=(n*Math.pow(side,2))/4;
        double tan=Math.tan(Math.PI/n);
        return temp1/tan;
    }
}
class Polygon
{
    static int no=3;
    static double side=1;
    public static void main(String[] args) {
        RegularPolygon p=new RegularPolygon();
        Scanner sc=new Scanner(System.in);

        do{
        System.out.print("Enter no sides of polygon= ");
        no=sc.nextInt();
        if(no<3)
        {
            System.out.println("Invalid input");
        }
        }while(no<3);

        do{
        System.out.print("Enter the length of the side= ");
        side=sc.nextDouble();
        if(side<1)
        {
            System.out.println("Invalid input");
        }
        }while(side<1);

        System.out.print("Enter the distance of polygon from x axis= ");
        double x=sc.nextDouble();

        System.out.print("Enter the distance of polygon from y axis= ");
        double y=sc.nextDouble();

        RegularPolygon p1=new RegularPolygon(no, side, x, y);
        System.out.println();
        System.out.println("Here are the details you provide:-");
        System.out.println("no of side of the polygon= "+p1.acc_NoOfSides());
        System.out.println("length of the each side of polygon= "+p1.acc_LengthOfSides());
        System.out.println("location of polygon (x,y)= "+"("+p1.acc_Xaxis()+","+p1.acc_Yaxis()+")");
        System.out.println();
        System.out.println("Parimeter of your polygon is= "+p1.getPerimeter());
        System.out.println("Area of your polygon is= "+p1.getArea());

    }
}

