package exercises;
import java.util.Scanner;


public class RectangleArea {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        Integer side_length;
        System.out.print("Enter the length of one side of the rectangle:");
        side_length = user_input.nextInt ();

        Integer side_width;
        System.out.print("Enter the width of one side of the rectangle:");
        side_width = user_input.nextInt();

        Integer area = (side_length * side_width);
        System.out.println("The area of your rectangles is: " + area + " inches squared");
    }
}


