/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : October-12-2022
 *Activity Name and Number: Midterm Exercise 2B
------------------------------------------------------------------------------------------------------------------------
Grading Program Problem:
      The numeric prelim grade of a student for a subject is computed by the expression
                       ((student's grade for the quizzes) + (student's grade for the examination)) / 2
      The grade for the quizzes is computed by the expression
                       (student's total quiz scores) / (perfect total quiz score) * 50 + 50
      The grade for the examination is computed by the expression
                       (student's examination score) / (perfect examination score) * 50 + 50
A corresponding letter grade is given to the student based on the following rules.
       If NUMERIC GRADE is                         then LETTER GRADE is
       ===================                       =========================
         >= 50 but < 75                                      D
         >= 75 but < 80                                      C
         >= 80 but < 90                                      B
         >= 90 but <= 100                                    A
------------------------------------------------------------------------------------------------------------------------
Activities:
           1. Based on the following algorithm for the above programming problem, provide the statements or expressions
              that should replace the blank lines in the incomplete program given below. The statements or expressions
              should be based on the given parts of the program. (You should not add any statement or expression aside
              from those that should replace the blank lines.) One blank line corresponds to one statement or one
              expression. (Filename: MidtermExercise2A.java)
           2. Modify the program so that if-else statements are used where appropriate. (Filename: MidtermExercise2B.java)

------------------------------------------------------------------------------------------------------------------------
Algorithm:
           1. Declare and initialize the variable perfectTotalQuizScore that represents the perfect total quiz score.
           2. Declare and initialize the variable totalQuizScore that represents the total quiz score of a student.
           3. Declare and initialize the variable perfectExamScore that represents the perfects core for the examination.
           4. Declare and initialize the variable examScore that represents the examination score of a student.
           5. Declare and initialize the variable quizGrade that represents the grade of a student for
              his/her quiz scores.
           6. Declare and initialize the variable examGrade that represents the grade of a student for
              his/her examination score.
           7. Declare and initialize the variable numericGrade that represents the numeric prelim grade of a student.
           8. Declare and initialize the variable letterGrade that represents the letter prelim grade of a student.
           9. Declare and initialize the variable studentName that represents the name of a student.
          10. Display a message that explains that the running program is a utility for computing the prelim grade
              of a student.
          11. Read the name of a student
          12. Read the perfect total quiz score from the keyboard. The perfect total quiz score read must be validated
              such that it cannot be less than or equal to zero. If the user enters an invalid perfect total quiz score,
              an appropriate error message should be displayed on the screen and the program execution should end.
          13. Read the total quiz score of the student. The total quiz score read must be validated such that it should
              not be greater than the perfect total quiz score or it must not be less than zero. If the user enters
              an invalid total quiz score, an appropriate error message should be displayed on the screen and the
              program execution should end.
          14.Read the perfect score for the examination from the keyboard. The perfect score read must be validated such
             that it cannot be less than or equal to zero. If the user enters an invalid perfect score, an appropriate
             error message should be displayed on the screen and the program execution should end.
          15. Read the examination score of the student. The score read must be validated such that the score should
              not be greater than the perfect score or the score must not be less than zero. If the user enters an
              invalid perfect score, an appropriate error message should be displayed on the screen and the program
              execution should end.
          16. Compute grade of the student for the quizzes through the formula:
               quizGrade = (totalQuizScore / perfectQuizScore) * 50 + 50
          17. Compute grade of the student for the examination through the formula:
               examGrade = (examScore / perfectExamScore) * 50 +50
          18. Compute numerical prelim grade of the student through the formula:
               numericGrade = (quizGrade + examGrade) / 2
          19. Determine the letter grade of the student as follows
               if (numericGrade >=50 && numericGrade <75), let letterGrade= 'D'.
               if (numericGrade >=75 && numericGrade <80), let letterGrade= 'C'.
               if (numericGrade >=80 && numericGrade <90), let letterGrade= 'B'.
               if (numericGrade >=90 && numericGrade <=100), let letterGrade= 'A'.
          20. Display a summary of the result of the computation
------------------------------------------------------------------------------------------------------------------------
*/

// Let the program for Midterm Exercise 2A start here

package midterm.exercises;

import java.util.Scanner;
import java.lang.*;

public class MidtermExercise2A {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        int perfectTotalQuizScore = 0, totalQuizScore = 0, examScore = 0, perfectExamScore = 0;
        double quizGrade = 0, examGrade = 0, numericGrade = 0;
        char letterGrade = 'I';
        String studentName = "";

        System.out.println("This program helps you compute the prelim grade of a  student.");
        System.out.println();
        System.out.print("Enter the name of the student: ");
        studentName = (kbd.nextLine()); // 1
        System.out.print("Enter the perfect total quiz score: ");
        perfectTotalQuizScore = Integer.parseInt(kbd.nextLine()); // 2

        if (perfectTotalQuizScore <= 0) {
            System.out.println("Invalid perfect score! The perfect score should be " + "greater than zero");
            System.out.println("Sorry! The program needs to close. Run the program " +
                    "again and enter correct values.");
            System.exit(0);
        }

        System.out.print("Enter the total quiz score of " + studentName + ":");
        totalQuizScore = Integer.parseInt(kbd.nextLine());
        if (totalQuizScore < 0 || totalQuizScore > perfectTotalQuizScore) {
            System.out.println("Invalid score. The score should not exceed the perfect score "
                    + perfectTotalQuizScore + " and it should not be less than  0.");
            System.out.println("Sorry! The program needs to close. Run the program again and " + "enter correct values.");
            System.exit(0);
        }

        System.out.print("Enter the perfect examination score: ");
        perfectExamScore = Integer.parseInt(kbd.nextLine()); // 3
        if (perfectExamScore <= 0) { //4
            System.out.println("Invalid perfect score! The perfect score should be greater " + "than zero");
            System.out.println("Sorry! The program needs to close. Run the program gain and "
                    + "enter correct values.");
            System.exit(0);

        }
        System.out.print("Enter the examination score of " + studentName + ":");
        examScore = Integer.parseInt(kbd.nextLine());
        if (examScore < 0 || examScore > perfectExamScore) {
            System.out.println("Invalid score. The exam score should not exceed the perfect " + "score "
                    + perfectExamScore + " and it should not be less than 0.");
            System.out.println("Sorry! The program needs to close. Run the program  again " + "and enter correct values.");
            System.exit(0);

        }

        quizGrade = (double) totalQuizScore / perfectTotalQuizScore * 50 + 50;
        examGrade = (double) examScore / perfectExamScore * 50 + 50;
        numericGrade = (quizGrade + examGrade) / 2;

        if (numericGrade >= 50 && numericGrade < 75) {
            letterGrade = 'D';
        }
        if (numericGrade >=75 && numericGrade <80) { // 8
            letterGrade = 'C';
        }
        if (numericGrade >=80 && numericGrade <90) { // 9
            letterGrade = 'B';
        }
        if (numericGrade >= 90 && numericGrade <= 100) {
            letterGrade = 'A';
        }

        System.out.println();
        System.out.printf("%-30s%20s%n", "Name of Student", studentName);
        System.out.printf("%-30s%20d%n", "Total Quiz Score = ", totalQuizScore);
        System.out.printf("%-30s%20d%n", "Perfect Total Quiz Score = ", perfectTotalQuizScore);
        System.out.printf("%-30s%20.0f%n", "Grade for the Quizzes = ", quizGrade);
        System.out.printf("%-30s%20d%n", "Examination Score = ", examScore);
        System.out.printf("%-30s%20d%n", "Perfect Examination Score = ", perfectExamScore);
        System.out.printf("%-30s%20.0f%n", "Grade for the Exam = ", examGrade);
        System.out.println();
        System.out.printf("%-30s%20.0f%n", "Numeric Grade = ", numericGrade);
        System.out.printf("%-30s%20c%n", "Letter Grade = ", letterGrade);

        System.exit(0);
    } // end of main method
} // end of class

