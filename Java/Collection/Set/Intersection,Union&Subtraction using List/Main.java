//assAll(), retainAll(), removeAll()
//Intersection, subtraction, union @ List 
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
class Main
{
    public static void main(String[] args) {

        HashSet<Integer> a=new HashSet<Integer>();

        a.addAll(Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8,9}));

        System.out.println(a);

        HashSet<Integer> b=new HashSet<Integer>();

        b.addAll(Arrays.asList(new Integer[] {1,3,5,7,9}));

        System.out.println(b);

        //HasSet fuction
        //for unuion we use addAll

        HashSet<Integer> union=new HashSet<Integer>(b);
        union.addAll(a);
        System.out.println("Union: "+union);

        HashSet<Integer> intersection=new HashSet<Integer>(b);
        intersection.retainAll(a);
        System.out.println("Intersection: "+intersection);

        HashSet<Integer> difference=new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Difference: "+difference);

        Iterator itr=a.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}