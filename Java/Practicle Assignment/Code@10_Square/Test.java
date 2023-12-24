class Square{
    double area;
    Square(double area)
    {
        this.area=area;
    }
    double getArea()
    {
        return area;
    }
}
interface Comparable{
    public void compareTo(Square s2);
}

class ComparableSquare extends Square implements Comparable
{
    ComparableSquare(double area)
    {
        super(area);
    }
    public void compareTo(Square s2)
    {
        if(this.getArea()>s2.getArea())
        {
            System.out.println("Square of s1 object is greater");
        }
        else
        {
            System.out.println("Square of s2 object is greater");
        }
    }
}
class Test
{
    public static void main(String[] args) {
        ComparableSquare s1=new ComparableSquare(10);
        ComparableSquare s2=new ComparableSquare(20);
        s1.compareTo(s2);
    }
}