// The filename for the following source code must be Exercise5.java
/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : September-07-2022
 *Activity Name and Number: Prelim Exercise Number 5
 */

package prelim.exercises;

import java.util.*;

import java.lang.*;

import java.lang.String;

import static java.lang.String.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

// get keyboard input for three integers
        System.out.print("First Number: ");
        int n1 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Second Number: ");
        int n2 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Third Number: ");
        int n3 = Integer.parseInt(keyboard.nextLine());

// display the three numbers
        System.out.println ("You entered the numbers " + n1 + ", " + n2 + " and " + n3);

// add the three numbers and store it in another int variable named sum
        int sum = n1 + n2 + n3;

// display the sum
        System.out.println("\nThe sum of the three numbers is " + sum);

// divide the first number by the second and display the value
        int q1 = n1 / n2;
        System.out.println("\nThe expression used computed the integer quotient =  " + q1);
        double q2 = (double) n1 / n2;
        System.out.println("\nThe expression used computed the actual quotient =  " + q2);


//
/* #1. Compute the product of the three numbers, store it in another integer
variable and display this value. INSERT THE CODES BELOW... */
        // multiply the three numbers and display the value
        int p = n1 * n2 * n3;
        System.out.println("\nThe expression used computed the product of the three numbers =  " + p);

/* #2. Get the sum of the first two numbers and divide it by the third number,
compute only for the integer quotient and display the value.
INSERT THE CODES BELOW... */
        // add the first two numbers and divide by third number and display the value of integer quotient
        int siq = ((n1 + n2) / n3) ;
        System.out.println("\nThe expression used computed the sum of first two numbers and the integer quotient =  " + siq);

/* #3. Get the sum of the first two numbers and divide it by the third number,
compute for the exact quotient and display the value.
INSERT THE CODES BELOW... */
        // add the first two numbers and divide by third number and display the
        // value of exact quotient
        double seq = ((n1 + n2) / (double) (n3));
        System.out.println("\n The expression used computed the sum of first two numbers and the exact quotient: " + seq);

/* #4. Compute the average of the three numbers and display the result with 2
decimal values shown. INSERT CODE BELOW... */
        //  get the average of the three numbers and display the value with 2 decimal values
        double a= ((n1 + n2 + n3) / (double) 3);
               a = Double.parseDouble(format("%.2f",a));
        System.out.printf("\n The expression used computed the average of the three numbers with 2 decimal places = " + "%.2f",a);
        System.out.println();

/* #5. Compute the square of each number and display the results.
INSERT CODE BELOW... */
        // get the square of each number and display the value
        double sqrt1 = ( Math.sqrt(n1));
        double sqrt2 = ( Math.sqrt(n2));
        double sqrt3 = ( Math.sqrt(n3));
        System.out.println("\nThe expression used computed the square of each number:");
        System.out.println("\nThe square root of the first number = " + sqrt1);
        System.out.println("\nThe square root of the second number = " + sqrt2);
        System.out.println("\nThe square root of the third number = " + sqrt3);

    } // End of the main method
} // End of class Exercise5