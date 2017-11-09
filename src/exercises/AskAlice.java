package exercises;
import java.util.Scanner;

public class AskAlice {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        String first_paragraph;
        first_paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";

    String term_search;
        System.out.println("Please enter a search term:");
        term_search = user_input.next();

        if ( first_paragraph.toLowerCase().contains(term_search.toLowerCase())) {
    System.out.print("Your word is in the paragraph! ");
        }
            else {
    System.out.print("Your word was not found. ");
        }


    }

}
