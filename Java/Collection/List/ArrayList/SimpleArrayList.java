import java.util.ArrayList;
public class SimpleArrayList {
    public static void main(String[] args){
        ArrayList a1=new ArrayList();
        a1.add("Hello");
        a1.add(1);
        a1.add("How are you");
        a1.add(true);

        for(Object x:a1)
        {
            System.out.println(x);
        }
    }
}
