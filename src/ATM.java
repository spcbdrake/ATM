import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by benjamindrake on 10/8/15.
 */
public class ATM {
    public static void run() throws Exception {


        HashMap<String, Double> accounts = new HashMap();
        String name = "";


        Scanner scanner = new Scanner(System.in);
        String option = "";

        while (option.isEmpty() || option != "3") {
            while (name.isEmpty()){
                System.out.println("What is your name?");

                name = scanner.nextLine();
            }

            System.out.println("Hello, " + name);

            if (!accounts.containsKey(name)) {
                System.out.println("Do you want to create an account? [y/n]");
                String choice = scanner.nextLine();
                if (choice.toLowerCase().equals("y")) {
                    accounts.put(name, (double) 100);
                    System.out.println(" Account Created");
                } else {
                    return;
                }
            }

            System.out.println("[1] Check your balance");
            System.out.println("[2] Withdraw cash");
            System.out.println("[3] Cancel");
            option = scanner.nextLine();
            int optionNum = Integer.valueOf(option);
            if (optionNum == 1) {
                System.out.println("Your balance is $" + accounts.get(name));
            } else if (optionNum == 2) {
                System.out.println("How much would you like to withdraw?");
                String withdraw = scanner.nextLine();
                int withdrawNum = Integer.valueOf(withdraw);
                if (withdrawNum > 100) {
                    System.out.println("Insufficient Funds");
                } else if (withdrawNum <= 100) {
                    System.out.println("Please take cash...");
                }

            }

        }
        if(option.equals("3")) {
            System.out.println("Do you wish to remove your account? [y/n]");

            String cancel = scanner.nextLine();
            if (cancel.toLowerCase().equals("y")) {
                System.out.println("Your account has been removed.");
                accounts.remove(name);
            }
                System.out.println("Have a nice day");
        }

    }
}
