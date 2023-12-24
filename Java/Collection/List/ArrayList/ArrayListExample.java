import java.util.ArrayList;
class Student
{
    int roll_no;
    String name;
    Student(int roll_no,String name)
    {
        this.roll_no=roll_no;
        this.name=name;
    }

    public void display()
    {
        System.out.println("Roll no "+roll_no+" name is "+name);
    }
}
class ArrayListExample
{
    private static final Student Student = null;

    public static void main(String[] args) {
        Student s1=new Student(1,"abc");
        Student s2=new Student(2,"def");
        Student s3=new Student(3,"ght");
        Student s4=new Student(4,"hij");
        Student s5=new Student(5,"klm");

        ArrayList<Student> a=new ArrayList<>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        a.add(s5);
        a.remove(a.get(2));
        a.get(1).name="java";
        for(Student x:a)
        {
            x.display();
        }


    }
}