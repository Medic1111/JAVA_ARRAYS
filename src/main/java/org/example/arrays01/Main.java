package org.example.arrays01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating an Array");

        // SKIP THIS FOR NOW, START AT LINE 17
        String[] myFirstArr = createArr(); // That method returns an array of strings which Im storing in this variable
        // called myFirstArr (its type? You guessed it, array of strings: String[])
        System.out.println(myFirstArr); //Location in memory: AKA: REFERENCE
        System.out.println(Arrays.toString(myFirstArr)); //Stringified version
    }


    // Creating a method with private static (Don't worry about that for now/ public is fine too)
    // Syntax as we go: public static
    // This method will return an array of strings therefore:
    // Syntax as we go: public static String[]
    // I will name this method createArr
    // Syntax as we go: public static String[] createArr
    // Finishing syntax
    // Syntax as we go: public static String[] createArr() {...code block goes here, and must return an array of strings}

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
