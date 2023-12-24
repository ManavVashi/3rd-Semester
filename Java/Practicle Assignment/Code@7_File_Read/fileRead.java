import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
class Read
{
    int readInfile(String sen,File file)
    {
        try{
            FileReader r=new FileReader(file);
            BufferedReader b=new BufferedReader(r);
            int count=0;
            int no=0;
            String line;
            while((line=b.readLine())!=null)
            {
                count=count+1;
                if(line==sen){
                    no=count;
                }
            }
            if(no==0)
            {
                return -1;
            }
            else{
                return no;
            }

        }
        catch(Exception e)
        {
            return -1;
        }

    }
}

class fileRead
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sen=sc.nextLine();
        File f=new File("C:\\Users\\HP\\Documents\\3rd Sem\\Java\\Assignment\\Code@7_File_Read\\names.txt");
        Read r=new Read();
        int decision=r.readInfile(sen,f);
        if(decision==-1)
        {
            System.out.println("File not exist or line not found");
        }
        else{
            System.out.println("Your desired line is at "+decision+"th line");
        }
    }
}