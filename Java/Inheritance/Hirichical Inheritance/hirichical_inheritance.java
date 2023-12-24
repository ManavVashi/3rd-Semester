class A
{
    int a;
    A(int tempa)
    {
        a=tempa;
    }
}
class B extends A
{
    int b;
    B(int tempa,int tempb)
    {
        super(tempa);
        b=tempb;
    }
     void printB()
    {
        System.out.println("calling from C with B "+(a+b));
    }
}
class C extends A
{
    int c;
    C(int tempc,int tempa)
    {
        super(tempa);
        c=tempc;
    }
    void printC()
    {
        System.out.println("calling from C with A "+(a+c));
    }
}
class Hirichical
{
    public static void main(String[] args) {
        B callb=new B(1,2);
        C callc=new C(3,4);   
        callb.printB();
        callc.printC(); 
    }
}