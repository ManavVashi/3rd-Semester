@FunctionalInterface
interface Functional
{
    default void show()
    {
        System.out.println("Hello");
    }
}

class A implements Functional
{
    public void show()
    {
        System.out.println("Hello");
    }
}

class FIP
{
    public static void main(String[] args) {
        A a=new A();
        a.show();
    }
}
