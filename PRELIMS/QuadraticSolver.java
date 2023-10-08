// The filename for the following source code must be QuadraticSolver.java
/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : September-12-2022
 *Activity Name and Number: Prelim Exercise Number 8
------------------------------------------------------------------------------------------------------------------------

 Problem:
        Write a program for determining the roots of a quadratic equation. A quadratic equation has the form
        ax2 + bx + c = 0. The numerical coefficients a, b and c should be entered at run time. The literal
        coefficient is assumed to be x (i.e. There is no need to read the literal coefficient).
Notes:
        Quadratic Formula
        first root = (-b + Math.sqrt(b*b-4*a*c))/(2*a)
        second root = (-b - Math.sqrt(b*b - 4*a*c))/(2*a)
 Sample run:
        Enter the coefficient of x squared (a): 1
        Enter the coefficient of x (b): -4
        Enter the constant (c): 4
        The roots of (1)x^2 + (-4)x + (4) = 0 are 2.00 and 2.00.

------------------------------------------------------------------------------------------------------------------------
        Analysis
        Inputs: Coefficients a, b and c
        Processes:
                  Read the coefficients
                  Compute the roots
                  Show the roots
                  Outputs: First root and second root
------------------------------------------------------------------------------------------------------------------------
        Algorithm:
        1. Let "a" represent the coefficient of x squared
        2. Let "b" represent the coefficient of x
        3. Let "c" represent in constant
        4. Let root1 represent the first root
        5. Let root2 represent the second root
        6. Show an introduction of the application/program
        7. Read the value of a
        8. Read the value of b
        9. Read the value of c
        10. Compute root1: root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a)
        11. Compute root2: root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a)
        12. Display the roots.
------------------------------------------------------------------------------------------------------------------------
        */

// Let the program starts here

package prelim.exercises;
import java.util.Scanner;
import java.lang.*;
public class QuadraticSolver {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // Declaration of variables
        double a , b , c ;
        double root1 ,root2;

        // Prints the program that determines the roots of a quadratic equation of the form ax^2 +bx +c = 0."
        System.out.println("This program determines the roots of a quadratic equation" +
                           "\nof the form ax^2 +bx +c = 0.");

        System.out.println();
        System.out.println();
        // Read the value of a and inputs the coefficient of x^2 (a)
        System.out.print("Enter the coefficient of x^2 (a): ");
        a = keyboard.nextDouble();
        System.out.println();
        System.out.println();

        // Read the value of b and inputs the coefficient of x (b)
        System.out.print("Enter the coefficient of x (b): ");
        b = keyboard.nextDouble();
        System.out.println();
        System.out.println();

        //  Read the value of c and inputs the constant (c)
        System.out.print("Enter the constant (c): ");
        c = keyboard.nextDouble();
        System.out.println();
        System.out.println();
        System.out.println() ;

        // Compute the root 1
        root1= (-b +Math.sqrt(b*b -4 *a*c))/(2*a);

        // Compute the root 2
        root2= (-b -Math.sqrt(b*b -4 *a*c))/(2*a);

        System.out.printf("%c%.0f%s%.0f%s%.0f%s%.2f%s%.2f%c%n", '(', a, ") + (", b, ") + (", c, ") = 0 are ", root1, " and ", root2, '.');

        keyboard.close();
        System.exit(0);
    }

}