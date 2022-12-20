package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String passage = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        passage = passage.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to look for in the passage:");
        String searchString = input.nextLine();

        int firstIndex = passage.indexOf(searchString.toLowerCase());
        if (firstIndex > -1) {
            System.out.println("First occurrence of " + searchString.toLowerCase() + " at index " + firstIndex + ". Your search term is " + searchString.length() + " characters long.");
            String updatedPassage = passage.replace(searchString, "");
            System.out.println(updatedPassage);
        } else {
            System.out.println("Sorry, your search term was not found in the passage.");
        }
        //if (searchString.equals(passage)) {
        //    System.out.println("Your word, " + searchString + ", was found in the passage.");
        //} else {
        //    System.out.println("Your word, " + searchString + ", was not found in the passage.");
        input.close();
        }
}
