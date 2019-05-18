package com.company;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        // did someone forget to say error checking? :^)
        Scanner reader = new Scanner(System.in);

        System.out.print("How much do you weigh (in pounds)? ");
        double weight = reader.nextDouble();

        System.out.print("How tall are you (in inches)? ");
        double height = reader.nextDouble();

        System.out.println("Your BMI is " + (weight/(height*height))*703);

        System.out.print("A BMI between 20 and 24 s considered ideal. What would you like your BMI to be? ");
        double target = reader.nextDouble();

        System.out.println("Your weigt needs to be " + target /703*height*height + " pounds for your BMI to be " + target);
    }
}
