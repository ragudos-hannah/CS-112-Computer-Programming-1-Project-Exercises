// The filename for the following source code must be GradeAverage.java
/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : September-13-2022
 *Activity Name and Number: Prelim Exercise Number 9
------------------------------------------------------------------------------------------------------------------------
Problem:
        Write a program that will compute the average grade of a student for a semester. The computer will then give
the message “Congratulations! You belong to the dean’s list” or the message “Sorry! You did not make it to the
dean’s list. Do Better next term.” whichever is appropriate.
        Since, the 10 grades and the corresponding number of units need not be printed as part of the required output
(i.e. they are just input values), the program may be written using only one variable for the grades and one
variable for the units. When the program is executed, the computer will ask the user to enter 10 pairs of subject
grades and units. The computer will display the average grade of the student on the 10 subjects followed by an
appropriate message. The following is a sample run of the required program.

Analysis:
Input: 10 pairs of grades and units
Processes:
          Read the grades and units
          Compute the sum of the products of grades and units
          Compute the total of the units
          Compute the average : (sum of products of grades and units)/total_units
          Show the average
          Give an appropriate message
Output: Average, Message
------------------------------------------------------------------------------------------------------------------------
Algorithm:
         1. Let grade represent a grade for a subject
         2. Let units represent number of units for a subject
         3. Let totalGrade = 0 where totalGrade represents the sum of the products of grades and corresponding units
         4. Let totalUnits = 0 where totalUnits represents the total number of units
         5. Let average represent the average grade of the student
         6. Read the first grade
         7. Read the number of units for the first grade
         8. Add the product of first grade and the corresponding units to totalGrade
         9. Add the units for the first grade to totalUnits
        10. Repeat steps 6, 7, 8 and 9 for the 2nd to the 10th grade
        11. Compute the average where average = totalGrades/totalUnits
        12. Display the average
        13. If (average >= 85) print “Congratulations! You belong to the dean's list."
        14. If (average < 85) print " Sorry! You did not make it to the dean's list. Do better next term."
------------------------------------------------------------------------------------------------------------------------
*/
// Let the program for the Grade Average begins here...
package prelim.exercises;

import java.lang.*;
import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {

        // Let a scanner keyboard be used to read the following lines of the text entered
        Scanner kbd = new Scanner(System.in);

        int grade; //variable declaration
        int units; //variable declaration

        int totalGrade = 0; //variable declaration
        int totalUnits = 0; //variable declaration

        double average; //variable declaration

        //Let the grade of the student for the first subject be entered and shown.
        System.out.print("Enter the grade of the student for the 1st subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        //Let the number of units taken by the student for the first subject be entered and shown.
        System.out.print("Enter the number of units for the 1st subject: ");
        units = Integer.parseInt(kbd.nextLine());

        // A mathematical expression is entered to compute the  total grade and total units taken by the student
        // for the first subject
        totalGrade += grade* units; // Or totalGrade + grade * units
        totalUnits = totalUnits + units;

        //Let the grade of the student for the second subject be entered and shown.
        System.out.print("Enter the grade of the student for the 2nd subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        //Let the number of units taken by the student for the second subject be entered and shown.
        System.out.print("Enter the number of units for the 2nd subject: ");
        units = Integer.parseInt(kbd.nextLine());

        // A mathematical expression is entered to compute the  total grade and total units taken by the student
        // for the second subject
        totalGrade += grade* units; // Or totalGrade + grade * units
        totalUnits = totalUnits + units;

        //Let the grade of the student for the third subject be entered and shown.
        System.out.print("Enter the grade of the student for the 3rd subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        //Let the number of units taken by the student for the third subject be entered and shown.
        System.out.print("Enter the number of units for the 3rd subject: ");
        units = Integer.parseInt(kbd.nextLine());

        // A mathematical expression is entered to compute the total grade and total units taken by the student
        // for the third subject
        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;
        totalUnits = totalUnits + units;

        //Let the grade of the student for the fourth subject be entered and shown.
        System.out.print("Enter the grade of the student for the 4th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        //Let the number of units taken by the student for the fourth subject be entered and shown.
        System.out.print("Enter the number of units for the 4th subject: ");
        units = Integer.parseInt(kbd.nextLine());

        // A mathematical expression is entered to compute the total grade and total units taken by the student
        // for the fourth subject
        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;
        totalUnits = totalUnits + units;

        //Let the grade of the student for the fifth subject be entered and shown.
        System.out.print("Enter the grade of the student for the 5th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        //Let the number of units taken by the student for the fifth subject be entered and shown.
        System.out.print("Enter the number of units for the 5th subject: ");
        units = Integer.parseInt(kbd.nextLine());

        // A mathematical expression is entered to compute the total grade and total units taken by the student
        // for the fifth subject
        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;
        totalUnits = totalUnits + units;

        //Let the grade of the student for the sixth subject be entered and shown.
        System.out.print("Enter the grade of the student for the 6th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        //Let the number of units taken by the student for the sixth  subject be entered and shown.
        System.out.print("Enter the number of units for the 6th subject: ");
        units = Integer.parseInt(kbd.nextLine());

        // A mathematical expression is entered to compute the total grade and total units taken by the student
        // for the sixth subject
        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;
        totalUnits = totalUnits + units;

        //Let the grade of the student for the seventh subject be entered and shown.
        System.out.print("Enter the grade of the student for the 7th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        //Let the number of units taken by the student for the seventh subject be entered and shown.
        System.out.print("Enter the number of units for the 7th subject: ");
        units = Integer.parseInt(kbd.nextLine());

        // A mathematical expression is entered to compute the total grade and total units taken by the student
        // for the seventh subject
        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;
        totalUnits = totalUnits + units;

        //Let the grade of the student for the eighth subject be entered and shown.
        System.out.print("Enter the grade of the student for the 8th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        //Let the number of units taken by the student for the eighth subject be entered and shown.
        System.out.print("Enter the number of units for the 8th subject: ");
        units = Integer.parseInt(kbd.nextLine());

        // A mathematical expression is entered to compute the total grade and total units taken by the student
        // for the eighth subject
        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;
        totalUnits = totalUnits + units;

        //Let the grade of the student for the ninth subject be entered and shown.
        System.out.print("Enter the grade of the student for the 9th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        //Let the number of units taken by the student for the ninth subject be entered and shown.
        System.out.print("Enter the number of units for the 9th subject: ");
        units = Integer.parseInt(kbd.nextLine());

        // A mathematical expression is entered to compute the total grade and total units taken by the student
        // for the ninth subject
        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;
        totalUnits = totalUnits + units;

        //Let the grade of the student for the tenth subject be entered and shown.
        System.out.print("Enter the grade of the student for the 10th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        //Let the number of units taken by the student for the tenth subject be entered and shown.
        System.out.print("Enter the number of units for the 10th subject: ");
        units = Integer.parseInt(kbd.nextLine());

        // A mathematical expression is entered to compute the total grade and total units taken by the student
        // for tenth subject
        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;
        totalUnits = totalUnits + units;

        // A mathematical expression is entered to compute the average of total grade and
        // total number of units taken for all the 10 subjects
        average = (double) totalGrade / totalUnits;

        // Show the output
        System.out.println();
        System.out.print("Your Average Grade = " + average);

        // A condition that states that if the student's  average computed is greater than or equal to 85,
        // then a prompt message saying that a student belongs to the dean's list will be shown
        if (average >= 85) {
            System.out.println(" Congratulations! You belong to the dean’s list.");
        }

        // A condition that states that if the student's average computed is less than 85 ,
        // then a prompt message saying that a student did not make it to the dean's list will be shown
        if (average < 85) {
            System.out.println(" Sorry! You did not make it to the dean's list. Do better next term.");
        }

        // To exit the keyboard
        kbd.close();
    }
}
