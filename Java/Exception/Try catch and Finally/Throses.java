class Print{
    void abc(){
        for(int i=0;i<5;i++)
        {
            try{
                Thread.sleep(1500);
            }
            catch(InterruptedException e){}
            System.out.println("\n"+i);

        }
    }
}
public class Throses {
    public static void main(String[] args) {
        Print p=new Print();
            p.abc();
    }
}
