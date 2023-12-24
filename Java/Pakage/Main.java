import add.Add;
import sub.Sub;
import multi.Multi;
import div.Div;

public class Main {
    public static void main(String[] args) {
    Add a=new Add();
    Sub s=new Sub();
    Multi m=new Multi();
    Div d=new Div();

    int a1=4;
    int b=2;

    System.out.println(a.addition(a1,b));
    System.out.println(s.substraction(a1,b));
    System.out.println(m.multiplication(a1,b));
    System.out.println(d.division(a1,b));
    }
    
}
