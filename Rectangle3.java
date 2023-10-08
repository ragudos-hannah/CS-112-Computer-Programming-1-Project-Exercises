// The filename for the following source code must be Rectangle3.java
/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : September-05-2022
 *Activity Name and Number: Prelim Exercise Number 4
------------------------------------------------------------------------------------------------------------------------
Problem:
        Write a program that computes and shows the perimeter and area of a rectangle with
        a given length and width. Let the length and width be entered through the keyboard at program runtime.
Analysis:
Input:  Length and Width of a Rectangle
Processes:
        Read the length and width of the rectangle
        Compute the perimeter of the rectangle
        Compute the area of the rectangle
        Compute the area of the rectangle
        Display results
Output: perimeter, area
------------------------------------------------------------------------------------------------------------------------
Algorithm:
1. Read/Accept the side of the rectangle
2. Compute the perimeter: perimeter = 2 * length + 2 * length
3. Compute the area: area = length * width
4. Show the side of the rectangle
5. Show the perimeter of the rectangle
6. Show the area of the rectangle
------------------------------------------------------------------------------------------------------------------------
*/

package prelim.exercises;

import java.util.Scanner;

import java.lang.*;

    public class Rectangle3 {
        public static void main(String [] args) {

            // Make an object of Scanner that represents the keyboard
            Scanner kbd = new Scanner(System.in);
            double length; // variable declaration
            double width; // variable declaration
            double perimeter; // variable declaration
            double areaOfRectangle; // variable declaration

            // Read the length and width. Print a prompt message

            System.out.println(":Enter the length of the rectangle: ");
            // Assigns an integer entered through the keyboard to length
            length = Integer.parseInt(kbd.nextLine());

            System.out.println(":Enter the width of the rectangle: ");
            // Assigns an integer entered through the keyboard to width
            width = Integer.parseInt(kbd.nextLine());

            // A mathematical expression represents a value that may be assigned to a variable
            //perimeter;

            // To compute the perimeter of a rectangle, we use the formula 2 * length + 2 * length
            perimeter = 2 * length + 2 * length;

            // To compute the area of a rectangle, we use the formula length * width
            areaOfRectangle = length * width;


            // Show some outputs on the screen
            System.out.println();
            System.out.println();
            System.out.println(" ************************************************");
            System.out.println(" *                                              *");
            System.out.println(" *                                              *");
            System.out.println(" *     Length of rectangle is " + length +"              *");
            System.out.println(" *     Width of rectangle  is " + width +"              *");
            System.out.println(" *     Perimeter of rectangle is " + perimeter + "          *");
            System.out.println(" *     Area of rectangle is " + areaOfRectangle +"              *");
            System.out.println(" *                                              *");
            System.out.println(" *                                              *");
            System.out.println(" ************************************************");


        } // end of main method
    } // end of class


