package com.example;

/**
 * Hello world!
 *
 */
public class Calculator
{
    // public static void main( String[] args )
    // {
    //     System.out.println( "Hello World!" );
    // }
   public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
   public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Testing addition
        int addResult = calculator.add(10, 5);
        System.out.println("10 + 5 = " + addResult);

        // Testing subtraction
        int subtractResult = calculator.subtract(10, 5);
        System.out.println("10 - 5 = " + subtractResult);

        // Testing multiplication
        int multiplyResult = calculator.multiply(10, 5);
        System.out.println("10 * 5 = " + multiplyResult);
    }
}
