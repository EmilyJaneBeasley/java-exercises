package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        Integer distance;
        System.out.print("Enter the number of miles you have driven:");
        distance = user_input.nextInt ();

        Integer amt_gas;
        System.out.print("Enter the number of gallons of gas you've consumed:");
        amt_gas = user_input.nextInt();

        Integer mpg = (distance / amt_gas);
        System.out.println("Your car gets " + mpg + " miles per gallon" );
    }
}
