package SimpleCalculatorV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();
        System.out.print("Choose an operator by numbers: ");
        System.out.print("The operators are (Addition = 1) (Substraction = 2) (Multiplication = 3) (Division = 4) ");
        int selectedOperator = input.nextInt();

        double result = 0;

        if (selectedOperator == 1) {
            result = firstNumber + secondNumber;
            System.out.println("Result is: " + result);
        } else if (selectedOperator == 2) {
            result = firstNumber - secondNumber;
            System.out.println("Result is: " + result);
        } else if (selectedOperator == 3) {
            result = firstNumber * secondNumber;
            System.out.println("Result is: " + result);
        } else if (selectedOperator == 4) {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
                System.out.println("Result is: " + result);
            } else {
                System.out.println("Cannot Divide to Zero.");
            }
        } else {
            System.out.println("Invalid choose!");
        }
    }
}
