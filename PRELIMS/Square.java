// The filename for the following source code must be Square.java
/*
 *Name:  Ragudos, Hannah, T. 
 *Programming Date : August-24-2022
 *Activity Name and Number: Prelim Exercise Number 2

-----------------------------------------------------------------
Input: Perimeter of a Square (perimeter)
Processes: Compute the perimeter of the square
           Compute the area of the square
           Display results
Output: sides, perimeter, area
------------------------------------------------------------------
Algorithm:
1. Assign the perimeter of the square
2. Compute the perimeter: perimeter = 4 * side
3. Compute the area: area = side * side
4. Show the sides of the square
5. Show the perimeter of the square
6. Show the area of the square
 -------------------------------------------------------------------
 */


package prelim.exercises;

import java.lang.*;

public class Square {
    public static void main(String [] args) {
        /* Every variable must be declared with a data type with reference to the kind of
           value that is to be assigned to it. If the value for a radius is constrained to a
           whole number and circumference and area may be floating point numbers (A floating
           point number is a number with the decimal point), the variables' radius,
           circumference and areaOfCircle must be respectively declared with the int, double
           and double data types as shown in the following lines
        */

        // Assignment statement that stores a value to a variable.
        int side = 114; //Assigns the integer value 114 to the sides of square.

        // A mathematical expression represents a value that may be assigned to a variable
        int perimeter;
        // To compute the perimeter of a square we use the formula 4 * side
        perimeter = 4 * side;
        // To compute the area of a square we use the formula side * side
        int areaOfSquare = side * side;
        // int is the appropriate data type because the value of the results may be a whole number.

        // Show some outputs on the screen
        System.out.println();
        System.out.println();
        System.out.println(" *********************************************");
        System.out.println(" *                                           *");
        System.out.println(" *                                           *");
        System.out.println(" *    Sides of square is " + side +"                 *");
        System.out.println(" *    Perimeter of square is " + perimeter + "             *");
        System.out.println(" *    Area of square is " + areaOfSquare +"                *");
        System.out.println(" *                                           *");
        System.out.println(" *                                           *");
        System.out.println(" *********************************************");

    } // end of main method
} // end of class
