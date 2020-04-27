package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        //Declare string first sentence. Convert to lowercase.
        String rawSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String firstSentence = rawSentence.toLowerCase();

        //Prompt the user for a search term in the sentence. Convert to lowercase.
        Scanner input = new Scanner(System.in);
        System.out.println("Search for a term in the sentence: ");
        String searchTerm = input.nextLine().toLowerCase();

        //Check if the sentence contains search term and print results.
        boolean result = firstSentence.contains(searchTerm);
        System.out.println("The sentence contains your search term: " + result);

        //Assume user enters a term in the sentence. Find index and length of term.
        int index = firstSentence.indexOf(searchTerm);
        int length = searchTerm.length();

        //Print out index and length of term.
        System.out.println("The index of " + searchTerm + "in the sentence is" + index);
        System.out.println("The length of " + searchTerm + "is" + length);

        //Remove the word from the string Store in new string. Print the new string.



    }
}
