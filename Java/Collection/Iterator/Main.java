//if we user iterator one time then we cannot use it second time
//if anywhera we use next function then if jump to the next elemet and ew cannot go backward

import java.util.ArrayList;
import java.util.Iterator;
class Main
{
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>(11);
        for(int i=0;i<11;i++)
        {
            a.add(i);
        }

        System.out.println(a);

        Iterator<Integer> itr=a.iterator();

        while(itr.hasNext())
        {
            int temp;
            temp=itr.next();
            System.out.print(temp+" ");
            if(temp%2==0)
            {
                itr.remove();
            }
        }
        System.out.println();
        System.out.println(a);

        Iterator<Integer> itr2=a.iterator();

        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
    }
}