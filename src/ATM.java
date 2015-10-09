/**
 * Created by DrScott on 10/8/15.
 */
import java.util.Scanner;

public class ATM {

    public static void run() throws Exception {
        int balance = 100;
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals("")) {
            throw new Exception("Invalid entry");
        }

        System.out.println("Welcome, " + name + ". What would you like to do?");
        System.out.println("[1] Check balance");
        System.out.println("[2] Withdraw from account");
        System.out.println("[3] Exit");

        String option = scanner.nextLine();  //stores input as a string
        int optionNum = Integer.valueOf(option); //converts string into an int
        if (optionNum == 1) {
            System.out.println("Your balance is $" + balance);
        } else if (optionNum == 2) {

            System.out.println("How much would you like to withdraw?");

            String withdraw = scanner.nextLine();

            int withdrawNum = Integer.valueOf(withdraw);

            if (withdrawNum <= 100) {
                balance -= withdrawNum;
                System.out.println("You've withdrawn $" + withdrawNum);
                System.out.println("Your new balance is $" + balance);
            } else if (withdrawNum > 100 || withdrawNum < 0) {
                throw new Exception("You don't have that much money");
            }
        } else if (optionNum == 3) {
            System.out.println("Thanks for stopping by, have a nice day");
        } else {
            throw new Exception("Invalid selection!");
        }
    }
}




