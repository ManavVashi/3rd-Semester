import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

public class SetPractice implements Comparable{
    public static void main(String[] args) {
        Set <Integer>as=new HashSet<Integer>();
        Set <Integer>bs=new HashSet<Integer>();
        Set <Integer>cs=new HashSet<Integer>();
        List <Integer>l=new ArrayList<Integer>();

        //add
        as.add(1);
        as.add(2);
        as.add(3);
        as.add(4);
        as.add(5);

        bs.add(6);
        bs.add(7);
        bs.add(8);
        bs.add(9);
        bs.add(10);
        System.out.println(as);
        System.out.println(bs);

        //addALL
        cs.addAll(as);
        cs.addAll(bs);
        System.out.println(cs);

        //remove
        System.out.println(as.remove(0));
        System.out.println(as);

        //removeAll
        System.out.println(cs.removeAll(as));
        System.out.println(as);
        System.out.println(cs);

        //contains
        System.out.println(cs.contains(5));

        //containsAll
        System.out.println(cs.containsAll(bs));

        //size
        System.out.println(bs.size());

        //isEmpty
        System.out.println(cs.isEmpty());

        //clear
        bs.clear();
        System.out.println(bs.size());

        //IMPORTANT
        //retainAll
        //perform and operation
        System.out.println(cs.retainAll(bs));

        //toArray()
        //array has to be object type
        Object[] arr=cs.toArray();

        
        
    }
}
