package org.example.array08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Final on Array: Checking if an element is in an array");

        // Glance at 27 and come back here
        String[] myStrArr = createArr(); // Storing the returned array of strings in this variable

        // The objective is to find out if that array contains a certain element
        // To do that, we will use the binarySearch, which requires the array to be sorted
        Arrays.sort(myStrArr); // Sorting the array to prep it for the binarySearch

        // The Binary Search will return an int, >=0 means the element is there
        // Negative values indicate that element is not found
        int binarySearch = Arrays.binarySearch(myStrArr, "Moon"); // Passing the sorted array
        // and the target element I'm looking for
        System.out.println(binarySearch); // Here's the result

        boolean isMoonPresent = binarySearch >= 0; // Here I'm declaring a boolean that will
        // return true if the result of the binarySearch is >= 0, otherwise it will return false
        System.out.println(isMoonPresent); // The end (play with the string to observe the opposite behavior)
    }

    // Same method as used before.
    // It returns an array of strings; String[]
    private static String[] createArr(){
        System.out.println("Creating An Array");
        String[] myStrArr = new String[5];
        myStrArr[0] = "Moon";
        myStrArr[1] = "Ocean";
        myStrArr[2] = "Sun";
        myStrArr[3] = "Stars";
        myStrArr[4] = "Sand";

        // System.out.println(myStrArr); //Location In Memory
        // System.out.println(Arrays.toString(myStrArr)); // Stringified version

        return myStrArr;
    }
}
