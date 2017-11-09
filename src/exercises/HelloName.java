package exercises;
import java.util.Scanner;


public class HelloName {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        String first_name;

        System.out.println("Please tell me your name.");
        first_name = user_input.next();

        System.out.println("Hello " + first_name );

    }
}


