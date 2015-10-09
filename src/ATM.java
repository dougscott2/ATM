/**
 * Created by DrScott on 10/8/15.
 */
import java.util.Scanner;

public class ATM {
    static Account account;

    public static void run() throws Exception {


        while (true) {
            account.login();
            account.mainMenu();
            String option = ATM.nextLine();  //stores input as a string
            int optionNum = Integer.valueOf(option); //converts string into an int
            if (optionNum == 1) {
                account.checkBalance();
            } else if (optionNum == 2) {
                account.withdraw();
            } else if (optionNum == 3) {
                account.exit();
            } else {
                throw new Exception("Invalid selection!");
            }


        }
    }


    static String nextLine() {  //static method to get next line input so i don't have to create it a bunch of times
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return nextLine();
    }
}








