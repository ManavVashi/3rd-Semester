import java.util.*;
public class indexOf_LastIndexOf {
    public static void main(String[] args) {
    List<Integer>l=new ArrayList<Integer>();   
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(2);
    l.add(2);

    System.out.println("First index of 2: "+l.indexOf(2));
    System.out.println("Last Index of 2: "+l.lastIndexOf(2));

    //contains methode

    System.out.println(l.contains(3)); //use to check is element present in the list or not?
                                        //return boolean value
    }
}
