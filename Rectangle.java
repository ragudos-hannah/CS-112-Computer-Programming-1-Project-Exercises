// The filename for the following source code must be Rectangle.java
/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : August-24-2022
 *Activity Name and Number: Prelim Exercise Number 2

-----------------------------------------------------------------
Input: Perimeter of a Rectangle (perimeter)
Processes: Compute the perimeter of the rectangle
           Compute the area of the rectangle
           Display results
Output: length and width, perimeter, area
------------------------------------------------------------------
Algorithm:
1. Assign the perimeter of the rectangle
2. Compute the perimeter: perimeter = 2 * length + 2 * width
3. Compute the area: area = length * width
4. Show the length and width of the rectangle
5. Show the perimeter of the rectangle
6. Show the area of the rectangle
 -------------------------------------------------------------------
 */


package prelim.exercises;

import java.lang.*;

public class Rectangle {
    public static void main(String [] args) {
        /* Every variable must be declared with a data type with reference to the kind of
           value that is to be assigned to it. If the value for a radius is constrained to a
           whole number and circumference and area may be floating point numbers (A floating
           point number is a number with the decimal point), the variables' radius,
           circumference and areaOfCircle must be respectively declared with the int, double
           and double data types as shown in the following lines
        */

        // Assignment statement that stores a value to a variable.
        int length = 70; // Assigns the integer value 70 to the length of rectangle.
        int width= 30; // Assigns the integer value 70 to the length of rectangle
        // int is the appropriate data type because the values are whole number.

        // A mathematical expression represents a value that may be assigned to a variable
        int perimeter;
        // To compute the perimeter of a rectangle, we use the formula 2 * length + 2 * length
        perimeter = 2 * length + 2 * length;
        // To compute the area of a rectangle, we use the formula length * width
        int areaOfRectangle = length * width;
        // int is the appropriate data type because the value of the results may be a whole number.

        // Show some outputs on the screen
        System.out.println();
        System.out.println();
        System.out.println(" ************************************************");
        System.out.println(" *                                              *");
        System.out.println(" *                                              *");
        System.out.println(" *     Length of rectangle is " + length +"                *");
        System.out.println(" *     Width of rectangle  is " + width +"                *");
        System.out.println(" *     Perimeter of rectangle is " + perimeter + "            *");
        System.out.println(" *     Area of rectangle is " + areaOfRectangle +"                *");
        System.out.println(" *                                              *");
        System.out.println(" *                                              *");
        System.out.println(" ************************************************");


    } // end of main method
} // end of class




