package org.example.arrays02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("ARRAYS PART 2");

        // SKIP FOR NOW, START AT 16
        int[] myIntArr = createArrInit(); // This method return an array of integers
        System.out.println(myIntArr); //Printing here gives me the Reference: Location in memory
        System.out.println(Arrays.toString(myIntArr)); //Printing here gives me the Stringified version

    }

    // Creating a method that will return an array of integers
    // Im calling it: createArrInit
    // This will be different than the previous because here I will initialize it right away

    private static int[] createArrInit(){
        System.out.println("Creating an Array with initializer");
        int[] myIntArr = {1,11,111,1111}; // The backets here eliminate the need for new int[numOfEls]
        // Inside the brackets I'm assigning the values right away.
        return myIntArr; // This method is expected to return an int[], therefore, here it is. Check Main

        // If you notice intelliJ calling this redundant, its bc it is: Shorthand: return new int[]{1,11,111,1111};

    }
}
