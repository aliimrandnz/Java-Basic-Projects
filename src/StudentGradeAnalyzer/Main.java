package StudentGradeAnalyzer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grades = new int[5];
        int sum = 0;
        System.out.println("Hello! You can enter 5 grades to calculate the average, highest and lowest.");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter the grade: ");
            grades[i] = input.nextInt();
            sum += grades[i];
        }
        int highestGrade = grades[0];
        int lowestGrade = grades[0];
        for (int i = 0; i < grades.length - 1; i++) {
            if (highestGrade < grades[i + 1]) {
                highestGrade = grades[i + 1];
            }
            if (lowestGrade > grades[i + 1]) {
                lowestGrade = grades[i + 1];
            }
        }
        double avgGrade = (double) sum / (grades.length);
        System.out.println("The average grade of the class: " + avgGrade);
        System.out.println("The highest grade is: " + highestGrade);
        System.out.println("The lowest grade is: " + lowestGrade);
        input.close();
    }
}
