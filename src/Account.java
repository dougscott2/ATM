import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by DrScott on 10/9/15.
 */
public class Account {
    double balance;
    String name;
    HashMap< String, Double> accounts = new HashMap();

    void login() throws Exception {
        System.out.println("Welcome to the bank. Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if( accounts.get(name).equals(false)){
            System.out.println("Account not found! Do you want to make a new account? y/n");
            String s = ATM.nextLine();
            if(s.equals("y")){
                System.out.println("How much are you depositing?");
                 s = ATM.nextLine();
                balance = Double.parseDouble(s);
                accounts.put(name, balance);
            }
        }
        if (name.equals("")) {
            throw new Exception("Invalid entry");
        }
    }
    void mainMenu() throws Exception {
        System.out.println("Welcome, " + name + ". What would you like to do?");
        System.out.println("[1] Check balance");
        System.out.println("[2] Withdraw from account");
        System.out.println("[3] Exit");
        String option = ATM.nextLine();
    }
    void checkBalance() {
        System.out.println("Your balance is $"+ accounts.get(name));
    }
    void withdraw() throws Exception {
        System.out.println("How much would you like to withdraw?");

        String withdraw = ATM.nextLine();

        int withdrawNum = Integer.valueOf(withdraw);

        if (withdrawNum <= 100) {
            balance -= withdrawNum;
            System.out.println("You've withdrawn $" + withdrawNum);
            System.out.println("Your new balance is $" + balance);
        } else if (withdrawNum > 100 || withdrawNum < 0) {
            throw new Exception("You don't have that much money");
        }
    }
    void exit(){
        System.out.println("Thanks for stopping by, have a nice day");
        System.exit(0);
    }

}
