/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : October-10-2022
 *Activity Name and Number: Midterm Exercise 1B
------------------------------------------------------------------------------------------------------------------------
Problem:
      Suppose the prelim grade for a student is computed as follows:
      Given a student’s Total Quiz Score, the student’s Examination Score, the Perfect Quiz score, and the Perfect
      Examination Score, the Prelim Grade is computed by using the following formulas:
          Quiz Grade = (Total Quiz Score) / (Perfect Quiz Score) * 50 + 50.
          Exam Grade = (Examination Score) / (Perfect Examination Score) * 50 + 50.
          Prelim Grade = (Quiz Grade + Exam Grade)/2 and if the computed Prelim Grade is more than 99, the Prelim Grade
is set to 99 but if the computed Prelim Grade is less than 65, the Prelim Grade is set to 65. Develop a computer program
for the computation of a Prelim Grade based on the above formulas. The program will allow the computer to accept a
student’s Total Quiz Score, a student’s Examination Score, the Perfect Total Quiz Score and the Perfect Examination
Score. The computer will then show the corresponding grade. In addition, the remark “PASSED” will be given if the grade
is at least 75 and the remark “FAILED” will be given if the grade is less than 75.
------------------------------------------------------------------------------------------------------------------------
     Modify your completed program such that the following are enforced. Save your final program in an electronic folder
that you will eventually submit.
     (Filename: MidtermExercise1B.java)
          a) “while” statements are used instead of “do-while” statements
          b) Aside from being no greater than the perfect quiz score, the quiz score to be entered should not be a
          negative value. An appropriate message should be displayed in case the user enters a negative quiz score
          and the user should be allowed to enter a new value.
          c) Aside from being no greater than the perfect exam score, the exam score to be entered should not be a
          negative value. An appropriate message should be displayed in case the user enters a negative exam score and
          the user should be allowed to enter a new value.
          d) “if-else” statements should be used where appropriate
------------------------------------------------------------------------------------------------------------------------
Sample run 1
            Enter the Perfect Quiz Score: 100
            Enter the Perfect Examination Score: 100
            Enter a student’s quiz score: 100
            Enter a student’s examination score: 100
            Grade = 99 Remark: PASSED
------------------------------------------------------------------------------------------------------------------------
Sample run 2
            Enter the Perfect Quiz Score: 200
            Enter the Perfect Examination Score: 10
            Enter a student’s quiz score: 10
            Enter a student’s examination score: 1
            Grade = 65 Remark: FAILED
------------------------------------------------------------------------------------------------------------------------
Analysis:
         Inputs: Perfect Quiz Score, Perfect Examination Score, Student's Quiz Score, Student's Examination Score
         Processes:
             1. Read the scores
             2. Compute the grade for the quiz
             3. Compute the grade for the exam
             4. Compute the Prelim Grade
             5. Display the grades and a remark
         Outputs: Prelim Grade, Remark
------------------------------------------------------------------------------------------------------------------------
Algorithm:
             1. Let quizScore be a variable to hold the Total Quiz Score
             2. Let examScore be a variable to hold the Examination Score
             3. Let perfectQuizScore be a variable to hold the Perfect Quiz Score
             4. Let perfectExamScore a variable to hold the Perfect Exam Score
             5. Let quizGrade be a variable to hold the Quiz Grade. f. Let examGrade be a variable
                to hold the Exam Grade
             6. Let prelimGrade be a variable to hold the Prelim Grade
             7. Read the value of perfectQuizScore
             8. Read the value of perfectExamScore
             9. Read the value of quizScore
            10. Read the score for the examScore
            11. quizGrade = quizScore / perfectQuizScore * 50 + 50
            12. examGrade = examScore / perfectExamScore * 50 +50
            13. prelimGrade = (quizGrade + examGrade)/2
            14. If prelimGrade is greater than 99 then set prelimGrade to 99
            15. If prelimGrade is less than 65 then set prelimGrade to 65
            16. If prelimGrade is greater than or equal to 75 then display the grade together with the
                remark “PASSED”.
            17. If prelimGrade is less than 75 then display the grade together with the remark “FAILED” Required:
------------------------------------------------------------------------------------------------------------------------
*/

// Let the program for Midterm Exercise 1B start here


package midterm.exercises;
import java.lang.*;
import java.util.Scanner;

public class MidtermExercise1B {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int quizScore; // declare an int variable to hold total quiz score
        int examScore; // declare an int variable to hold exam score

        int perfectQuizScore; // declare an int variable to hold perfect total quiz score
        int perfectExamScore; // declare an int variable to hold perfect exam score

        double quizGrade; // 1. declare a double variable to hold quiz grade.
        double examGrade; // 2. declare a double variable to hold examination grade
        double prelimGrade; // 3. declare a double variable to hold the prelim grade
/* Accept the perfect total quiz score. The perfect score must be greater than 0. The do
while construct enables the computer to let the user re-enter a perfect score in case
the value entered is invalid. */

        // initialize perfectQuizScore
        perfectQuizScore = 0;
        while (perfectQuizScore <= 0) {
            System.out.print("Enter the Perfect Total Quiz Score: ");
            perfectQuizScore = reader.nextInt(); // 4

            if (perfectQuizScore <= 0) {
                System.out.println("Invalid value! Value must be greater than 0.");
            }
        }

/* Accept the perfect exam score. The perfect score must be greater than 0. The do while
construct enables the computer to let the user re-enter a perfect score in case the
value entered is invalid. */

        // initialize perfectExamScore
        perfectExamScore = 0;
        while (perfectExamScore <= 0) {
            System.out.print("Enter the Perfect Examination Score: ");
            perfectExamScore = reader.nextInt(); // 5

            if (perfectExamScore <= 0) {
                System.out.println("Invalid value! Value must be greater than 0.");
            }
        }

/* Accept the total quiz score. The total quiz score must not be greater than the perfect
quiz score. The do while construct enables the computer to let the user re-enter a score
in case the value entered is invalid. */

        // initialize quizScore by equating it by perfectQuizScore plus 1
        // this is just initial value to fulfill the condition of while loop
        // it will then be replaced by new value once you input a new quizScore
        quizScore = perfectQuizScore + 1;
        while (quizScore > perfectQuizScore) {
            System.out.print("Enter a student's total quiz score : ");
            quizScore = reader.nextInt(); // 6

            if (quizScore > perfectQuizScore) {
                System.out.println("Invalid value! Score must not be greater than perfect score.");
            }
        }

/* Accept the exam score. The exam score must not be greater than the perfect exam score.
The do while construct enables the computer to let the user re-enter a score in case the
value entered is invalid. */

        // initialize examScore by equating it by perfectExamScore plus 1
        // this is just initial value to fulfill the condition of while loop
        // it will then be replaced by new value once you input a new examScore
        examScore = perfectExamScore + 1;
        while (examScore > perfectExamScore) {
            System.out.print("Enter a student's examination score : ");
            examScore = reader.nextInt(); // 7

            if (examScore > perfectExamScore) {
                System.out.println("Invalid value! Score must not be greater than perfect score.");
            }
        }

// Compute the quiz grade
        quizGrade = (((double)quizScore / (double)perfectQuizScore) * 50) + 50; // 8

// Compute the exam grade
        examGrade = (((double)examScore / (double)perfectExamScore) * 50) + 50; // 9

// Compute the subject grade
        prelimGrade = (quizGrade + examGrade) / 2; // 10

// Check if prelim grade is greater than 99 then reset it to 99
        if (prelimGrade > 99) {
            prelimGrade =  99; // 11
        } else if (prelimGrade < 65) { //Check if prelim grade is less than 65 then reset it to 65
            prelimGrade = 65; // 12
        }

// Check if prelim grade is passing then display the grade together with a remark
        if (prelimGrade >= 75) { // 13
            System.out.print(prelimGrade); // 14
            System.out.println(" Remark : PASSED");
        } else if (prelimGrade < 75) { // Check if prelim grade is failing then display the grade together with a remark
            System.out.print(prelimGrade); // 15
            System.out.println(" Remark : FAILED");

        }
        System.exit(0);

    } // end of the main method
} // end of class
