/**
 * Created by DrScott on 10/8/15.
 */
import java.util.Scanner;

public class ATM {
    static Account account;


    public static void run() throws Exception {
        account = new Account();

        account.login();

        while (true) {

            account.mainMenu();

        }
    }


    static String nextLine() {  //static method to get next line input so i don't have to create it a bunch of times
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
}








