package exercises;

import java.util.ArrayList;

public class SumEvenIntegers {
    public static void main (String[]args){
        ArrayList<Integer> numbers = new ArrayList<>();
        int []list = {2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 15, 20, 22};

        int sum = 0;
        for (int i : list){
            sum += (i %2 == 0)?i:0;
            }
            System.out.println("The sum of even numbers in the list is: " + sum);



        }

        }



