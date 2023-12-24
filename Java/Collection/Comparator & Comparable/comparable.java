import java.util.*;
class Student implements Comparable<Student>
{
    int roll_no;
    String name;

    Student(int roll_no,String name)
    {
        this.roll_no=roll_no;
        this.name=name;
    }

    public String toString()
    {
        return (this.roll_no+" "+this.name);
    }

    public int compareTo(Student that)
    {
        if(this.roll_no>that.roll_no)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
class comparable
{
    public static void main(String[] args) {
        Student s1=new Student(1,"Nilay");
        Student s2=new Student(0,"Milay");
        Student s3=new Student(25,"Chilay");
        Student s4=new Student(10,"Khilay");
        Student s5=new Student(11,"Tilay");

        List<Student> l=new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        l.add(s5);

        Collections.sort(l);

        for(Student s:l)
        {
            System.out.println(s.toString());
        }
    }
}