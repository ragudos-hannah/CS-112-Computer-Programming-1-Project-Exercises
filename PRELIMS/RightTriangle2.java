// The filename for the following source code must be RightTriangle2.java
/*
 *Name:  Ragudos, Hannah, T.
 *Programming Date : August-31-2022
 *Activity Name and Number: Prelim Exercise Number 3
-----------------------------------------------------------------------------------------------
Problem:
Write a program that will show the hypotenuse of a right triangle with a given base and height
-----------------------------------------------------------------------------------------------
Analysis:
Input: Hypotenuse of a Right Triangle
Processes: Compute the hypotenuse of the right triangle
Display the data associated with the right triangle
Output: hypotenuse
-----------------------------------------------------------------------------------------------
Algorithm:
1. Assign the hypotenuse of the right triangle
2. Compute the hypotenuse: hypotenuse = c, c = square root of (a2 + b2).
3. Show the given area of right triangle
4. Show the computed hypotenuse of the right triangle with a given base and height
 -----------------------------------------------------------------------------------------------
 */

package prelim.exercises;

import java.lang.*;

public class RightTriangle2 {
        public static void main(String [] args) {

            // A mathematical expression represents a value that may be assigned to a variable
            double base; // double is the appropriate data type of base because the
                         // value of base may be a floating point number.
            base = 41.14; // Assigns 11.5 as the base of a right triangle

            double height; // double is the appropriate data type of base because the
                          // value of height may be a floating point number.
            height = 60.03; // Assigns 14.10 as the height of a right triangle

            double hypotenuse; // double is the appropriate data type of hypotenuse because the
                               // value of hypotenuse may be a floating point number.
            hypotenuse= Math.sqrt((base * base) + (height * height)) ; // computes the hypotenuse of the
                                                                       // right triangle with a given base and height.

//Show data about the right triangle
            System.out.println( );
            System.out.println( );
            System.out.println(" ************************************************************************");
            System.out.println(" *     Given base of right triangle = " + base + "                             *");
            System.out.println(" *     Given height of right triangle = " + height + "                           *");
            System.out.println(" *     Computed hypotenuse of the right triangle = " + hypotenuse + "    *");
            System.out.println(" ************************************************************************");

        } // end of the main method
    } // end of RightTriangle2 class


