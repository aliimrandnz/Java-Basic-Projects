package NumberGuessingGame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*100)+1;
        int count =0;
        boolean isFound = false;
        while(!isFound){
            System.out.print("Enter a number between 1-100 (100 included): ");
            int inputNumber = input.nextInt();
            count++;
            if(inputNumber>randomNumber){
                System.out.println("Too high! Try again.");
            }
            else if(inputNumber<randomNumber){
                System.out.println("Too low! Try again.");
            }
            else {
                System.out.println("You have found the number!");
                isFound = true;
            }
        }
        System.out.println("You have found the number in " + count + " try!");
    }
}
