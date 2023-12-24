class Student
{
    private String rollno,name;
    Student(String roll,String nam)
    {
        rollno=roll;
        name=nam;
    }
    void putdata()
    {            
        System.out.println("The name of the student is: "+name);
        System.out.println("Roll no of the student is: "+rollno);
    }
}
class Exam extends Student
{
    double marks[] = new double[3];
    Exam(double m1,double m2,double m3,String roll,String nam)
    {
        super(roll,nam);
        marks[0]=m1;
        marks[1]=m2;
        marks[2]=m3;
    }
    void putdata1()
    {
        putdata();
        if(marks[0]>=33 && marks[1]>=33 && marks[2]>=33)
        {
            System.out.println("Persentage of the student if total marks of each subject is 100 is : "+((marks[0]+marks[1]+marks[2])*100)/300+"%");
        }
    }
}
public class Single_inheritance {
    public static void main(String []args){
    Exam e=new Exam(34,45,56,"21ug234","Danish");
    e.putdata1();
    }
}
