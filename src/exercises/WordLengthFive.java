package exercises;
import java.util.ArrayList;

public class WordLengthFive {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        String[] list = {"Write", "Leroy", "Macks  ", "method", "to", "print", "out", "each", "word", "in", "a", "list", "that", "has", "exactly", "five", "letters."};

        for (String word : list) {
            if (word.length() == 5) {
                System.out.println(word);

            }

        }
    }
}



