package com.math;

/*
 * This is an "all-static" class, ie., one that contains only static methods.
 */
class Calculator {

    public static double add(double a, double b) {
        return a + b; // return sum of the parameters}
    }

    public static double subtract(double a, double b) {
        return a - b; // return difference of the parameters
    }

    public static boolean isEven(double value) {
        return value % 2 == 0; //module operator if remainder is 0 then true
    }

    /*
     * Returns a random integer between 1 and 14.
     *
     * HINT: see a class called Math (in package java.lang), and look for a helpful method here.
     * NOTE: these methods in the MATH class are all "static", which means you call them as:
     * Math.methodName()
     */

    public static int getRandomInt() {
        // delegate to the min-max version, passing 1 for the min, and 14 for the max
        return getRandomInt(1, 14);
    }

//    public int getRandomInt() { // perhaps we take two arguments, min and max
//        int result = 0; // declare return value as a local variable
//
//        double rand = Math.random();                //0.00000 to 0.99999
//        double scaled = (rand * 14) + 1;                  // 0.00000 to 13.99999
//
//        // truncate the decimal (remove it), via explicit downcast the double to int
//        result = (int) scaled;                 // 1 to 14
//        return result;
//    }

    /*
     * Returns a random integer between 'min' and 'max' (inclusive)
     */

    public static int getRandomInt(int min, int max){
            int result = 0; //return value

            double rand = Math.random();                // 0.000 to 0.999
            double scaled = rand * (max - min) + min;   // if it came back 0.000 it would come back 5.000 to 19.999
            double rounded = Math.ceil(scaled);    // 5.0000 to 20.0000
            return (int) rounded;                  // min to max
    }

    /*
     * Returns the average (arithmetic mean) of the supplied integers.
     *
     */
    public static double getAverage(int first, int... rest){  // client can pass any number of ints
        double result = 0.0;            // placeholder result to get started.  Not needed.

        double sum = first;               // changes each time the sum below gets a new value from adding the next number
        for (int value : rest){
            sum += value;         // adds each number in value to the sum. =+ is the same as writing sum = sum + value
        }
        result = sum / (1 + rest.length);   // at runtime, rest is an array

        return result;
    }

}