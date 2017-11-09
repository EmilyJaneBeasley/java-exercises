package org.launchcode.java.studios;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";


        char [] strArray = newString.toCharArray();
        for (char c : strArray){
            if (countMap.containsKey(c)){
                countMap.put(c,countMap.get(c)+1);
            }
            else {
                countMap.put(c, 1);
            }
        }
            System.out.println(countMap);




    }
}
