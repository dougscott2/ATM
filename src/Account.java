import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by DrScott on 10/9/15.
 */
public class Account {
    HashMap< String , Double> accounts = new HashMap();
    String name;
    double balance;
    void login() throws Exception {

        System.out.println("Welcome to the bank. Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String accountName = scanner.nextLine();
        name = accountName;

        if (!accounts.containsKey(accountName)) {
            System.out.println("Account not found! Do you want to make a new account? y/n");
            String s = ATM.nextLine();
            if (s.equals("y")) {
                System.out.println("How much are you depositing?");
                s = ATM.nextLine();
                balance = Double.parseDouble(s);
                accounts.put(accountName, balance);
            } else if (s.equals("n")) {
                System.out.println("K, well...bye!");
                System.exit(0);

            } else if (accountName.equals("")) {
                throw new Exception("Invalid entry");
            }
        }
    }

    void mainMenu() throws Exception {
        System.out.println("Welcome, " + accounts.get(name) + ". What would you like to do?");
        System.out.println("[1] Check balance");
        System.out.println("[2] Withdraw from account");
        System.out.println("[3] Exit");
        System.out.println("[4] Delete account");
        String option = ATM.nextLine();  //stores input as a string
        int optionNum = Integer.valueOf(option); //converts string into an int

             if (optionNum == 1) {
            System.out.println("Your balance is $" + accounts.get(name));
             } else if (optionNum == 2) {

                 System.out.println("How much would you like to withdraw?");

                     String withdraw = ATM.nextLine();

                  double withdrawNum = Double.parseDouble(withdraw);

                  if (withdrawNum <= accounts.get(name)) {
                  double balance = accounts.get(name) - withdrawNum;
                  System.out.println("You've withdrawn $" + withdrawNum);
                 System.out.println("Your new balance is $" + balance);
                 accounts.put(name, balance);
            } else if (withdrawNum > accounts.get(name)) {
                throw new Exception("You don't have that much money");
            }
        } else if (optionNum == 3) {

            System.out.println("Thanks for stopping by, have a nice day");
            System.exit(0);
        } else if (optionNum == 4) {
                 System.out.println("Fine, be that way, " + name);
                 accounts.remove(name);
                 System.exit(0);

             }
    }

}
