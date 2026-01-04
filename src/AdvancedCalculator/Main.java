package AdvancedCalculator;

public class Main {
    public static void main(String[] args) {

        // OBJECT 1: My Personal Calculator
        System.out.println("--- Creating First Calculator (myCalc) ---");
        Calculator myCalc = new Calculator();

        // OBJECT 2: Your Personal Calculator
        System.out.println("--- Creating Second Calculator (yourCalc) ---");
        Calculator yourCalc = new Calculator();


        // EXPERIMENT START

        System.out.println("\n--- Step 1: myCalc calculates 10 + 50 ---");
        myCalc.add(10, 50);
        // myCalc memory should be 60.

        System.out.println("\n--- Step 2: yourCalc calculates 5 + 5 ---");
        yourCalc.add(5, 5);
        // yourCalc memory should be 10.


        // THE BIG QUESTION: Did 'yourCalc' mess up 'myCalc's memory?
        System.out.println("\n--- Checking Memories ---");

        System.out.print("myCalc Memory: ");
        myCalc.showMemory();   // Expecting 60

        System.out.print("yourCalc Memory: ");
        yourCalc.showMemory(); // Expecting 10
    }
}