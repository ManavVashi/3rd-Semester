import java.util.Scanner;
class UserDefinedException extends Exception
{
      UserDefinedException(String s){
            super (s); 
        }
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in); 
        age=sc.nextInt();
        if(age<18)
        {
            try{
                throw new UserDefinedException("You are under age");
            }
            catch (UserDefinedException e) {
                System.out.println(e);
            }
        }
    }
}