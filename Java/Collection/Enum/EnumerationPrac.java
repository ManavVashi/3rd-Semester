import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

class EnumerationPrac
{
    public static void main(String[] args) {
        Vector <Integer>l=new Vector<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        Enumeration<Integer> e=l.elements();

        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}