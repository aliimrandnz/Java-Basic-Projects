package AdvancedCalculator;

public class Calculator {

    public double memory = 0;

    public double add(double a, double b) {
        double result = a + b;
        memory = result;
        System.out.println("Addition completed. Result has saved: " + memory);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        memory = result;
        System.out.println("Subtraction completed. Result has saved: " + memory);
        return result;
    }


    public void showMemory() {
        System.out.println("The number in memory: " + memory);
    }

    public void clearMemory() {
        memory = 0;
        System.out.println("Memory has cleaned.");
    }
}