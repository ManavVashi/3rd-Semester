class abc {
    void xyz() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("\n" + i);
            Thread.sleep(1500);
        }
    }
}

public class Thows {
    public static void main(String[] args) {
        abc obj = new abc();
        try {
            obj.xyz();
        } 
        // finally {
        //     System.out.println("Hello");
        // }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

}
