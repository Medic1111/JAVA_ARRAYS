package org.example.arrays05;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating an Array with Random ints");

        // SKIP FOR NOW AND GO TO 15
        int[] myRandomIntArr = createRandomArr(); // returns and int[] with random els
        System.out.println(Arrays.toString(myRandomIntArr));
    }

    // Creating a method that will return an array of int
    // Naming is createRandomArr
    // Im importing Random from java.util.Random

    private static int[] createRandomArr(){
        Random random = new Random(); // Instantiating Random
        int[] myRandomArr = new int[5]; // creating a new array that will hold 5 int elements
        // By default, because im not initializing it, Java will fill it with 0s

        for(int i =0; i<myRandomArr.length; i++){ // Iterating 5 times (thats the length of my arr)
            int randomInt = random.nextInt(100); // random.nextInt will give me an int up to the value I pass
            //inside as bound, exclusive (up to 99).
            myRandomArr[i] = randomInt; // here I'm assigning that random int to index of i
        }

        return myRandomArr; // My method must return an int[], here it is... GO TO MAIN
    }
}
