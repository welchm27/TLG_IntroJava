package ex.periment;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0] = 38;
        ages[1] = 37;
        ages[2] = 10;

        System.out.println(ages.length);
        System.out.println(Arrays.toString(ages));

        double[] temps = { 64.0, 56.9, 83.4, 49.0, 98.6 };
        for (double temp: temps){  // for each temp in the array
            System.out.println("The temperature is: " + temp);
        }
        System.out.println();
        for (int i = 0; i < temps.length; i++){  // same as above, just the older way to write the loop
            System.out.println("The Temperature is: " + temps[i]);
        }

    }
}