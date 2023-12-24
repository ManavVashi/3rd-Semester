import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
class Main
{
    public static void main(String[] args) {
        HashMap<String,Integer>m=new HashMap<String,Integer>();
        
        //put(val_key,val_val)
        m.put("Ramu", 100);
        m.put("Shyamu",100);
        
        System.out.println(m);

        //m.containsKey(val_key)
        if(m.containsKey("Ramu"))
        {
            //m.get(val_key)
            System.out.println("marks of ramu is: "+m.get("Ramu"));
        }

        if(m.containsValue(100))
        {
            System.out.println("100 marks containing students are exixt");
        }

        //iteration in map

        for(HashMap.Entry<String,Integer> e : m.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

        Set s=m.entrySet();
        Iterator itr=s.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}