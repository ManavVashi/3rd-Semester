import java.util.*;
import java.io.FileWriter;

public class Account {
    static String name, dateOfBirth, account;
    static double amount;
    static int count = 0;
    static ArrayList<String> al = new ArrayList<String>();

    public static void deposite() {
        Scanner sc1 = new Scanner(System.in);
        double ketla;
        System.out.print("Enter amount: ");
        ketla = sc1.nextDouble();
        amount = amount + ketla;
    }

    public static void widthdraw() {
        Scanner sc2 = new Scanner(System.in);
        double cash;
        System.out.print("Enter amount: ");
        cash = sc2.nextDouble();
        if (cash > amount) {
            throw new ArithmeticException("Insufficient amount in your account.");
        } else {
            String print;
            amount = amount - cash;
            print = name + " : " + cash + " : " + amount;
            al.add(print);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create account: fill the information given below-");
        System.out.print("Your name: ");
        name = sc.nextLine();
        System.out.println();
        System.out.print("Your date of Birth: ");
        dateOfBirth = sc.nextLine();
        System.out.println();
        System.out.print("account type: ");
        account = sc.nextLine();
        amount = 0;
        int choice = -1;
        boolean flag = true;
        while (flag) {
            System.out.println("press 1: for Widthdraw.");
            System.out.println("press 2: for Deposite");
            System.out.println("press 0: for exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    widthdraw();
                    break;
                case 2:
                    deposite();
                    break;
                case 0:
                    try {
                        FileWriter fw = new FileWriter("report.txt");
                        if (al.size() <= 5) {
                            for (String str : al) {
                                System.out.println(str);
                                fw.append(str);
                                fw.append("\n");
                            }
                        } else {
                            for (int i = al.size() - 6; i < al.size(); i++) {
                                System.out.println(al.get(i));
                                fw.append(al.get(i));
                                fw.append("\n");
                            }
                        }
                        fw.close();
                        flag = false;
                        break;

                    } catch (Exception e) {
                        System.out.println(e);
                    }

            }
        }
    }
}