class Exception_1 extends Exception
{
    public static void main(String[] args) {
        int i;
        for(i=0;i<5;i++)
        {
           // System.out.println("\n"+i);
        }
        try
        {
            System.out.println("\n"+10/0);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("\nMy exception");
        }
        // catch(Exception e1)
        // {
        //     System.out.println("\nPappa");
        // }
        
        finally
        {
            System.out.println("\nRun");
        }
        System.out.println("\nin main");
        }

}