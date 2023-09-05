package ex.periment;

import jdk.swing.interop.SwingInterOpUtils;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 37;
        System.out.println("The value of age is: " + age);

        long population = 8_000_000_000L; //have to put the L at the end of the number to make it a long
        System.out.println("The world's population is: " + population);

        double weight = 184.5;
        System.out.println("The weight is: " + weight);

        double shoeSize = 9.5;
        System.out.println("The shoe size is: " + shoeSize);

        boolean hasTwins = false;
        System.out.println("I have twins: " + hasTwins);

        boolean isMarried = true;
        System.out.println("I am married: " + isMarried);

        char shirtSize = 'L';
        System.out.println("Shirt size is: " + shirtSize);

        String name = "michael";
        System.out.println("The name is: " + name);

        // print the following sentence (as a string)
        // The word "belly" makes me laugh
        System.out.println("The word \"belly\" makes me laugh");

        System.out.println();

        int i = 18;
        int j = i;
        i++; // i is now 19

        System.out.println("j is: " + j); //still 18
        System.out.println("i is: " + i);
        System.out.println();

        int x = 3;
        System.out.println("x is: " + ++x); //x++ is a "post" increment; ++x is a "pre" increment
    }
}