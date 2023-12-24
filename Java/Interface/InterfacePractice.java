interface Inter
{
    abstract void display();
    default void show()
    {
        System.out.println("In Inter");
    }
}

class Practice implements Inter
{
    public void display()
    {
        System.out.println("In Practice");
    }
    public void show()
    {
        System.out.println("In practice");
    }
}

class InterfacePractice
{
    public static void main(String[] args) {
        Practice p=new Practice();
        p.display();
        p.show();
        Inter i=new Practice();
        i.show();
    }
}