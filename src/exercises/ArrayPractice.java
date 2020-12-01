/*
3.7.1. Array Practice
Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.

Loop through the array and print out each value, then modify the loop to only print the odd numbers.

For this exercise, use the string I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. Use the split method to divide the string at each space and store the individual words in an array. If you need to review the method syntax, look back at the String methods table.

Print the array of words to verify that your code works. The syntax is:

System.out.println(Arrays.toString(arrayName));
Repeat steps 3 and 4, but change the delimiter to split the string into separate sentences.

Note
Some characters, like a period ".", have special meanings when used with the split method. They cannot be used as-is for the deliminator.

To use these characters as the deliminator, we must escape their special meanings. Instead of .split("."), we need to use .split("\\.").


*/


package exercises;

import java.util.Arrays;

public class ArrayPractice {
    //Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        //Loop through the array and print out each value.
        for (int i : arrayOfNumbers) {
            System.out.println(i);
        }
        System.out.println('\r');

        //Modify the loop to only print the odd numbers.
        System.out.println("The odd numbers in the given array are: ");

        for (int i : arrayOfNumbers) {
            if (i % 2 != 0)
                System.out.println(i);
        }
        System.out.println('\r');
        System.out.println("The original phrase was: " + phrase);

        System.out.println('\r');

        //Use the split method to divide the string at each space and store the individual words in an array.
        String[] words = phrase.split(" ");
        System.out.println("Using the split method to divide the string at each space and store the individual words in an array: ");
        System.out.println(Arrays.toString(words));

        //Repeat steps 3 and 4, but change the delimiter to split the string into separate sentences.
        System.out.println('\r');
        String[] sentences = phrase.split("\\.");
        System.out.println("To split the string into separate sentences: ");
        System.out.println(Arrays.toString(sentences));
    }
}