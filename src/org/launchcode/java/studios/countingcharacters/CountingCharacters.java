package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> count = new HashMap<>();
        char[] letters;

        System.out.println("Enter a passage");
        String passage = input.nextLine();

        letters = passage.toLowerCase().toCharArray();

        for (char l : letters) {
            if (!count.containsKey(l)) {
                count.put(l, 1);
            } else {
                Integer val = count.get(l);
                count.put(l, val + 1);

                System.out.println(count);
            }
        }
    }
}