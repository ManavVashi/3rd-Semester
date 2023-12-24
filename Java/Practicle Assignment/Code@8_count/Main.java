import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        int lineCount=0;
        int wordCount=0;
        int characterCount=0;

        try{
            FileReader r=new FileReader("para.txt");
            BufferedReader b=new BufferedReader(r);
            String line;
            while((line=b.readLine())!=null)
            {
                lineCount=lineCount+1;
                characterCount=characterCount+line.length();
                String noWords[]=line.split(" ");
                wordCount=wordCount+noWords.length;
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        System.out.println(lineCount);
        System.out.println(wordCount);
        System.out.println(characterCount);
    }
}
