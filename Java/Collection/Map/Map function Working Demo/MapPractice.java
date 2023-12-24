import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Collections;

public class MapPractice {
    public static void main(String[] args) {
        Map<String,Integer> m1=new HashMap<>();
        Map<String,Integer> m2=new HashMap<>();
        Map<String,Integer> m3=new HashMap<>();


        //put
        m1.put("a",1);
        m1.put("b",2);
        m1.put("c",3);
        m1.put("d",4);
        m1.put("e",5);

        m2.put("f",6);
        m2.put("g",7);
        m2.put("h",8);
        m2.put("i",9);
        m2.put("j",10);
        System.out.println(m1);
        System.out.println(m2);

        //putAll
        m3.putAll(m1);
        m3.putAll(m2);
        System.out.println(m3);

        //get
        System.out.println(m1.get("a"));

        //remove
        m2.remove("f");
        System.out.println(m2);

        //containsKey
        System.out.println(m1.containsKey("a"));

        //containsValue
        System.out.println(m1.containsValue(1));

        //equals
        System.out.println(m1.equals(m2));

        //isEmpty
        System.out.println(m3.isEmpty());

        //size
        System.out.println(m2.size());

        //clear
        m3.clear();
        System.out.println(m3.size());

        //keySet
        System.out.println(m1.keySet());

        //values
        System.out.println(m1.values());

        //IMPORTANT
        //entrySet
        //convert map into set
        System.out.println(m2.entrySet());

        //IMPORTANT
        //iteratin over a map
        //1st way using keySet
        for(String s:m1.keySet())
        {
            System.out.println(s+" -> "+m1.get(s));
        }

        //2nd using Iterator
        Set<String> s1=new HashSet<>();
        s1.addAll(m2.keySet());

        Iterator<String> itr=s1.iterator();

        while(itr.hasNext())
        {
            String temp=itr.next();
            System.out.println(temp+" , "+m2.get(temp));
        }
        
        System.out.println("...SortedMap and TreeMap...");

        SortedMap<Integer,String>sm=new TreeMap<>();

        sm.put(5,"Five");
        sm.put(2,"Two");
        sm.put(11,"OneOne");
        System.out.println(sm);

    }
}
