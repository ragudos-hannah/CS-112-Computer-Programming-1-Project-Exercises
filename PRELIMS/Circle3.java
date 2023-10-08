// The filename for the following source code must be Circle3.java
/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : September-05-2022
 *Activity Name and Number: Prelim Exercise Number 4
------------------------------------------------------------------------------------------------------------------------
Problem:
        Write a program that computes and shows the area and the circumference of a circle with
        a given radius. Let the radius be entered through the keyboard at program runtime.
Analysis:
Input:  Radius of a circle (radius)
Processes:
        Read the radius of the circle
        Compute the circumference of the circle
        Compute the area of the circle
        Display results
Output: circumference, area
------------------------------------------------------------------------------------------------------------------------
Algorithm:
1. Read/Accept the radius of the circle
2. Compute the circumference: circumference = 2 * PI * radius
3. Compute the area: area = PI * radius * radius
4. Show the radius of the circle
5. Show the circumference of the circle
6. Show the area of the circle
------------------------------------------------------------------------------------------------------------------------
*/

package prelim.exercises;

import java.util.Scanner;

public class Circle3 {
    public static void main (String [] args) {
// Make an object of Scanner that represents the keyboard
        Scanner kbd = new Scanner(System.in);
        double radius; // variable declaration
        double circumference; // variable declaration
        double areaOfCircle; // variable declaration

// Read the radius. Print a prompt message
        System.out.println(":Enter the radius of the circle: ");
// Assigns an integer entered through the keyboard to radius
        radius = Integer.parseInt(kbd.nextLine());

// A mathematical expression represents a value that is assigned to the variable
// circumference
        circumference = 2 * Math.PI * radius;

// A mathematical expression represents a value that is assigned to the variable
// areaOfCircle
        areaOfCircle = Math.PI * radius *radius;

// The succeeding statements prints strings on the output screen
        System.out.println();
        System.out.println();
        System.out.println(" ***********************************************************");
        System.out.println(" *    Radius of circle is " + radius +"                             *");
        System.out.println(" *    Circumference of circle is " + circumference + "        *");
        System.out.println(" *    Area of circle is " + areaOfCircle + "                  *");
        System.out.println(" ***********************************************************");

    } // end of main method
} // end of class


