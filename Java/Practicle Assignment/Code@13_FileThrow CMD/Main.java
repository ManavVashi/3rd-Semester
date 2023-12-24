import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;

class Attendance
{
    File file;
    Attendance(File file)
    {
        this.file=file;
    }
    void display(){
        try{
            FileReader r=new FileReader(file);
            BufferedReader b=new BufferedReader(r);
            String line;
            ArrayList<String> a=new ArrayList<String>();
            while((line=b.readLine())!=null)
            {
                String[] arr=line.split(" ");
                if(arr[1]!="0")
                {
                    a.add(arr[0]);
                }
            }
            Collections.sort(a);
            System.out.println(a);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String fileName=sc.nextLine();
        File file=new File("attendance.txt");
        Attendance at=new Attendance(file);
        at.display();
    }
}