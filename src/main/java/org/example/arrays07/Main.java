package org.example.arrays07;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Instantiating Scanner
        System.out.println("Creating two relatable arrays by index from user input");

        // Check 14 and then come back
        createTwoRelatableArrs(scanner);// Return nothing (void)
        scanner.close(); // Dont forget to close the scanner
    }

    // Here the goal is to populate 2 arrays from user input
    // And then print a message that will establish a relationship between them
    // possible because their indices will be relatable.

    // Creating a method that will only print something to the console, and return nothing
    // Return nothing aka VOID
    // This method will accept a scanner
    // Let's check it out
    private static void createTwoRelatableArrs(Scanner scanner){
        String[] names = new String[5]; // Creating an array that will hold 5 strings
        int[] ages = new int[5]; // Creating an array that will hold 5 integers

        for(int i =0; i<names.length; i++){ // Iterating 5 times, could have hard coded.
            System.out.println("Enter name: "); // Sending the user a message
            String name = scanner.next(); // Storing their input as string
            names[i] = name; // assigning the variable holding the string to this index in the
            // String[]

            System.out.println("Enter age: ");  // Sending the user a message
            int age = scanner.nextInt(); // Storing their input as an int
            ages[i] = age; // assigning the variable holding the int to this index in the
            // int[]
        }

        //Loop finished and both arrays are now populated

        for(int i = 0; i<names.length; i++){ // new iterator to print 5 times a message
            System.out.println(names[i] + " is "+ ages[i] + " years old.");
            // The relationship is index based
            // The end.
        }
    }
}
