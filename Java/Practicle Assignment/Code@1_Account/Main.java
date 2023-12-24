import java.util.Scanner;
import java.util.Calendar;

class Account {
    private int id, password = 0;
    private double balance=0, annualInterestRate=0.07;

    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    Scanner sc = new Scanner(System.in);

    void mute_id(int id) {
        this.id = id;
    }

    void mute_balance(double balance) {
        this.balance = balance;
    }

    void mute_annualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    int acc_id() {
        return id;
    }

    double acc_balance() {
        return balance;
    }

    double acc_annualInterestRate() {
        return annualInterestRate;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate;
    }

    double getMonthlyInterest() {
        return (balance * annualInterestRate) / 100;
    }

    void mute_password(int password) {
        this.password = password;
    }

    int acc_password() {
        return password;
    }

    void withDraw(double amount) {
        int id_temp, pass_temp;
        if (id == 0) {
            System.out.println("Create id:-");
            System.out.print("Set id: ");
            id = sc.nextInt();
            if (password == 0) {
                System.out.println("Create password:-");
                System.out.print("Set password: ");
                password = sc.nextInt();
            }
        }
        System.out.print("Enter your id: ");
        id_temp = sc.nextInt();
        System.out.print("Ente your password: ");
        pass_temp = sc.nextInt();
        if (id_temp != id) {
            System.out.println("Incorrect id");
        } else if (pass_temp != password) {
            System.out.println("Incorrect password");
        } else {
            if (amount > this.balance) {
                System.out.println("You have not enough balance");
            } else {
                System.out.println(amount + " rupees has been withdrawn");
                balance = balance - amount;
                System.out.println("Your currunt account balance is " + balance);
            }
        }
    }

    void debit(double amount) {
        int id_temp, pass_temp;
        if (id == 0) {
            System.out.println("Create id:-");
            System.out.print("Set id: ");
            id = sc.nextInt();
            if (password == 0) {
                System.out.println("Create password:-");
                System.out.print("Set password: ");
                password = sc.nextInt();
            }
        }
        System.out.print("Enter your id: ");
        id_temp = sc.nextInt();
        System.out.print("Ente your password: ");
        pass_temp = sc.nextInt();
        if (id_temp != id) {
            System.out.println("Incorrect id");
        } else if (pass_temp != password) {
            System.out.println("Incorrect password");
        } else {
            System.out.println(amount + " had been debited");
            balance = balance + amount;
            System.out.println("Your currunt account balance is " + balance);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Account a = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert ATM card:- ");
        boolean responce;
        responce = sc.nextBoolean();
        if (responce == false) {
            System.out.println("ATM is not inserted");
        } else {
            System.out.println("create id:-");
            System.out.print("Set id: ");
            int id_temp = sc.nextInt();
            a.mute_id(id_temp);

            System.out.println("Create password:-");
            System.out.print("Set password: ");
            int pass_temp = sc.nextInt();
            a.mute_password(pass_temp);

            System.out.print("Enter your id: ");
            id_temp = sc.nextInt();
            System.out.println("Enter password: ");
            pass_temp = sc.nextInt();

            if (id_temp != a.acc_id()) {
                System.out.println("Incorrect id");
            } else {
                if (pass_temp != a.acc_password()) {
                    System.out.println("Incorrect password");
                } else {
                    System.out.println("Here are your account details");
                    System.out.println("balamce: " + a.acc_balance());
                    System.out.println("interst rate: " + a.acc_annualInterestRate());
                    System.out.println("monthly interest: " + a.getMonthlyInterest());
                    System.out.println();
                    System.out.println("press 1 to withdraw");
                    System.out.println("press 2 to debit");
                }
            }
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    a.withDraw(amount);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    amount = sc.nextDouble();
                    a.debit(amount);
                    break;
            }

        }

    }
}