import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class ListPractice
{
    public static void main(String[] args) {
        List<Integer>al =new ArrayList<Integer>();
        List <Integer>bl=new ArrayList<Integer>();
        List <Integer>cl=new ArrayList<Integer>();

        //add
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        bl.add(6);
        bl.add(7);
        bl.add(8);
        bl.add(9);
        bl.add(10);
        System.out.println(al);
        System.out.println(bl);

        //addAll
        cl.addAll(al);
        cl.addAll(bl);
        System.out.println(cl);

        //get
        System.out.println(cl.get(0));

        //set
        cl.set(0,0);
        System.out.println(cl);

        //remove
        System.out.println(cl.remove(0));
        System.out.println(cl);

        //indexOf
        al.add(5,1);
        System.out.println(al.indexOf(1));

        //lastIndexOf
        System.out.println(al.lastIndexOf(1));

        //subList
        System.out.println(al.subList(3,6));

        //contains
        System.out.println(cl.contains(2));
        System.out.println(cl.containsAll(bl));

        //size
        System.out.println(cl.size());
        
        //isEmpty
        System.out.println(cl.isEmpty());

        //removeAll
        System.out.println(cl.removeAll(al));

        //clear
        cl.clear();
        System.out.println("check: "+cl.size());

        //Iterator
        //hashNext
        //next
        //remove
        ListIterator<Integer> itr=bl.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        itr=bl.listIterator();
        while(itr.hasNext())
        {
            if(itr.next()==6)
            {
                itr.remove();
            }
        }

        itr=bl.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}