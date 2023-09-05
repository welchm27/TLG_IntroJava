package com.math;

// Can import classes like below in order to not have to type Calculator.xxx to access fields in the other class
// import static com.math.Calculator.*;

class CalculatorClient {

    public static void main(String[] args) {
        // ok to pass ints where doubles are expected, an implicit upcast
        double sum = Calculator.add(3, 5);
        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: " + Calculator.subtract(3.1,5.1));

        int input = 11;
        System.out.println(input + " is even: " + Calculator.isEven(input));
        System.out.println();

        System.out.println(Calculator.getRandomInt(5, 20));  // calls the "min-max" version
        System.out.println();

        System.out.println(Calculator.getAverage(3,5,9,9));     // any number of "loose" ints
        System.out.println(Calculator.getAverage(5));               // must pass at least 1


        String greeting = "ALM BINGO NOT-INCORPORATED\n" +
                "(\\_/) \n" +
                "(0.0) \n" +
                "(m m)o \n";
        System.out.println(greeting);
        System.out.println("CONGRATULATIONS YOU WIN!!!!!!!");


    }
}