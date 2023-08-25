package org.example.arrays06;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Populating an array with user input");
        // SKIP FOR NOW AND GO TO 19

        String[] userArr = createArrFromInput(scanner); // Storing the return value of this method
        System.out.println(Arrays.toString(userArr)); // Printing the array in stringified manner

        scanner.close(); // Dont forget to close the scanner

    }

    // Creating a method that will accept a scanner of type Scanner as a parameter
    // It will return an array of strings
    // The objective is to populate an array with whatever the user inputs
    private static String[] createArrFromInput(Scanner scanner){
        String[] userArr = new String[5]; // Creating an array that will hold 5 Strings

        for(int i =0; i<5; i++){  // running a loop 5 times (could be the arr length)
            System.out.println("Enter a something:"); // Giving the user a message
            String userInput = scanner.nextLine(); // Reading the user input as a String and
            // storing it in a variable called userInput
            userArr[i] = userInput; // Assigning that varibale to each index of the array as
            //the iteration goes on. GO TO MAIN
        }

        return userArr;
    }
}
