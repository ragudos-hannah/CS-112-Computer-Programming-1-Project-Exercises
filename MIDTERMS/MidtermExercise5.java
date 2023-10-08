/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : October-24-2022
 *Activity Name and Number: Midterm Exercise 5
------------------------------------------------------------------------------------------------------------------------
Required:
          Write another version of the program so that the following specifications are satisfied:
        - The number of pairs of grades and units is an input value at run time. Hence, the program may be used
                to compute the average of 5 grades, 8 grades, 10 grades, etc.
         - There are validation processes for the input values. Grades must be integers from 65 to 99. The number
                of units must be at least 1 but not more than 12. If an input value is invalid, the user should be given
                a directive to enter another value and that processing will continue after the user enters a valid value.
         - The repetitive computation process is handled using an iteration construct. (while, do-while or for
                construct)
         - The computer will display a running average after every pair of grades and units is entered. The running
                average is the average of the grades entered so far.
------------------------------------------------------------------------------------------------------------------------
Analysis:
          Input: Grades, Units
          Processes:
                    1. Read/ Accept the number of subjects
                    2. Read / Accept the grade of the student for the subject
                    3. Read / Accept the number of units
                    4. Compute the average
                    5. Compute the total units as of the subject
                    6. Display message
          Output: Average. Grade
------------------------------------------------------------------------------------------------------------------------
Algorithm:
          1. Activate the variables counter, grade, units, totalGrade, totalUnits, average, and  subjects
          2. Input the amount of subjects the student took
          3. Do while loop to check the grades
          4. Input the Grades
          5. If the grades is less than 65 or more than 99, the program will repeat and force  you to input a correct value
          6. If the grades is more than 65 and less than 99, the program will continue input the Units
          7. If the units is less than 1 or more than 12, the program will repeat and force you to input a correct value
          8. If the grades is more than 1 and less than 12, the program will continue
          9. Calculate total grade with the previous total grade, if there is (+= grade * units)
         10. Add the total units with the previous units, if there is (+=units)
         11. Calculate the average of the grades (totalGrade / totalUnits)
         12. Print out average grades
         13. Loop back until amount of subjects are satisfied
         14. Exit program
------------------------------------------------------------------------------------------------------------------------
 */

// Let the program for Exercise 5 start here

package midterm.exercises;

import java.lang.*;
import java.util.Scanner;

public class MidtermExercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int grade = 0;
        int units = 0;
        int totalGrade = 0;
        int totalUnits = 0;
        double average = 0.0;
        int numberOfSubjects;
        int currentSubject;

        System.out.println("This program helps you compute for the average grade of a student.");

        //DO-WHILE LOOP statement
        do {
            System.out.println("==================================================================");
            System.out.print("Input number of subjects: ");
            numberOfSubjects = Integer.parseInt(keyboard.nextLine());

        // IF statement
            if (numberOfSubjects <= 0)
                System.out.println("Number of subjects must not be negative or equal to zero");

        // WHILE statement
        } while (numberOfSubjects <=0);

        // FOR LOOP statement
        for (currentSubject = 1; currentSubject <= numberOfSubjects; currentSubject++) {

        // DO-WHILE statement
            do {
                System.out.println();
                System.out.print("Input the grade of the student for the subject " +currentSubject + ": ");
                grade = Integer.parseInt(keyboard.nextLine());

        // IF ELSE LOOP
                if (grade < 65)
                    System.out.println("Subject grade must not be below 65.");
                else if (grade > 99)
                    System.out.println("Subject grade cannot be greater than 99");

        // WHILE statement
            } while (grade < 65 || grade > 99);

        // DO-WHILE statement
            do {
                System.out.print("Input the number of units: ");
                units = Integer.parseInt(keyboard.nextLine());
        // IF ElSE statement
                if (units < 1)
                    System.out.println("Units must be at least 1.");
                else if (units > 12)
                    System.out.println("Units cannot be more than 12.");
        //WHILE statement
            } while (units < 1 || units > 12);

        // total grade
            totalGrade += grade * units;
        // total units
            totalUnits += units;
        // computes the average
            average = (double) totalGrade / totalUnits;

        // Show message
            System.out.printf("Current Average: %.2f\n", average);
            System.out.println("Total Units as of subject " + currentSubject + ": " + totalUnits);
            System.out.println("==================================================================");

            System.exit(0);
        }
    } // end of main method
} // end of MidtermExercise5 class


