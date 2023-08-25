package org.example.arrays04;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        System.out.println("SORTING ARRAYS");

        // GLANCE AT 17 AND COME BACK
        int[] myIntArr = createArrInit(); // This method return an array of integers
        System.out.println(myIntArr); //Printing here gives me the Reference: Location in memory
        System.out.println(Arrays.toString(myIntArr)); //Printing here gives me the Stringified version

        // My objective is to sort that array
         Arrays.sort(myIntArr); // This should do it
         System.out.println(Arrays.toString(myIntArr)); // That did it... but it obviously altered the original

        // Comment 17 and 18 and uncomment these following ones:

         // int[] myCopyArr = Arrays.copyOf(myIntArr, myIntArr.length);
         // Arrays.sort(myCopyArr);
         // System.out.println(Arrays.toString(myIntArr)); // Original stays intact
         // System.out.println(Arrays.toString(myCopyArr)); // Copy gets sorted... the end...
    }

    // Same method as we used before that returns and array of ints
    private static int[] createArrInit(){
        System.out.println("Creating an Array with initializer");
        int[] myIntArr = {1111, 111, 11, 1, 111111}; // The backets here eliminate the need for new int[numOfEls]
        // Inside the brackets I'm assigning the values right away.
        return myIntArr; // This method is expected to return an int[], therefore, here it is.

        // If you notice intelliJ calling this redundant, its bc it is: Shorthand: return new int[]{1,11,111,1111};

    }
}
