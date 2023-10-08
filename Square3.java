// The filename for the following source code must be Square3.java
/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : September-05-2022
 *Activity Name and Number: Prelim Exercise Number 4
------------------------------------------------------------------------------------------------------------------------
Problem:
        Write a program that computes and shows the perimeter and area of a square with
        a given side. Let the side be entered through the keyboard at program runtime.
Analysis:
Input:  Side of a Square
Processes:
        Read the side of the square
        Compute the perimeter of the square
        Compute the area of the square
        Compute the area of the square
        Display results
Output: perimeter, area
------------------------------------------------------------------------------------------------------------------------
Algorithm:
1. Read/Accept the side of the square
2. Compute the perimeter: perimeter = 4 * side
3. Compute the area: area = side * side
4. Show the side of the square
5. Show the perimeter of the square
6. Show the area of the square
------------------------------------------------------------------------------------------------------------------------
*/

package prelim.exercises;

import java.util.Scanner;

import java.lang.*;

    public class Square3 {
        public static void main(String [] args) {

            // Make an object of Scanner that represents the keyboard
            Scanner kbd = new Scanner(System.in);
            double side; // variable declaration
            double perimeter; // variable declaration
            double areaOfSquare; // variable declaration

            // Read the side. Print a prompt message
            System.out.println(":Enter the side of the square: ");
            // Assigns an integer entered through the keyboard to side
            side = Integer.parseInt(kbd.nextLine());


            // A mathematical expression represents a value that may be assigned to a variable

            // To compute the perimeter of a square, we use the formula 4 * side
            perimeter = 4 * side;

            // To compute the area of a square, we use the formula side * side
            areaOfSquare = side * side;


            // Show some outputs on the screen
            System.out.println();
            System.out.println();
            System.out.println(" *********************************************");
            System.out.println(" *                                           *");
            System.out.println(" *                                           *");
            System.out.println(" *    Sides of square is " + side +"                *");
            System.out.println(" *    Perimeter of square is " + perimeter + "           *");
            System.out.println(" *    Area of square is " + areaOfSquare +"               *");
            System.out.println(" *                                           *");
            System.out.println(" *                                           *");
            System.out.println(" *********************************************");


        } // end of main method
    } // end of class



