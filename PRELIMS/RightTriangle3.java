// The filename for the following source code must be RightTriangle3.java
/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : September-05-2022
 *Activity Name and Number: Prelim Exercise Number 4
------------------------------------------------------------------------------------------------------------------------
Problem:
        Write a program that computes and shows the hypotenuse, perimeter and area of a right triangle with
        a given base and height. Let the base and height be entered through the keyboard at program runtime.
Analysis:
Input:  Base and Height of a Rectangle
Processes:
        Read the base and height of the right triangle
        Compute the perimeter of the right triangle
        Compute the area of the right triangle
        Compute the area of the right triangle
        Display results
Output: hypotenuse, perimeter, area
------------------------------------------------------------------------------------------------------------------------
Algorithm:
1. Read/Accept the base and height of the right triangle
2. Compute the hypotenuse: hypotenuse= Math.sqrt((base * base) + (height * height))
3. Compute the perimeter: perimeter = ((base) + (height) + (hypotenuse))
4. Compute the area: area = ((base * height) / 2.0 )
5. Show the base and height of the right triangle
6. Show the perimeter of the right triangle
7. Show the area of the right triangle
------------------------------------------------------------------------------------------------------------------------
*/

package prelim.exercises;

import java.util.Scanner;

import java.lang.*;

public class RightTriangle3 {
    public static void main(String [] args) {

        // Make an object of Scanner that represents the keyboard
        Scanner kbd = new Scanner(System.in);

        double base; // variable declaration
        double height; // variable declaration
        double hypotenuse; // variable declaration
        double perimeter; // variable declaration
        double areaOfRightTriangle; // variable declaration

        // Read the base and height. Print a prompt message

        System.out.println(":Enter the base of right triangle: ");
        // Assigns an integer entered through the keyboard to base
        base = Double.parseDouble(kbd.nextLine());

        System.out.println(":Enter the height of right triangle: ");
        // Assigns an integer entered through the keyboard to height
        height = Double.parseDouble(kbd.nextLine());

        // A mathematical expression represents a value that may be assigned to a variable

        // To compute the hypotenuse of a right triangle, we use the formulaMath.sqrt((base * base) + (height * height))
        hypotenuse = Math.sqrt((base * base) + (height * height));

        // To compute the perimeter of a rectangle, we use the formula ((base) + (height) + (hypotenuse))
        perimeter = ((base) + (height) + (hypotenuse));

        // To compute the area of a rectangle, we use the formula ((base * height) / 2.0 )
        areaOfRightTriangle = ((base * height) / 2.0 );


        // Show some outputs on the screen
        System.out.println();
        System.out.println();
        System.out.println(" *****************************************************");
        System.out.println( " *                                                   *");
        System.out.println( " *                                                   *");
        System.out.println( " * Hypotenuse of the Right Triangle is " + hypotenuse + "          *");
        System.out.println( " * Perimeter of the Right Triangle is " + perimeter+ "          *");
        System.out.println( " * Area of the Right Triangle is " +  areaOfRightTriangle + "               *");
        System.out.println( " *                                                   *");
        System.out.println( " *                                                   *");
        System.out.println(" *****************************************************");


    } // end of main method
} // end of class

