// The filename for the following source code must be RightTriangle.java
/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : August-24-2022
 *Activity Name and Number: Prelim Exercise Number 2

-----------------------------------------------------------------
Input: Perimeter of a Right Triangle (perimeter)
Processes: Compute the perimeter of the right triangle
           Compute the area of the right triangle
           Display results
Output: base, height, hypotenuse, perimeter, area
------------------------------------------------------------------
Algorithm:
1. Assign the perimeter of the right triangle
2. Compute the perimeter: perimeter = base + height +
hypotenuse
3. Compute the area: area = (1/2) * base * height
4. Show the sides of the right triangle
5. Show the perimeter of the right triangle
6. Show the area of the right triangle
 -------------------------------------------------------------------
 */

package prelim.exercises;

import java.lang.*;

public class RightTriangle {
    public static void main(String [] args) {
        /* Every variable must be declared with a data type with reference to the kind of
           value that is to be assigned to it. If the value for a radius is constrained to a
           whole number and circumference and area may be floating point numbers (A floating
           point number is a number with the decimal point), the variables' radius,
           circumference and areaOfCircle must be respectively declared with the int, double
           and double data types as shown in the following lines
        */

        // Assignment statement that stores a value to a variable.
        int base = 10; // Assigns the integer value 10 to the base of right triangle.
        int height = 45; // Assigns the integer value 45 to the height of right triangle.
        double hypotenuse = 46.1; // Assigns the integer value 46.1 as the computed hypotenuse of right triangle.
        // double is the appropriate data type for the hypotenuse because the value is a floating point number

        // A mathematical expression represents a value that may be assigned to a variable
        // To compute the perimeter of right triangle, we use the formula ((base) + (height) + (hypotenuse)
        double perimeter= ((base) + (height) + (hypotenuse));
        // To compute the perimeter of right triangle, we use the formula ((base * height) / 2.0 )
        double areaOfRightTriangle = ((base * height) / 2.0 );
        // double is the appropriate data type because the value of the results may be a floating point number.

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
