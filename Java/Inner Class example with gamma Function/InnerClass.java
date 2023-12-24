interface Inner
{
    void show();
}
class InnerClass
{
    public static void main(String[] args){
        Inner i=()->
            {
                System.out.println("modefied");
            };
        i.show();
    }
}
