//add(),addAll(),remove(),get(),set()
import java.util.*;
class CheckFunctions
{
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(1);
        l.add("Hello");

        System.out.println(l);

        List l1=new ArrayList();
        l1.add(3);
        l1.add("How are you??");

        System.out.println(l1);

        l.addAll(l1);  //append all elements of list

        System.out.println(l);

        l.add(l1);  //add list as an element

        System.out.println(l);

        l.add(0,"Good");

        System.out.println(l);

        System.out.println(l.remove(0));

        System.out.println(l.get(3));

        l.set(4,"List");// if index exist

        System.out.println(l);
    }
}