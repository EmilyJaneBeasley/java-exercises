package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        float radius;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = in.nextFloat();

        if (radius < 0) {
            System.out.println("Radius must be positive!");
        }


        else {
            area = (pi * radius * radius);
            System.out.println("The area of your circle is " + area);
        }
    }
}