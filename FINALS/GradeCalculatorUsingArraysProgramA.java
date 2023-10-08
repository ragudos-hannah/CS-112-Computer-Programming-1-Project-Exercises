/**
 Name:Ragudos, Hannah T.
 Course Code and Schedule: 9308 | MW 2:30-5:00 PM
 Date: November-14-2022
 ------------------------------------------------------------------------------------------------------------------------
 Problem:
 A program that creates a class record. The names, quiz scores, exam scores, quiz grades, exam grades and
 subject grades are stored by parallel arrays.
 ------------------------------------------------------------------------------------------------------------------------
 */

package finals.exercises;
import java.util.Scanner;

public class GradeCalculatorUsingArraysProgramA {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] quizScore; // array to hold quiz scores of students
        int[] examScore; // array to hold exam scores of students
        String[] names; // array to hold names of students
        int perfectQuizScore; // variable to hold perfect quiz score
        int perfectExamScore; // variable to hold perfect exam score
        double[] quizGrade; // array to hold quiz grades of students.
        double[] examGrade; // array to hold examination grades of students
        double[] subjectGrade; // array to hold subject grades of students
        int size;
// Accept the number of students (class size). The class size must be greater than 0.
        do {
            System.out.print("Enter the number of students: ");
            size = Integer.parseInt(keyboard.nextLine());
            if (size < 0)
                System.out.println("The number of students must be greater than 0.");
        } while (size < 0);
// Instantiate arrays, the number of cells for each array must be equal to size
        quizScore = new int[size];
        examScore = new int[size];
        names = new String[size];
        quizGrade = new double[size];
        examGrade = new double[size];
        subjectGrade = new double[size];
/* Accept the perfect quiz score: The perfect score must be greater than 0. The computer
lets the user re-enters a perfect score in case the value entered is invalid. */
        do {
            System.out.print("Enter the Perfect Quiz Score: ");
            perfectQuizScore = Integer.parseInt(keyboard.nextLine());
            if (perfectQuizScore <= 0) {
                System.out.println("Invalid value! The perfect score must be greater than 0.");
            }
        } while (perfectQuizScore <= 0);
/* Accept the perfect exam score: The perfect score must be greater than 0. The computer
lets the user re-enter a perfect score in case the value entered is invalid. */
        do {
            System.out.print("Enter the Perfect Examination Score : ");
            perfectExamScore = Integer.parseInt(keyboard.nextLine());
            if (perfectExamScore <= 0) {
                System.out.println("Invalid value! Value must be greater than 0.");
            }
        } while (perfectExamScore <= 0);
// Accept names and scores and compute the grade of each student
        for (int x = 0; x < size; x++) {
            System.out.print("Enter the name of student " + (x + 1) + ": ");
            names[x] = keyboard.nextLine();
/* Accept the quiz score of a student: The quiz score must not be greater than the
perfect quiz score. The computer lets the user re-enter a score in case the value
entered is invalid. */
            do {
                System.out.print("Enter the quiz score of " + names[x] + " : ");
                quizScore[x] = Integer.parseInt(keyboard.nextLine());
                if (quizScore[x] > perfectQuizScore) {
                    System.out.println("Invalid value! Score must not be greater than perfect " +
                            "score.");
                }
            } while (quizScore[x] > perfectQuizScore);
/* Accept the exam score: The exam score must not be greater than the perfect exam
score. The computer lets the user re-enter a score in case the value entered is
invalid. */
            do {
                System.out.print("Enter the examination score of " + names[x] + ": ");
                examScore[x] = Integer.parseInt(keyboard.nextLine());
                if (examScore[x] > perfectExamScore) {
                    System.out.println("Invalid value! Score must not be greater than perfect " +
                            "score.");
                }
            } while (examScore[x] > perfectExamScore);
            quizGrade[x] = (double) quizScore[x] / perfectQuizScore * 50 + 50;
            examGrade[x] = (double) examScore[x] / perfectExamScore * 50 + 50;
            subjectGrade[x] = (quizGrade[x] + examGrade[x]) / 2;
// Check if subject grade is 100 then reset it to 99
            if (subjectGrade[x] > 99)
                subjectGrade[x] = 99;
// Check if subject grade is lesst than 65 then reset it to 65
            if (subjectGrade[x] < 65)
                subjectGrade[x] = 65;
        } // end of for
// Display the scores and grades of students
        System.out.println("\n\nPerfect Quiz Score = " + perfectQuizScore);
        System.out.println("\nPerfect Exam Score = " + perfectExamScore);
        System.out.printf("%10s%10s%10s%10s%10s%10s\n", "", "Quiz", "Exam", "Quiz", "Exam", "");
        System.out.printf("%10s%10s%10s%10s%10s%10s\n", "name", "Score", "Score", "Grade",
                "Grade", "Grade");
        System.out.printf("%10s%10s%10s%10s%10s%10s\n", "--------", "--------", "--------",
                "-------", "--------", "--------");
        for (int y = 0; y < subjectGrade.length; y++) {
            System.out.printf("%10s%10d%10d%10.0f%10.0f%10.0f\n", names[y], quizScore[y],
                    examScore[y], quizGrade[y], examGrade[y], subjectGrade[y]);
        }
        System.out.printf("%10s%10s%10s%10s%10s%10s\n", "--------", "--------", "--------",
                "-------", "--------", "--------");
// Compute and show the average of the subject grades
// get the total of all the subject grades
        double totalGrade = 0; // variable to hold the sum of grades
        for (int g = 0; g < subjectGrade.length; g++) {
            totalGrade += subjectGrade[g];
        }
        double averageGrade = totalGrade / subjectGrade.length;
        System.out.printf("%n%25s%5.2f%n", "Average Grade =", averageGrade);
// determine and show the lowest subject grade
        double lowestGrade = subjectGrade[0]; // first grade is the lowest grade initially
        for (int gr = 1; gr < subjectGrade.length; gr++) {
            if (lowestGrade > subjectGrade[gr])
                lowestGrade = subjectGrade[gr];
        }
        // determine and show the highest subject grade
        double highestGrade = subjectGrade[0]; // first grade is the highest grade initially
        for (int h = 1; h < subjectGrade.length; h++) {
            if (highestGrade < subjectGrade[h])
                highestGrade = subjectGrade[h];
        }
        System.out.printf("%n%25s%5.2f%n", "Highest Grade =", highestGrade);
        System.exit(0);
    } // end of the main method
} // end of class