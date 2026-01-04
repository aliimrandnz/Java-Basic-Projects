package ATMSimulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 2000;
        int pin_code = 1234;
        int entered_pin_code;
        int user_input;
        double add_deposit = 0;
        double withdraw = 0;
        String yes_or_no;

        Scanner input = new Scanner(System.in);
        int pin_try_count = 0;
        do {
            System.out.print("Enter the PIN: ");
            entered_pin_code = input.nextInt();
            if (entered_pin_code != pin_code) {
                pin_try_count++;
            }
            if (pin_try_count == 3) {
                System.out.println("You exceeded the try limit for the PIN code. Please try again later.");
                break;
            }
            if (entered_pin_code == pin_code) {
                System.out.println("             Welcome to ATM!");
                welcome_message();
                user_input = input.nextInt();

                do {

                    if (user_input == 1) {
                        check_balance(balance);
                        System.out.println("Would you like to do another transaction?  (Y/N) ");
                        yes_or_no = input.next();
                        if (yes_or_no.equals("Y")) {
                            user_input = main_menu(input, user_input);
                        } else {
                            user_input = -1;
                        }
                    } else if (user_input == 2) {
                        check_balance(balance);
                        balance = deposit_money(input, add_deposit, balance);
                        System.out.println("Would you like to do another transaction?  (Y/N) ");
                        yes_or_no = input.next();
                        if (yes_or_no.equals("Y")) {
                            user_input = main_menu(input, user_input);
                        } else {
                            user_input = -1;
                        }
                    } else if (user_input == 3) {
                        check_balance(balance);
                        balance = withdraw_money(input, withdraw, balance);
                        System.out.println("Would you like to do another transaction?  (Y/N) ");
                        yes_or_no = input.next();
                        if (yes_or_no.equals("Y")) {
                            user_input = main_menu(input, user_input);
                        } else {
                            user_input = -1;
                        }
                    }
                    if (user_input == -1) {
                        System.out.println("Quitting...");
                    }

                } while (user_input != -1);
            }
        } while (entered_pin_code != pin_code);

    }

    public static void welcome_message() {
        System.out.println("-----------------------------------------");
        System.out.println("Please choose the process you wish to do.");
        System.out.println("          1. Check the Balance ");
        System.out.println("          2. Deposit Money ");
        System.out.println("          3. Withdraw Money ");
        System.out.println("-----------------------------------------");
        System.out.println("          -1. Exit ");
    }

    public static int main_menu(Scanner in, int user_input) {
        System.out.println("-----------------------------------------");
        System.out.println("Please choose the process you wish to do.");
        System.out.println("          1. Check the Balance ");
        System.out.println("          2. Deposit Money ");
        System.out.println("          3. Withdraw Money ");
        System.out.println("-----------------------------------------");
        System.out.println("          -1. Exit ");
        user_input = in.nextInt();
        return user_input;
    }

    public static void check_balance(double balance) {
        System.out.println("Your account balance is " + balance + "$.");
    }

    public static double deposit_money(Scanner in, double add_deposit, double balance) {
        System.out.println("What is the amount of money you would like to deposit?: ");
        add_deposit = in.nextDouble();
        balance += add_deposit;
        System.out.println(add_deposit + "$ added to your account. Your new account balance is " + balance + "$.");
        return balance;
    }

    public static double withdraw_money(Scanner in, double withdraw, double balance) {
        System.out.println("What is the amount of money you would like to withdraw?: ");
        withdraw = in.nextDouble();
        if (withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Withdraw successfully completed. Your new account balance is " + balance + "$.");
        } else {
            System.out.println("You can't withdraw an amount more than your account balance.");
            check_balance(balance);
        }
        return balance;
    }

}
