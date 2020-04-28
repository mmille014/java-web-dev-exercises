package exercises;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        for(int intElement : intArray) {
            //System.out.println(intElement);
        }
        for(int intElement : intArray) {
            //System.out.println(intElement);
        }
        for(int i : intArray) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }

        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
    }
}