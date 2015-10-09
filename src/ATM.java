import java.util.Scanner;

/**
 * Created by benjamindrake on 10/8/15.
 */
public class ATM {
    public static void run() throws Exception {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        if (name.equals("")) {
            throw new Exception("Please enter name");
        }

        System.out.println("[1] Check your balance");
        System.out.println("[2] Withdraw cash");
        System.out.println("[3] Cancel");
        String option = scanner.nextLine();
        int optionNum = Integer.valueOf(option);
        if (optionNum == 1) {
            System.out.println("Your balance is $100");
        } else if (optionNum == 2) {
            System.out.println("How much would you like to withdraw?");
            String withdraw = scanner.nextLine();
            int withdrawNum = Integer.valueOf(withdraw);
            if (withdrawNum > 100) {
                System.out.println("Insufficient Funds");
            } else if (withdrawNum <= 100) {
                System.out.println("Please take cash...");
            }

        } else if (optionNum == 3){
            System.out.println("Have a nice day!");
        }

    }
}
