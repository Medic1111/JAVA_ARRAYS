package org.example.arrays03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("ARRAYS PART 3- Copying arrays");

        // GLANCE 46 AND COME BACK HERE
        String[] myStrArr = createArr(); // Method returns an array of strings which im storing
        //in a variable called myStrArr.
        System.out.println(myStrArr); //Location in memory: AKA: REFERENCE
        System.out.println(Arrays.toString(myStrArr)); //Stringified version

        // Here I will attempt to make a copy of this array
        String[] myFakeCopy = myStrArr;
        System.out.println(Arrays.toString(myFakeCopy)); // Looks exactly like the previous
        // Seems like a success, but is this a DIFFERENT array containing the same elements?

        // Let's find out:
        System.out.println(myStrArr); //Location in memory: AKA: REFERENCE
        System.out.println(myFakeCopy); //Location in memory: AKA: REFERENCE
        // IMPOSTOR: myFakeCopy is still the SAME array as you can see by their addresses
        // When I assigned the original as the value of the supposedly copy, I essentially
        // assigned the same reference, and failed to create a brand new, different array,
        // that simply contains the same elements.

        // Now let's ACTUALLY create a copy:
        String[] myRealCopy = Arrays.copyOf(myStrArr, myStrArr.length);  // Here I'm using
        // the Arrays.copyOf to actually create a new array that will look like the original
        // and as second argument I'm ensuring it will contain the same amount of elements.
        // You can copy and expand by adding a larger length, or copy and reduce by decreasing it.

        //Let's verify:
        System.out.println(Arrays.toString(myRealCopy)); // Good, but now to the real test...
        System.out.println(myRealCopy); // HA!!! Different address! Indeed a new Array

        // Cool Ary... cool... but why all that?

        // Because I may want to use methods that by default will alter the original, and perhaps
        // altering the original is not what I need/want. Sorting for example, the way we know it,
        // will alter the original. What if I need to work with a sorted version, but keep the original
        // intact? THAT's why.
    }

    // Same Method as in part one: Returns an array of Strings
    private static String[] createArr(){
        System.out.println("Creating An Array");
        String[] myStrArr = new String[5]; // Syntax to create an array that will hold 5 Strings. Because data
        // has not been given yet, Java will populate that array with its default value: Objects (reference types = null)

        myStrArr[0] = "Moon"; // Assigning value to index 0 which was previously null by default
        myStrArr[1] = "Ocean"; // Assigning value to index 1 which was previously null by default
        myStrArr[2] = "Sun"; // Assigning value to index 2 which was previously null by default
        myStrArr[3] = "Stars"; // Assigning value to index 3 which was previously null by default
        myStrArr[4] = "Sand"; // Assigning value to index 4 which was previously null by default

        // System.out.println(myStrArr); //This will print the Location In Memory
        // System.out.println(Arrays.toString(myStrArr)); // This will print the Stringified version (something that make
        //sense to us)

        return myStrArr; // As specified when I created this method, it returns the array of string. Now check Main.
    }


}


