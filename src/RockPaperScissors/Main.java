package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Rock = 0;
        int Paper = 1;
        int Scissors = 2;
        int playerMove;
        int count = 0;
        int computerCount = 0;
        String playAgain = "Y";
        System.out.println("Welcome to Rock Paper Scissors! You can choose between Rock,Paper,Scissors.");
        System.out.println("Rock = 0, Paper = 1, Scissors = 2");

        while (playAgain.equals("Y")) {
            System.out.print("Select a move to start the game: ");
            playerMove = input.nextInt();
            System.out.println("Computer choosing the next move...");
            int computerMove = (int) (Math.random() * 3);

            if (playerMove == computerMove) {
                System.out.println("You did choose " + playerMove + "." + " Computer did choose " + computerMove + ".");
                System.out.println("Tie!!");
            } else if ((playerMove == Rock && computerMove == Scissors) || (playerMove == Paper && computerMove == Rock) || (playerMove == Scissors && computerMove == Paper)) {
                System.out.println("You did choose " + playerMove + "." + " Computer did choose " + computerMove + ".");
                System.out.println("You won!!");
                count++;
            } else {
                System.out.println("You did choose " + playerMove + "." + " Computer did choose " + computerMove + ".");
                System.out.println("Computer won.");
                computerCount++;
            }
            System.out.println("Do you want to play again? (Type Y or N) ");
            playAgain = input.next();
            if (playAgain.equals("N")) {
                System.out.println("You scored " + count + ".");
                System.out.println("Computer scored " + computerCount + ".");
                if (count == computerCount) {
                    System.out.println("Scores are tie! Nobody won.");
                } else if (count > computerCount) {
                    System.out.println("You scored more than Computer. You won!");
                } else {
                    System.out.println("Computer scored more than you. Computer won!");
                }
                count = 0;
                computerCount = 0;
            }
        }
        input.close();
    }
}
