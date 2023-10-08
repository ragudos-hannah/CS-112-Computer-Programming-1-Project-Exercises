/**
 Name: Ragudos, Hannah T.
 Class Code: 9308
 Activity: Final Programming Project
 Honor Code: This program was created by Hannah Ragudos in partial fulfilment of the requirements
             in CS 112 (Computer Programming 1).
 Copyrights: All Right Reserved 2022
 */

package finals.exercises;

import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

// This part was created on Nov. 10, 2022 by Hannah Ragudos
public class RagudosHannahProgramming1Project extends javax.swing.JFrame {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int myChoice = 0;
        showIntroduction();
        kbd.nextLine();
// This part was edited on Nov. 14, 2022 by Hannah Ragudos
        do {
            showMainMenu();
            myChoice = enterChoice(1, 4);
            switch (myChoice) {
                case 1:
                    mathSolver();
                    break;
                case 2:
                    recordKeeping();
                    break;
                case 3:
                    miscellaneousProcesses();
                    break;
                case 4:
                    System.out.println("Thank you for using my program.");
                    System.out.println("Enjoy the rest of your day!");
            } //end switch
        } while (myChoice != 4);
    } //end main method

//--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 10, 2022 by Hannah Ragudos
// This part was edited on Dec. 8, 2022  by Hannah Ragudos
    public static void showIntroduction() {
        String introduction = """
                       
                       
                              College of Information and Computing Sciences
                                                     Saint Louis University
                                                           Baguio City
                ----------------------------------------------------------------------------------------------
                                                    Hannah T. Ragudos       
                                                         Programmer
                """;
        System.out.println();
        JOptionPane.showMessageDialog(null, introduction);
        JOptionPane.showMessageDialog(null, "Click ok to see Main Menu.\nPlease refer to the console.");


        System.out.println("|-----------------------------------------------|");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|                                               |");
        System.out.println("| College of Information and Computing Sciences |");
        System.out.println("|            Saint Louis University             |");
        System.out.println("|                  Baguio City                  |");
        System.out.println("|                                               |");
        System.out.println("|                                               |");
        System.out.println("|                 Hannah Ragudos                |");
        System.out.println("|                   Programmer                  |");
        System.out.println("|                                               |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|-----------------------------------------------|");
        System.out.println("\n");
        System.out.println(" Please press any key and enter to proceed...");

    }
    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 11, 2022 by Hannah Ragudos
    public static void showMainMenu() {
        System.out.println("_______________________________________________");
        System.out.println(" [Main Menu] ");
        System.out.println("_______________________________________________");
        System.out.println("Choose a routine you desire: ");
        System.out.println();
        System.out.println("1. Math Routines");
        System.out.println("2. Recording Routines");
        System.out.println("3. Miscellaneous Routines");
        System.out.println("4. Exit");
        System.out.println("--------------------------------------------");
        System.out.println();
    }

    //--------------------------------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 11, 2022 by Hannah Ragudos
    public static void showMenu1() {
        System.out.println("_______________________________________________");
        System.out.println(" [1. Math Routine Submenu] ");
        System.out.println("_______________________________________________");
        System.out.println("Choose a Math Routine: ");
        System.out.println();
        System.out.println("1. Determine whether an integer is odd or even");
        System.out.println("2. Determine sum of a series");
        System.out.println("3. Determine the factors of a number");
        System.out.println("4. Determine if a number is prime");
        System.out.println("5. Determine the area of a circle");
        System.out.println("6. Determine the area of a square");
        System.out.println("7. Determine the area of a triangle");
        System.out.println("8. Determine the area of a rectangle");
        System.out.println("9. Determine the area of a trapezoid");
        System.out.println("10. Determine the area of a parallelogram");
        System.out.println("11. Determine if an integer is a perfect number");
        System.out.println("12. Generate a multiplication table");
        System.out.println("13. Determine the roots of a quadratic equation");
        System.out.println("14. Generate a Fibonacci Sequence");
        System.out.println("15. Generate a Pascal's Triangle");
        System.out.println("16. Back to Main Menu");
        System.out.println();
        System.out.println("_______________________________________________");
    }

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 11, 2022 by Hannah Ragudos
    public static void showMenu2() {

        System.out.println("-------------------------------------------------------------------------");
        System.out.println(" [2. Recording Routine Submenu] ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Choose a Recording Routine: ");
        System.out.println();
        System.out.println("1. Accept and sort list of students");
        System.out.println("2. Accept and sort list of Salesmen");
        System.out.println("3. Accept pairs of names and grades and sort list according to name");
        System.out.println("4. Accept pairs of names and grades and sort list according to " + "grade");
        System.out.println("5. Back to Main Menu");
        System.out.println();
        System.out.println("_________________________________________________________________________");
    }

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 11, 2022 by Hannah Ragudos
// This part was edited on Nov. 15, 2022 by Hannah Ragudos
    public static void showMenu3() {
        System.out.println("-----------------------------------------------");
        System.out.println(" [3. Miscellaneous Routine Submenu] ");
        System.out.println("-----------------------------------------------");
        System.out.println("Choose a Miscellaneous Routine: ");
        System.out.println();
        System.out.println("1. Number Guessing Game");
        System.out.println("2. Bills distribution of an amount of Money");
        System.out.println("3. Interest of Money Invested ");
        System.out.println("4. Income Tax Computation");
        System.out.println("5. Insect Population Growth Rate");
        System.out.println("6. Water Bill computation.");
        System.out.println("7. Electric Bill computation.");
        System.out.println("8. Mobile Phone Load Balance Computation.");
        System.out.println("9. Semester Grade Computation");
        System.out.println("10. A(H1N1) Self-Diagnostic Procedure ");
        System.out.println("11. Back to Main Menu");
        System.out.println();
        System.out.println("------------------------------------------------");
    }

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 11, 2022 by Hannah Ragudos
    public static int enterChoice(int min, int max) { // enterChoice method
        Scanner kbd = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Input the number corresponding to your choice: ");
            choice = kbd.nextInt();
            if (choice < min || choice > max)
                System.out.println("Invalid choice. Please ensure that you enter a number from " + min + " to " + max + ".");
        } while (choice < min || choice > max);
        return (choice);
    } // end of enterChoice method

//--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 14, 2022 by Hannah Ragudos
// This part was edited on Nov. 16, 2022 by Hannah Ragudos

    //==========================-- MATH ROUTINE METHODS--==========================//
    public static void mathSolver() {
        Scanner kbd = new Scanner(System.in);
        int choice;
        do {
            showMenu1();
            choice = enterChoice(1, 16);
            switch (choice) {
                case 1:
                    detOddOrEven();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 2:
                    detSumOfSeries();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 3:
                    detFactorsOfANumber();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    break;
                case 4:
                    detPrimeNumber();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 5:
                    detCircleArea();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 6:
                    detSquareArea();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 7:
                    detTriangleArea();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 8:
                    detRectangleArea();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    break;
                case 9:
                    detTrapezoidArea();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    // TO DO
                    break;
                case 10:
                    detParallelogramArea();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 11:
                    detPerfectNumber();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 12:
                    multiplicationTableGenerator();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 13:
                    rootsOfQuadraticEquation();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 14:
                    fibonacciSequenceGenerator();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 15:
                    pascalTriangleGenerator();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 16:
                    showMenu1();
            } // end of cases
        } while (choice != 16);
    } // end of mathSolver method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 16, 2022 by Hannah Ragudos
    public static String detOddEven(int number) { // detOddEven method
        if (number % 2 != 0)
            return (" The number is odd ");
        else
            return (" The number is even ");
    } // end of detOddEven method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 16, 2022 by Hannah Ragudos
    public static double getSumOfSeries(int n) { // getSumOfSeries method
        double sum = 0;
        if (n > 1 && n % 2 == 0) {
            for (int ctr = n; ctr > 1; ctr -= 2)
                sum += (1.0 / ctr);
        }
        return (sum);
    } // end of getSumOfSeries method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 17, 2022 by Hannah Ragudos
    public static void detOddOrEven() { // oddOrEven method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.println("======================== -1. ODD OR EVEN- ========================");
        System.out.println();
        System.out.println("This math routine determines if the given number\nis odd or even.");
        System.out.println();
        int y;
        System.out.print("Enter an integer: ");
        y = kbd.nextInt();
        System.out.println();
        System.out.println("============================= RESULTS ============================");
        System.out.println();
        System.out.println(detOddEven(y));
    } // end of oddOrEven method

    //--------------------------------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 18, 2022 by Hannah Ragudos
    public static void detSumOfSeries() { // sumOfSeries method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.println("======================== -2. SUM OF A SERIES- ========================");
        System.out.println();
        System.out.println("This math routine determines the sum of a series.");
        System.out.println();
        int z;
        System.out.print("Enter an integer: ");
        z = kbd.nextInt();
        System.out.println();
        System.out.println("=============================== RESULTS ==============================");
        System.out.println();
        System.out.println("The sum of the series is " + getSumOfSeries(z));
        System.out.println();
    } // end of sumOfSeries method

    //--------------------------------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 19, 2022 by Hannah Ragudos
// This part was created on Nov. 21, 2022 by Hannah Ragudos
    public static void detFactorsOfANumber() { // factorsOfANumber method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.println("======================== -3. FACTORS OF A NUMBER- ========================");
        System.out.println();
        System.out.println("This math routine determines the sum of a series.");
        System.out.println();
        System.out.print("Enter the value of the number you wish to find its factors: ");
        int num = kbd.nextInt();
        System.out.println();
        System.out.println("=============================== RESULTS ==================================");
        System.out.println();
        System.out.print("The factors of " + num + " is/are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    } // end of factorsOfANumber method

    //--------------------------------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 20, 2022 by Hannah Ragudos
// This part was created on Nov. 22, 2022 by Hannah Ragudos
    public static void detPrimeNumber() { // primeNumberDeterminer method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.println("======================== -4. PRIME NUMBER DETERMINER- ========================");
        System.out.println();
        System.out.println("This math routine determines the number if it is prime or not.");
        System.out.println();
        System.out.print("Enter the number you wish to determine if it is prime or not: ");
        int numPrimeOrNot = kbd.nextInt();
        boolean trueOrFalse = false;
        for (int i = 2; i <= numPrimeOrNot / 2; ++i) {
            if (numPrimeOrNot % i == 0) {
                trueOrFalse = true;
                break;
            }
        }
        System.out.println();
        System.out.println("=================================== RESULTS ==================================");
        System.out.println();
        if (!trueOrFalse)
            System.out.println(numPrimeOrNot + " is a prime number.");
        else
            System.out.println(numPrimeOrNot + " is not a prime number.");
        System.out.println();
    } // end of primeNumberDeterminer method

    //--------------------------------------------------------------------------------------------------------------------//
// --------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 25, 2022 by Hannah Ragudos
    public static void detCircleArea() { // circleAreaSolver method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.print("======================== -5. CIRCLE AREA SOLVER- ========================");
        System.out.println();
        System.out.println("This math routine determines the area of a circle.");
        System.out.println();
        double radius;
        double areaCircle;
        System.out.print("Enter the value of radius: ");
        radius = Double.parseDouble(kbd.nextLine());
        areaCircle = Math.PI * (radius * radius);
        String strAreaCircle = String.format("%.2f", areaCircle);
        System.out.println();
        System.out.println();
        System.out.println("================================= RESULTS ==============================");
        System.out.println();
        System.out.println("Radius of circle = " + radius);
        System.out.println("Area of circle = " + strAreaCircle);
    } // end of circleAreaSolver method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 25, 2022 by Hannah Ragudos
    public static void detSquareArea() { // squareAreaSolver method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.print("======================== -6. SQUARE AREA SOLVER- ========================");
        System.out.println();
        System.out.println("This math routine determines the area of a square.");
        System.out.println();
        System.out.print("Enter the measure of the side of the square: ");
        double side = Double.parseDouble(kbd.nextLine());
        double areaSquare = side * side;
        String strAreaSquare = String.format("%.2f", areaSquare);
        System.out.println();
        System.out.println();
        System.out.println("================================ RESULTS ==============================");
        System.out.println();
        System.out.println("Length of each side of the Square = " + side);
        System.out.println("Area of the Square = " + strAreaSquare);
    } // end of squareAreaSolver method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 25, 2022 by Hannah Ragudos
    public static void detTriangleArea() { // triangleAreaSolver method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.print("======================== -7. TRIANGLE AREA SOLVER- ========================");
        System.out.println();
        System.out.println("This math routine determines the area of a triangle.");
        System.out.println();
        System.out.print("Enter the base of the triangle: ");
        double base = Double.parseDouble(kbd.nextLine());
        System.out.print("Enter the height of the triangle: ");
        double height = Double.parseDouble(kbd.nextLine());
        double areaTriangle = (base * height) / 2;
        String strAreaTriangle = String.format("%.2f", areaTriangle);
        System.out.println();
        System.out.println();
        System.out.println("================================== RESULTS ===============================");
        System.out.println();
        System.out.println("Base of the Right Triangle = " + base);
        System.out.println("Height of the Right Triangle = " + height);
        System.out.println("Area of the Right Triangle = " + strAreaTriangle);
    } // end triangleAreaSolver method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 26, 2022 by Hannah Ragudos
    public static void detRectangleArea() { // rectangleAreaSolver method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.println("======================== -8. RECTANGLE AREA SOLVER- ========================");
        System.out.println();
        System.out.println("This math routine determines the area of a rectangle.");
        System.out.println();
        System.out.print("Enter the length of the rectangle: ");
        double length = Double.parseDouble(kbd.nextLine());
        System.out.print("Enter the width of the rectangle: ");
        double width = Double.parseDouble(kbd.nextLine());
        double areaRectangle = length * width;
        String strAreaRectangle = String.format("%.2f", areaRectangle);
        System.out.println();
        System.out.println();
        System.out.println("=================================== RESULTS ================================");
        System.out.println();
        System.out.println("Length of the Rectangle = " + length);
        System.out.println("Width of the Rectangle = " + width);
        System.out.println("Area of the Rectangle = " + strAreaRectangle);
    } // end of rectangleAreaSolver method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 26, 2022 by Hannah Ragudos
    public static void detTrapezoidArea() { // trapezoidAreaSolver method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.println("======================== -9. TRAPEZOID AREA SOLVER- ========================");
        System.out.println();
        System.out.println("This math routine determines the area of a trapezoid.");
        System.out.println();
        System.out.print("Enter the Base 1 of the trapezoid: ");
        double base1 = Double.parseDouble(kbd.nextLine());
        System.out.print("Enter the Base 2 of the trapezoid: ");
        double base2 = Double.parseDouble(kbd.nextLine());
        System.out.print("Enter the Height of the trapezoid: ");
        double heightTrapezoid = Double.parseDouble(kbd.nextLine());
        double areaTrapezoid = ((base1 + base2) / 2.0) * heightTrapezoid;
        String strAreaTrapezoid = String.format("%.2f", areaTrapezoid);
        System.out.println();
        System.out.println("===================================== RESULTS ==============================");
        System.out.println();
        System.out.println("Base 1 of the Trapezoid = " + base1);
        System.out.println("Base 2 of the Trapezoid = " + base2);
        System.out.println("Height of the Trapezoid = " + heightTrapezoid);
        System.out.println("Area of the Trapezoid = " + strAreaTrapezoid);
    } // end of trapezoidAreaSolver method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 26, 2022 by Hannah Ragudos
    public static void detParallelogramArea() { // parallelogramAreaSolver method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.println("======================== -10. PARALLELOGRAM AREA SOLVER- ========================");
        System.out.println();
        System.out.println("This math routine determines the area of a parallelogram.");
        System.out.println();
        System.out.print("Enter the base of the parallelogram: ");
        double baseParallelogram = Double.parseDouble(kbd.nextLine());
        System.out.print("Enter the height of the parallelogram: ");
        double heightParallelogram = Double.parseDouble(kbd.nextLine());
        double areaParallelogram = baseParallelogram * heightParallelogram;
        String strAreaParallelogram = String.format("%.2f", areaParallelogram);
        System.out.println();
        System.out.println("===================================== RESULTS ===================================");
        System.out.println();
        System.out.println("Base 1 of the Parallelogram = " + baseParallelogram);
        System.out.println("Height of the Parallelogram = " +
                heightParallelogram);
        System.out.println("Area of the Parallelogram = " +
                strAreaParallelogram);
    } // end of parallelogramAreaSolver method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 27, 2022 by Hannah Ragudos
// This part was edited on Dec. 1, 2022 by Hannah Ragudos
    public static void detPerfectNumber() { // perfectNumber method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.println("======================== -11. PERFECT NUMBER- ========================");
        System.out.println();
        System.out.println("This math routine determines the number is perfect. Meaning, if the\n" +
                "sum of its divisors is equal to the number chosen.");
        System.out.println();
        System.out.println("Example:");
        System.out.println("The divisors of 6 is 1, 2, and 3");
        System.out.println("6 = 1 + 2 + 3");
        System.out.println();
        int numPerfectOrNot;
        int sum = 0;
        System.out.println("Enter the number you want to determine if it is a perfect number or not: ");
        numPerfectOrNot = kbd.nextInt();
        for (int i = 1; i < numPerfectOrNot; i++) {
            if (numPerfectOrNot % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("================================ RESULTS ==============================");
        System.out.println();
        if (sum == numPerfectOrNot) {
            System.out.println(numPerfectOrNot + " is a Perfect Number");
        } else {
            System.out.println(numPerfectOrNot + " is NOT a Perfect Number");
        }
    } // end of perfectNumber method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 29, 2022 by Hannah Ragudos
    public static void multiplicationTableGenerator() { //multiplicationTableGenerator method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.println("============================= -12. MULTIPLICATION TABLE GENERATOR ============================");
        System.out.println();
        System.out.println("""
                This math routine generates a multiplication table. Just enter the multiplicand and
                multiplier desired and it will generate all the possible values of multiplicand from 1 to
                the desired multiplicand.""");
        System.out.println();
        System.out.print("Enter the multiplicand: ");
        int multiplicand = kbd.nextInt();
        System.out.print("Enter the multiplier: ");
        int multiplier = kbd.nextInt();
        System.out.println();
        System.out.println("========== Multiplication Table of " + multiplicand + " from 1 to " + multiplier + " ==========");
        System.out.println();
        for (int i = 1; i <= multiplier; i++) {
            System.out.println(multiplicand + " * " + i + " = " + multiplicand *
                    i);
        }
    } // end of multiplicationTableGenerator method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 29, 2022 by Hannah Ragudos
// This part was edited on Dec 1, 2022 by Hannah Ragudos
    public static void rootsOfQuadraticEquation() { // rootsOfQuadraticEquationmethod
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.println("======================== -13. ROOTS OF QUADRATIC EQUATION- ========================");
        System.out.println();
        System.out.println("This math routine determines the roots of a quadratic equation.");
        System.out.println();
        double a, b, c, root1, root2;
        String r1 = "", r2 = "";
        System.out.println("This program helps you solve for the roots of a Quadratic Equation.");
        System.out.println("You should enter the coefficients of the quadratic equation");
        System.out.print("Enter a: ");
        a = Double.parseDouble(kbd.nextLine());
        System.out.print("Enter b: ");
        b = Double.parseDouble(kbd.nextLine());
        System.out.print("Enter c: ");
        c = Double.parseDouble(kbd.nextLine());
        System.out.println();
        System.out.println("====================================== RESULTS ====================================");
        System.out.println();
        if (b * b - 4 * a * c >= 0) {
            root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("The roots are: " + root1 + " and " + root2 + ".");
        } else {
            r1 += -b / (2 * a) + " - (square root of (" + (-1) * (b * b - 4 * a * c) + ") * i) / " + (2 * a);
            r2 += -b / (2 * a) + " - (square root of (" + (-1) * (b * b - 4 * a * c) + ") * i) / " + (2 * a);
            System.out.println("The imaginary roots are: " + r1 + " and " + r2 + ".");
        }
    } // end of rootsOfQuadraticEquation method

//--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 29, 2022 by Hannah Ragudos

    public static void fibonacciSequenceGenerator() { // fibonacciSequenceGenerator method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.println("======================== -14. FIBONACCI SEQUENCE GENERATOR- ========================");
        System.out.println();
        System.out.println("This math routine generated a fibonacci sequence according to desired terms.");
        System.out.println();
        System.out.println();
        System.out.println("======================================= RESULTS ====================================");
        System.out.println();
        int t;
        System.out.print("\nHow many terms do you want? ");
        t = kbd.nextInt();
        generateFibonacciSequence(t);
    } // end of fibonacciSequenceGenerator method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 29, 2022 by Hannah Ragudos
    public static void generateFibonacciSequence(int nTerms) { //generateFibonacciSequence method
        int first = 1, second = 1;
        int temp;
        int count = nTerms;
        System.out.print("Terms: ");
        if (nTerms == 1)
            System.out.println(first);
        if (nTerms == 2)
            System.out.println(first + " , " + second);
        if (nTerms > 2) {
            System.out.print(first + " , " + second);
            count = count - 2; // remaining terms to print
            while (count > 0) {
                temp = first;
                first = second;
                second = temp + second;
                System.out.print(" , " + second);
                count--;
            } // end of while
            System.out.println();
        } // end of if nTerms > 2
    } // end of generateFibonacciSequence method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 29, 2022 by Hannah Ragudos
    public static void pascalTriangleGenerator() { // pascalTriangleGenerator method
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.println("======================== -15. PASCAL'S TRIANGLE GENERATOR- ========================");
        System.out.println();
        System.out.println("This math routine generates a Pascal's Triangle according to the desired rows.");
        System.out.println();
        int row, j, spaces, start;
        System.out.println();
        System.out.println("====================================== RESULTS ====================================");
        System.out.println();
        System.out.print("Enter your desired rows: ");
        row = kbd.nextInt();
        for (int i = 0; i < row; i++) {
            for (spaces = row; spaces > i; spaces--) {
                System.out.print(" ");
            }
            start = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = start * (i - j) / (j + 1);
            }
            System.out.print("\n");
        }
    } // end of pascalTriangleGenerator method

//--------------------------------------------------------------------------------------------------------------------//
//=====================-- END OF MATH ROUTINE METHODS--=======================
//--------------------------------------------------------------------------------------------------------------------//

    // This part was created on Nov. 14, 2022 by Hannah Ragudos
// This part was created on Nov. 30, 2022 by Hannah Ragudos
// =======================-- RECORDING ROUTINE METHODS--========================
    public static void recordKeeping() {
        Scanner kbd = new Scanner(System.in);
        int choice;
        do {
            showMenu2();
            choice = enterChoice(1, 5);
            switch (choice) {
                case 1:
                    acceptAndSortNames();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 2:
                    acceptAndSortSalesmen();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    // TO DO
                    break;
                case 3:
                    acceptAndSortNamesAndGradeByName();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    // TO DO
                    break;
                case 4:
                    acceptAndSortNamesAndGradeByGrade();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    // TO DO
                    break;
                case 5:
                    showMenu1();
                    // TO DO
                    break;
            } // end of cases
        } while (choice != 5);
    } // end of recordKeeping method

    //--------------------------------------------------------------------------------------------------------------------//
// --------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 30, 2022 by Hannah Ragudos
    public static void acceptAndSortNames() { // acceptAndSortNames method
        System.out.println("======================== -1. Student Name Sorter- ========================");
        System.out.println();
        System.out.println("This recording routine sorts the names of the students alphabetically");
        System.out.println();
        Scanner kbd = new Scanner(System.in);
        String[] names;
        int n = 0;
        System.out.print("Enter the number of students: ");
        n = Integer.parseInt(kbd.nextLine());
        names = new String[n];
        // Populate array names
        for (int z = 0; z < names.length; z++) {
            System.out.print("Enter name of student " + (z + 1) + ": ");
            names[z] = kbd.nextLine();
        }
        System.out.println();
        System.out.println("================ Names of Students in Alphabetical Order =================");
        System.out.println();
        balloonSortArray2(names);
        for (int z = 0; z < names.length; z++) {
            System.out.println((z + 1) + ": " + names[z]);
        }
    } // end of acceptAndSortNames method

    //--------------------------------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 30, 2022 by Hannah Ragudos
    public static void acceptAndSortSalesmen() { // acceptAndSortSalesmen method
        System.out.println();
        System.out.println("======================== -2. Salesmen Sorter- ========================");
        System.out.println();
        System.out.println("This recording  routine sorts the names of the salesmen alphabetically.");
        System.out.println();
        Scanner kbd = new Scanner(System.in);
        String[] names;
        int n = 0;
        System.out.print("Enter the number of salesmen: ");
        n = Integer.parseInt(kbd.nextLine());
        names = new String[n];
        for (int z = 0; z < names.length; z++) {
            System.out.print("Enter name of salesman " + (z + 1) + ": ");
            names[z] = kbd.nextLine();
        }
        System.out.println();
        System.out.println("============= Names of Salesmen in Alphabetical Order ================");
        System.out.println();
        balloonSortArray2(names);
        for (int z = 0; z < names.length; z++) {
            System.out.println((z + 1) + ": " + names[z]);
        }
    } // end of acceptAndSortSalesmen method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 30, 2022 by Hannah Ragudos
// This part was edited on Dec. 2, 2022 by Hannah Ragudos
    public static void acceptAndSortNamesAndGradeByName() { //acceptAndSortNamesAndGradeByName method
        System.out.println();
        System.out.println("======================== -3. Name and Grade Sorter by Name- ========================");
        System.out.println();
        System.out.println("This recording  routine accepts and sorts the names and grades of the students according to\n" + "name.");
        System.out.println();
        Scanner kbd = new Scanner(System.in);
        int i;
        System.out.print("Enter the number of students: ");
        i = Integer.parseInt(kbd.nextLine());
        String[] names = new String[i];
        int[] grades = new int[i];
        System.out.println();
        for (int z = 0; z < i; z++) {
            System.out.print("Enter name of student " + (z + 1) + ": ");
            names[z] = kbd.nextLine();
            System.out.print("Enter the grade of " + (names[z]) + ": ");
            grades[z] = Integer.parseInt(kbd.nextLine());
            System.out.println();
        }
        System.out.println();
        for (int x = 0; x < names.length - 1; x++) {
            for (int y = x + 1; y < names.length; y++) {
                if (names[x].compareTo(names[y]) > 0) {
                    String temp = names[x];
                    names[x] = names[y];
                    names[y] = temp;
                    int tempA = grades[x];
                    grades[x] = grades[y];
                    grades[y] = tempA;
                }
            }
        }
        System.out.println();
        System.out.println("======================================= RESULTS ====================================");
        System.out.println();
        for (int z = 0; z < names.length; z++) {
            System.out.println("Student " + (z + 1) + ": " + names[z] + " = " +
                    grades[z]);
        }
    } // end of acceptAndSortNamesAndGradeByName method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Nov. 30, 2022 by Hannah Ragudos
// This part was edited on Dec. 2, 2022 by Hannah Ragudos
    public static void acceptAndSortNamesAndGradeByGrade() { //acceptAndSortNamesAndGradeByGrade method
        System.out.println();
        System.out.println("======================== -4. Name and Grade Sorter by Grade- ========================");
        System.out.println();
        System.out.println("This recording  routine accepts and sorts the names and grades of the students according to\n" + "grade.");
        System.out.println();
        Scanner kbd = new Scanner(System.in);
        int i;
        System.out.print("Enter the number of students: ");
        i = Integer.parseInt(kbd.nextLine());
        String[] names = new String[i];
        int[] grades = new int[i];
        System.out.println();
        for (int z = 0; z < i; z++) {
            System.out.print("Enter name of student " + (z + 1) + ": ");
            names[z] = kbd.nextLine();
            System.out.print("Enter the grade of " + (names[z]) + ": ");
            grades[z] = Integer.parseInt(kbd.nextLine());
            System.out.println();
        }
        System.out.println();
        for (int x = 0; x < grades.length - 1; x++) {
            for (int y = x + 1; y < grades.length; y++) {
                if (grades[x] > grades[y]) {
                    int temp = grades[x];
                    grades[x] = grades[y];
                    grades[y] = temp;
                    String tempA = names[x];
                    names[x] = names[y];
                    names[y] = tempA;
                }
            }
        }
        System.out.println();
        System.out.println("======================================= RESULTS =====================================");
        System.out.println();
        for (int z = 0; z < grades.length; z++) {
            System.out.println((z + 1) + ": " + names[z] + " = " + grades[z]);
        }
    } // end of acceptAndSortNamesAndGradeByGrade method

//--------------------------------------------------------------------------------------------------------------------//
// ===================-- END OF RECORDING ROUTINE METHODS--=====================

    // This part was created on Nov. 14, 2022 by Hannah Ragudos
// This part was edited on Dec. 2, 2022 by Hannah Ragudos
//=====================-- MISCELLANEOUS ROUTINE METHODS--======================
    public static void miscellaneousProcesses() { // miscellaneousProcesses method
        Scanner kbd = new Scanner(System.in);
        int choice = 0;
        do {
            showMenu3();
            choice = enterChoice(1, 10);
            switch (choice) {
                case 1:
                    higherOrLower();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 2:
                    moneyDispenser();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 3:
                    moneyInvested();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    // TO DO
                    break;
                case 4:
                    incomeTaxComputation();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    //TO DO
                    break;
                case 5:
                    insectPopulationGrowthRate();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    // TO DO
                    break;
                case 6:
                    waterBill();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    // TO DO
                    break;
                case 7:
                    electricBill();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    // TO DO
                    break;
                case 8:
                    mobileLoadComputation();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    // TO DO
                    break;
                case 9:
                    gradeAverage();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    // TO DO
                    break;
                case 10:
                    selfEvaluation();
                    System.out.println();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    // TO DO
                    break;
                case 11:
                    showMenu1();
                    // TO DO
            } // end of cases
        } while (choice != 10);
    } // end of miscellaneousProcesses method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Dec. 3, 2022 by Hannah Ragudos
// This part was edited on Dec. 5, 2022 by Hannah Ragudos
    public static void higherOrLower() { // higherOrLower method
        System.out.println();
        System.out.println("========================= -1. Higher of Lower- ========================");
        System.out.println();
        System.out.println("This miscellaneous routine lets you think of a certain number and can obtain it\n" +
                "through a guess and clue if the number is higher or lower. You only have. \nHave fun!");
        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        Random rndNoGen = new Random(); // Random class is a facility for
        // generating random numbers
        int secretNo = rndNoGen.nextInt(100) + 1; // generate a random number
        // that is in the range from 1 to 100.
        System.out.println("I have an integer from 1 to 100.");
        System.out.println("You have 10 chances to guess it.");
        int guessNo = 0;
        int guess;
        boolean gotIt = false;
        do {
            System.out.print("\nGuess #" + (guessNo + 1) + ": ");
            guess = keyboard.nextInt();
            if (guess == secretNo) {
                gotIt = true;
                break; // terminate the loop immediately
            } else {
                if (guessNo == 10) {
                    break; // terminate the loop immediately
                } else {
                    if (guess > secretNo) {
                        System.out.println("Try something lower.");
                    } else {
                        System.out.println("Try something higher.");
                    }
                    guessNo++;
                }
            }
        } while (guessNo < 10);
        if (gotIt) {
            System.out.println("\nCongratulations!!!");
            System.out.println("Got it in " + guessNo + " trial(s)!");
        } else {
            System.out.println("\nSorry. No more guesses left.");
            System.out.println("The number is " + secretNo + ".");
            System.out.println("Better luck next time.");
        }
        System.out.println("\nThanks for playing!!!");
        System.out.println("Have a nice day :)!");
    } // end of higherOrLower method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Dec. 4, 2022 by Hannah Ragudos
// This part was edited on Dec. 6, 2022 by Hannah Ragudos
    public static void moneyDispenser() { // moneyDispenser method
        System.out.println();
        System.out.println("============================= -2. Bills Distribution- =============================");
        System.out.println();
        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount to be withdrawn (WHOLE NUMBERS ONLY): ");
        int amountToBeWithdrawn = Integer.parseInt(keyboard.nextLine());
        int quantityP1000 = amountToBeWithdrawn / 1000;
        int rP1000 = amountToBeWithdrawn % 1000;
        int quantityP500 = rP1000 / 500;
        int rP500 = amountToBeWithdrawn % 500;
        int quantityP100 = rP500 / 100;
        int rP100 = amountToBeWithdrawn % 100;
        int quantityP50 = rP100 / 50;
        int rP50 = amountToBeWithdrawn % 50;
        int quantityP20 = rP50 / 20;
        double p1000Amount = quantityP1000 * 1000.00;
        double p500Amount = quantityP500 * 500.00;
        double p100Amount = quantityP100 * 100.00;
        double p50Amount = quantityP50 * 50.00;
        double p20Amount = quantityP20 * 20.00;
        double AmountTotal = p1000Amount + p500Amount + p100Amount + p50Amount
                + p20Amount;
        int quantityDispensed = quantityP1000 + quantityP500 + quantityP100 + quantityP50 + quantityP20;
        String strDoubleP1000 = String.format("%.2f", p1000Amount);
        String strDoubleP500 = String.format("%.2f", p500Amount);
        String strDoubleP100 = String.format("%.2f", p100Amount);
        String strDoubleP50 = String.format("%.2f", p50Amount);
        String strDoubleP20 = String.format("%.2f", p20Amount);
        String strDoubleAmTotal = String.format("%.2f", AmountTotal);
        System.out.println();
        System.out.println("Peso Bills Quantity Dispensed Amount");
        System.out.println("========== ================== ==========");
        System.out.println("P1000" + " " +
                quantityP1000 + " " + strDoubleP1000);
        System.out.println("P500" + " " +
                quantityP500 + " " + strDoubleP500);
        System.out.println("P100" + " " +
                quantityP100 + " " + strDoubleP100);
        System.out.println("P50" + " " +
                quantityP50 + " " + strDoubleP50);
        System.out.println("P20" + " " +
                quantityP20 + " " + strDoubleP20);
        System.out.println("---------- ------------------ ----------");
        System.out.println("Total No. of Bills" + " " + quantityDispensed + " " + strDoubleAmTotal);
    } // end of moneyDispenser method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Dec. 4, 2022 by Hannah Ragudos
// This part was edited on Dec. 6, 2022 by Hannah Ragudos
    public static void moneyInvested() { //moneyInvested method
        System.out.println();
        System.out.println("============================= -3. Interest of Money Invested-=============================");
        System.out.println();
        System.out.println("This miscellaneous routine computes the interest of your money invested quarterly with 5% annual rate.");
        System.out.println();
        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        float annualRate = 0.05F;
        float quarterlyRate;
        double principal;
        double interest;
        double finalAmount;
        byte quarter;
        int year;
        System.out.print("Enter the year: ");
        year = Integer.parseInt(keyboard.nextLine());
        System.out.print("Enter the initial principal: ");
        principal = Double.parseDouble(keyboard.nextLine());
        System.out.printf("%s%.2f%n", "Principal = ", principal);
        System.out.printf("%s%.2f%c%n", "Interest Rate = ", annualRate * 100, '%');
        System.out.printf("%6s%8s%16s%30s%n", "Year", "Quarter", "Interest Earned", "Principal at end of quarter");
        quarterlyRate = annualRate / 4;
        for (quarter = 1; quarter <= 4; quarter++) {
            interest = principal * quarterlyRate;
            finalAmount = principal + interest;
            System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
            principal = finalAmount;
        }
    } // end of moneyInvested method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Dec. 6, 2022 by Hannah Ragudos
// This part was edited on Dec. 7, 2022 by Hannah Ragudos
    public static void incomeTaxComputation() { // incomeTaxComputation method
        System.out.println();
        System.out.println("============================== -4. Income Tax Computation-=============================");
        System.out.println();
        System.out.println("This miscellaneous routine computes the Annual Income Tax Amount due from a taxpayer.");
        System.out.println();
        System.out.println("============================== HYPOTHETICAL TAX COMPUTER ==============================");
        System.out.println();
        System.out.println("This routine computes your hypothetical income tax.");
        System.out.println();
        double grossIncome, totalNontaxableIncome;
        double taxableIncome, annualIncomeTaxAmount;
        String nameOfTaxpayer, status;
        introduction();
        nameOfTaxpayer = readName();
        grossIncome = readAmount("Enter the Total Gross Income received by the taxpayer");
        status = readStatus();
        totalNontaxableIncome = readAmount("Enter the Total Nontaxable Income received by the taxpayer");
        taxableIncome = computeTaxableIncome(grossIncome, totalNontaxableIncome);
        annualIncomeTaxAmount = computeTaxDue(determineBracket(taxableIncome), taxableIncome);
        showResults(nameOfTaxpayer, status, grossIncome, totalNontaxableIncome, taxableIncome, annualIncomeTaxAmount);
    } // end of incomeTaxComputation method

    public static void introduction() { // showIntroduction method
        System.out.println("Hypothetical Tax Computation Program");
        System.out.println("------------------------------------");
        System.out.println();
    } // end of showIntroduction method

    public static String readName() { // readName method
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        System.out.print("Enter the name of the taxpayer: ");
        name = keyboard.nextLine();
        return name;
    } // end of readName method

    public static double readAmount(String promptMessage) { // readAmount method
        Scanner keyboard = new Scanner(System.in);
        double income;
        do {
            try {
                System.out.print(promptMessage + ": ");
                income = Double.parseDouble(keyboard.nextLine());
                if (income < 0) {
                    System.out.println("The gross income must not be negative.");
                }
            } catch (NumberFormatException exception) {
                System.out.println("You need to enter a number.");
                income = -1;
            }
        } while (income < 0);
        return income;
    } // end of readAmount method

    public static String readStatus() { // readStatusMethod
        Scanner scan = new Scanner(System.in);
        String status;
        do {
            System.out.print("Enter the status of the taxpayer: ");
            status = scan.nextLine();
            if (!status.equals("single") && !status.equals("married") && !
                    status.equals("legally separated") && !status.equals("widow/er"))
                System.out.println("You have to type single. married, legally separated or widow/er");
        } while (!status.equals("single") && !status.equals("married") && !
                status.equals("legally separated") && !status.equals("widow/er"));
        return status;
    } // end of readStatusMethod

    public static int determineBracket(double taxableIncome) { // determineBracketmethod
        int bracket;
        if (taxableIncome < 250000.00) {
            bracket = 1;
        } else {
            if (taxableIncome < 400000.00) {
                bracket = 2;
            } else {
                if (taxableIncome < 800000.00) {
                    bracket = 3;
                } else {
                    if (taxableIncome < 2000000.00) {
                        bracket = 4;
                    } else {
                        if (taxableIncome < 8000000.00) {
                            bracket = 5;
                        } else {
                            bracket = 6;
                        }
                    }
                }
            }
        }
        return bracket;
    } // end of determineBracket method

    public static double computeTaxableIncome(double totalGrossIncome, double totalNontaxableIncome) { //computeTaxableIncome method
        double taxableIncome;
        taxableIncome = (totalGrossIncome - totalNontaxableIncome);
        return taxableIncome;
    } // end of computeTaxableIncome method

    public static double computeTaxDue(int bracket, double taxableIncome) {
        double taxDue = switch (bracket) { // computeTaxDueMethod
            case 1 -> taxableIncome * 0.00;
            case 2 -> (taxableIncome - 250000.00) * 0.20;
            case 3 -> 30000.00 + (taxableIncome - 400000.00) * 0.25;
            case 4 -> 130000.00 + (taxableIncome - 800000.00) * 0.30;
            case 5 -> 490000.00 + (taxableIncome - 2000000.00) * 0.32;
            case 6 -> 2410000.00 + (taxableIncome - 8000000.00) * 0.35;
            default -> 0.00;
        };
        return taxDue;
    } // end of computeTaxDue method

    public static void showResults(String name, String status, double grossIncome, double totalNontaxableIncome, double taxableIncome,
                                   double taxAmount) { // showResults method
        System.out.println();
        System.out.printf("%-30s%-30s%n", "Taxpayer's name: ", name);
        System.out.printf("%-30s%-30s%n", "Taxpayer's status",
                status.toUpperCase());
        System.out.println();

        System.out.println("=============================================================== ======");
        System.out.println();
        System.out.printf("%-30s%30.2f%n", "Gross Income: ", grossIncome);
        System.out.printf("%80s%n",
                "----------------------------------------------------");
        System.out.printf("%-30s%-30.2f%n", "Total Nontaxable Income: ",
                totalNontaxableIncome);
        System.out.printf("%80s%n",
                "----------------------------------------------------");
        System.out.printf("%-30s%30.2f%n", "Taxable Income: ", taxableIncome);
        System.out.printf("%80s%n",
                "----------------------------------------------------");
        System.out.printf("%-30s%30.2f%n", "Tax Amount To Pay = ", taxAmount);
        System.out.println();

        System.out.println("=============================================================== ======");
    } // end of showResults method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Dec. 5, 2022 by Hannah Ragudos
    public static void insectPopulationGrowthRate() { // insectPopulationGrowthRatemethod
        System.out.println("======================= -5. Insect Population Growth Rate- =======================");
        System.out.println();
        System.out.println("This miscellaneous routine computes the growth rate of insects.");
        System.out.println();
        Scanner kbd = new Scanner(System.in);
        int fSize, iSize;
        double rateOfGrowth;
        System.out.println("Kindly enter the following: ");
        System.out.print(" Initial population: ");
        iSize = kbd.nextInt();
        System.out.print(" Current population: ");
        fSize = kbd.nextInt();
        rateOfGrowth = (fSize - iSize) * 100.0 / iSize;
        System.out.print("\nThe rate of growth is " + rateOfGrowth + "%");
        System.out.println(" because (" + fSize + " - " + iSize + ") * 100 / " +
                iSize + " is " +
                rateOfGrowth + "%");
    } // end of insectPopulationGrowthRate method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Dec. 5, 2022 by Hannah Ragudos
// This part was edited on Dec. 7, 2022 by Hannah Ragudos
    public static void waterBill() { // waterBill method
        System.out.println();
        System.out.println("=========================== -6. Water Bill Computation- ===========================");
        System.out.println();
        System.out.println();
        System.out.println("This miscellaneous routine will prepare a bill for water consumption. ");
        System.out.println("You will be asked to enter the name of the " + "consumer, the meter \nreading last month, " +
                "and the meter reading this month.");
        System.out.println();
        int presentReading, previousReading;
        Scanner kbd = new Scanner(System.in);
        String consumer;
        char cType;
        int cubicMetersConsumed;
        int minCMResidential = 12;
        double minBillResidential = 180.00;
        float rateResidential = 30.00F;
        int minCMCommercial = 30;
        double minBillCommercial = 600.00;
        float rateCommercial = 50.00F;
        double amountDue = 0.0;
        System.out.print("Enter the consumer's name: ");
        consumer = kbd.nextLine();
        do {
            System.out.print("Enter the meter reading last month: ");
            previousReading = Integer.parseInt(kbd.nextLine());
            if (previousReading < 0) {
                System.out.println("The meter reading cannot be negative.");
            }
        } while (previousReading < 0);
        do {
            System.out.print("Enter the current meter reading: ");
            presentReading = Integer.parseInt(kbd.nextLine());
            if (presentReading < previousReading) {
                System.out.println("The meter reading cannot be less than the present reading.");
            }
        } while (presentReading < previousReading);
        cubicMetersConsumed = presentReading - previousReading;
        do {
            System.out.print("Consumer Type (R - RESIDENTIAL, C - COMMERCIAL): ");
            String input = kbd.nextLine(); //input for type of consumer
            cType = input.charAt(0);
            if (cType != 'R' && cType != 'r' && cType != 'C' && cType != 'c') {
                System.out.println("The valid types are R for residential " +
                        "and C for commercial!");
            }
        } while (cType != 'R' && cType != 'r' && cType != 'C' && cType != 'c');
        switch (cType) {
            case 'r':
            case 'R':
                if (cubicMetersConsumed <= minCMResidential) {
                    amountDue = minBillResidential;
                } else {
                    amountDue = minBillResidential + (cubicMetersConsumed -
                            minCMResidential) * rateResidential;
                }
                break;
            case 'c':
            case 'C':
                if (cubicMetersConsumed <= minCMCommercial) {
                    amountDue = minBillCommercial;
                } else {
                    amountDue = minCMCommercial + (cubicMetersConsumed -
                            minCMCommercial) * rateCommercial;
                }
        }
        System.out.println();
        System.out.println("========================== -Water Billing Statement- ==========================");
        System.out.println("---------------------- Water Meter Reading for the Month ----------------------");
        System.out.println();
        System.out.println("This program will prepare a bill for a water consumption. ");
        System.out.println("You will be asked to enter the name of the " + "consumer, the water meter \nreading " +
                "last month, " + "and the water reading this month.");
        System.out.println();
        System.out.println("Account Name: " + consumer);
        System.out.print("Type of consumer: ");
        if (cType == 'R')
            System.out.println("Residential");
        if (cType == 'r')
            System.out.println("Residential");
        if (cType == 'C')
            System.out.println("Commercial");
        if (cType == 'c')
            System.out.println("Commercial");
        System.out.println("Previous Meter Reading = " + previousReading + " Cubic Meters");
        System.out.println("Current Meter Reading = " + presentReading + " Cubic Meters");
        System.out.println("Cubic Meters Consumed = " + cubicMetersConsumed + " Cubic Meters");
        System.out.println("Amount Due = Php " + amountDue);
    } // end of waterBill method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Dec. 6, 2022 by Hannah Ragudos
// This part was edited on Dec. 8, 2022 by Hannah Ragudos
    public static void electricBill() { // electricBill method
        System.out.println();
        System.out.println("========================= -7. Electric Bill Computation- =========================");
        System.out.println();
        System.out.println();
        System.out.println("This miscellaneous routine will prepare a bill for an electricity consumption. ");
        System.out.println("You will be asked to enter the name of the " + "consumer, the electricity meter " +
                "\nreading last month, " + "and the electricity reading this month.");
        System.out.println();
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        int currentReading, previousReading;
        String nameConsumer;
        char consumerType;
        int nKWHUsed;
        int minKWHResidential = 20;
        int minBillResidential = 8;
        float rateResidential = 10;
        int minKWHCommercial = 20;
        double minBillCommercial = 12;
        float rateCommercial = 15;
        double amountDue;
        System.out.print("Enter the account name: ");
        nameConsumer = kbd.nextLine();
        previousReading = readPreviousReading();
        currentReading = readCurrentReading(previousReading);
        nKWHUsed = currentReading - previousReading;
        consumerType = readTypeOfConsumer();
        amountDue = computeAmountDue(nKWHUsed, consumerType, minKWHResidential, minBillResidential, minKWHCommercial,
                minBillCommercial, rateResidential, rateCommercial);
        displayBill(nameConsumer, consumerType, previousReading, currentReading, nKWHUsed, amountDue);
    } // end of electricBill method

    public static int readPreviousReading() { //readPreviousReading method
        int previous;
        Scanner kbd = new Scanner(System.in);
        do {
            System.out.print("Enter the meter reading last month: ");
            previous = Integer.parseInt(kbd.nextLine());
            if (previous < 0) {
                System.out.println("The meter reading cannot be negative.");
            }
        } while (previous < 0);
        return previous;
    } // end of readPreviousReading method

    public static int readCurrentReading(int previous) { // readCurrentReading method
        int current;
        Scanner kbd = new Scanner(System.in);
        do {
            System.out.print("Enter the meter reading for this month: ");
            current = Integer.parseInt(kbd.nextLine()); // input for reading
            if (current < previous) {
                System.out.println("Invalid datum entry! The current reading must be greater than the previous reading.");
            }
        } while (current < previous);
        return current;
    } // end of readCurrentReading method

    public static char readTypeOfConsumer() { // readTypeOfConsumer method
        char t;
        Scanner kbd = new Scanner(System.in);
        do {
            System.out.print("Consumer Type (A - RESIDENTIAL, B - COMMERCIAL): ");
            String input = kbd.nextLine();
            t = input.charAt(0);
            if (t != 'A' && t != 'a' && t != 'B' && t != 'b') {
                System.out.println("The valid types are A for residential and B for commercial!");
            }
        } while (t != 'A' && t != 'a' && t != 'B' && t != 'b');
        return t;
    } // end readTypeOfConsumer method

    // This part was edited on Dec. 6, 2022 by Hannah Ragudos
    public static double computeAmountDue(int nKWHUsed, char t, int minKWHResidential, double minBillResidential,
                                          int minKWHCommercial, double minBillCommercial, float rateResidential,
                                          float rateCommercial) {
        double amount = 0;
        switch (t) {
            case 'a':
            case 'A':
                if (nKWHUsed <= minKWHResidential) {
                    amount = minBillResidential * nKWHUsed;
                } else if (nKWHUsed > 20) {
                    amount = (minKWHResidential * minBillResidential) + (nKWHUsed - minKWHResidential) * rateResidential;
                }
                break;
            case 'b':
            case 'B':
                if (nKWHUsed <= minKWHCommercial) {
                    amount = (minBillCommercial * nKWHUsed); //execution when consumed <= 20 KWH for commercial
                } else {
                    amount = (minKWHCommercial * minBillCommercial) + (nKWHUsed - minKWHCommercial) * rateCommercial;
                }
        }
        return amount;
    } // end of computeAmountDue method

    // This part was edited on Dec. 7, 2022 by Hannah Ragudos

    public static void displayBill(String n, char t, int previous, int current,
                                   int nKWHUsed, double amount) {
        System.out.println();
        System.out.println("========================== -Electric Billing Statement- ==========================");
        System.out.println("---------------------- Electric Meter Reading for the Month ----------------------");
        System.out.println();
        System.out.println("Account Name: " + n);
        System.out.print("Type of consumer: ");
        if (t == 'A')
            System.out.println("Residential");
        else if (t == 'a')
            System.out.println("Residential");
        else if (t == 'B')
            System.out.println("Commercial");
        else if (t == 'b')
            System.out.println("Commercial");
        System.out.println("Previous Meter reading = " + previous + " Kilowatts per Hour");
        System.out.println("Current Meter reading = " + current + " Kilowatts per Hour");
        System.out.println("Kilowatts per Hour Consumed = " + nKWHUsed + " Kilowatts per Hour");
        System.out.println("Amount Due = Php " + amount);
    } // end of electricBill method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Dec. 2, 2022 by Hannah Ragudos
// This part was edited on Dec. 8, 2022 by Hannah Ragudos
    public static void mobileLoadComputation() { // mobileLoadComputation method
        System.out.println();
        System.out.println("========================= -7. Mobile Load Balance Computation- =========================");
        System.out.println();
        System.out.println();
        System.out.println("This miscellaneous routine computes your load consumption according to the rates.\n" +
                "Please enter your load balance and desired Linker service.");
        System.out.println();
        Scanner kbd = new Scanner(System.in);
        int choice;
        double loadBalance;
        double rateCalls;
        double rateTexts;
        double rateRegistration;
        double newBalance;
        double callMin;
        double deduction;
        int textPeople;
        System.out.print("Load Balance: ");
        loadBalance = Double.parseDouble(kbd.nextLine());
        System.out.println("Linker Communications Services: \n" +
                "Your load balance is: " + loadBalance + " \n" +
                "1. Load\n" +
                "2. Texts\n" +
                "3. Calls\n" +
                "4. Register\n");
        choice = enterChoice(1, 4);
        switch (choice) {
            case 1: {
                System.out.println("======================= Linker Load =======================");
                System.out.println();
                System.out.print("Enter desired load: ");
                double addLoad = Double.parseDouble(kbd.nextLine());
                System.out.println();
                newBalance = loadBalance + addLoad;
                System.out.println("You now have a total balance of : " +
                        newBalance);
                break;
            }
            case 2: {
                System.out.println("======================= Linker Texts =======================");
                System.out.println();
                rateTexts = 1.00;
                System.out.println("Linker text rate is P1.00 per text.\n" +
                        "How many people do you want to text?");
                System.out.print("Enter amount of text: ");
                textPeople = Integer.parseInt(kbd.nextLine());
                deduction = textPeople * rateTexts;
                if (loadBalance >= deduction) {
                    newBalance = loadBalance - (textPeople * rateTexts);
                    System.out.println();
                    System.out.println("Your current balance is: " + newBalance);
                }
                if (loadBalance < deduction) {
                    System.out.println();
                    System.out.println("You do not have enough load to text " +
                            textPeople + " people.");
                }
                break;
            }
            case 3: {
                System.out.println("======================= Linker Calls =======================");
                System.out.println();
                rateCalls = 2.30;
                System.out.println("Linker call rate is P2.30 per minute.\n" +
                        "How long do you want to call someone in minutes?");
                System.out.print("Enter minutes: ");
                callMin = Integer.parseInt(kbd.nextLine());
                deduction = callMin * rateCalls;
                if (loadBalance >= deduction) {
                    newBalance = loadBalance - (callMin * rateCalls);
                    System.out.println();
                    System.out.println("Your current balance is: " + newBalance);
                }
                if (loadBalance < deduction) {
                    System.out.println();
                    System.out.println("You do not have enough load to call for " +
                            callMin + " min/s");
                }
                break;
            }
            case 4: {
                System.out.println("======================= Linker Register =======================");
                System.out.println();
                System.out.println("Available Linker registration promos: \n" +
                        "1. Text\n" +
                        "2. Calls\n" +
                        "3. Mobile Data\n" +
                        "4. Linker Combos");
                System.out.println();
                choice = enterChoice(1, 4);
                switch (choice) {
                    case 1: {
                        System.out.println("======================= Linker Text Promos =======================");
                        System.out.println();
                        System.out.println("""
                                Text promos:\s
                                1. Text10 - P 10.00 for 75 free texts to all networks for 1 day.
                                2. MagicText30 - P 30.00 for 100 free text to Linker network for 5 weeks.""");
                        System.out.println();
                        choice = enterChoice(1, 2);
                        switch (choice) {
                            case 1: {
                                rateRegistration = 10.00;
                                if (loadBalance >= 10) {
                                    newBalance = loadBalance - rateRegistration;
                                    System.out.println();
                                    System.out.println("You are now subscribed to Text10!\n" +
                                            "You now have 75 free texts to all networks for 1 day.");
                                    System.out.println();
                                    System.out.println("Your new balance is: " +
                                            newBalance);
                                } else if (loadBalance < 10) {
                                    System.out.println();
                                    System.out.println("You do not have enough load to register to this promo.");
                                }
                                break;
                            }
                            case 2: {
                                rateRegistration = 30.00;
                                if (loadBalance >= 30) {
                                    newBalance = loadBalance - rateRegistration;
                                    System.out.println();
                                    System.out.println("You are now subscribed to MagicText30!\n" +
                                            "You now have 100 free text to Linker network for 5 weeks.");
                                    System.out.println();
                                    System.out.println("Your new balance is: " +
                                            newBalance);
                                } else if (loadBalance < 30) {
                                    System.out.println();
                                    System.out.println("You do not have enough load to register to this promo.");
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("======================= Linker Calls Promos =======================");
                        System.out.println();
                        System.out.println("Call promos: \n" +
                                "1. CallAll30 - P 30.00 for 1 day unlimited calls to all networks for 1 day.\n" +
                                "2. MagicCall60 - P 60.00 for 48 hour calls to all networks without expiration.");
                        System.out.println();
                        choice = enterChoice(1, 2);
                        switch (choice) {
                            case 1: {
                                rateRegistration = 30.00;
                                if (loadBalance >= 30) {
                                    newBalance = loadBalance - rateRegistration;
                                    System.out.println();
                                    System.out.println("You are now subscribed to CallAll30!\n" +
                                            "You now have 75 free texts to all networks for 1 day.");
                                    System.out.println();
                                    System.out.println("Your new balance is: " + newBalance);
                                } else if (loadBalance < 30) {
                                    System.out.println();
                                    System.out.println("You do not have enough load to register to this promo.");
                                }
                                break;
                            }
                            case 2: {
                                rateRegistration = 60.00;
                                if (loadBalance >= 60) {
                                    newBalance = loadBalance - rateRegistration;
                                    System.out.println();
                                    System.out.println("You are now subscribed to MagicCall60!\n" +
                                            "You now have 48 hour calls to all networks without expiration.");
                                    System.out.println();
                                    System.out.println("Your new balance is: " +
                                            newBalance);
                                } else if (loadBalance < 60) {
                                    System.out.println();
                                    System.out.println("You do not have enough load to register to this promo.");
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("======================= Linker Data Promos =======================");
                        System.out.println();
                        System.out.println("Data promos: \n" +
                                "1. AllOutData50 - P 50.00 for 2GB data for 6 days.\n" +
                                "2. DataMagic100 - P 100.00 for 3GB data without expiration.");
                        System.out.println();
                        choice = enterChoice(1, 2);
                        switch (choice) {
                            case 1: {
                                rateRegistration = 50.00;
                                System.out.println();
                                if (loadBalance >= 50) {
                                    newBalance = loadBalance - rateRegistration;
                                    System.out.println("You are now subscribed to AllOutData50!\n" +
                                            "You now have 2GB data for 6 days.");
                                    System.out.println();
                                    System.out.println("Your new balance is: " +
                                            newBalance);
                                } else if (loadBalance < 50) {
                                    System.out.println();
                                    System.out.println("You do not have enough load to register to this promo.");
                                }
                                break;
                            }
                            case 2: {
                                rateRegistration = 100.00;
                                System.out.println();
                                if (loadBalance >= 100) {
                                    newBalance = loadBalance - rateRegistration;
                                    System.out.println();
                                    System.out.println("You are now subscribed to DataMagic100!\n" +
                                            "You now have 3GB data without expiration.");
                                    System.out.println();
                                    System.out.println("Your new balance is: " +
                                            newBalance);
                                } else if (loadBalance < 100) {
                                    System.out.println();
                                    System.out.println("You do not have enough load to register to this promo.");
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("======================= Linker Combo Promos =======================");
                        System.out.println();
                        System.out.println("Combo promos: \n" +
                                "1. ComboPack100 - P 100.00 for 1 GB data + unlimited calls and text for 3 days.\n" +
                                "2. ComboPack200 - P 200.00 for 3GB data + 75 free texts + 2 hours call.\n" +
                                "to all networks without expiration.");
                        System.out.println();
                        choice = enterChoice(1, 2);
                        switch (choice) {
                            case 1: {
                                rateRegistration = 100.00;
                                if (loadBalance >= 100) {
                                    newBalance = loadBalance - rateRegistration;
                                    System.out.println();
                                    System.out.println("You are now subscribed to ComboPack100!\n" +
                                            "You now have 1GB data for 5 days.");
                                    System.out.println();
                                    System.out.println("Your new balance is: " +
                                            newBalance);
                                } else if (loadBalance < 100) {
                                    System.out.println("You do not have enough load to register to this promo.");
                                }
                                break;
                            }
                            case 2: {
                                rateRegistration = 200.00;
                                if (loadBalance >= 200) {
                                    newBalance = loadBalance - rateRegistration;
                                    System.out.println();
                                    System.out.println("You are now subscribed to ComboPack200!\n" +
                                            "You now have 3GB data without expiration.");
                                    System.out.println();
                                    System.out.println("Your new balance is: " +
                                            newBalance);
                                } else if (loadBalance < 200) {
                                    System.out.println();
                                    System.out.println("You do not have enough load to register to this promo.");
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }
    } // end of mobileLoadComputation method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Dec. 5, 2022 by Hannah Ragudos
    public static void gradeAverage() { // gradeAverage method
        System.out.println("============================== -9. Semester Grade Computation- ==============================");
        System.out.println();
        System.out.println("This miscellaneous routine will compute your grade for the semester. ");
        System.out.println();
        Scanner kbd = new Scanner(System.in);
        int grade = 50;
        int units = 0;
        int totalGrade = 0;
        int totalUnits = 0;
        int x = 0;
        System.out.print("Enter the number of your subject: ");
        int subjects = Integer.parseInt(kbd.nextLine());
        do {
            System.out.print("Enter the grade of the student for subject " + (x +
                    1) + ": ");
            grade = Integer.parseInt(kbd.nextLine());
            System.out.print("Enter the number of units for subject " + (x + 1) +
                    ": ");
            units = Integer.parseInt(kbd.nextLine());
            totalGrade += grade * units;
            totalUnits = totalUnits + units;
            System.out.println();
            x++;
        } while (subjects > x);
        System.out.println();
        double average = (double) totalGrade / totalUnits;
        String strAverage = String.format("%.2f", average);
        System.out.println("Your average for the semester is: " + strAverage +
                ".");
    } // end of gradeAverage method

    //--------------------------------------------------------------------------------------------------------------------//
// This part was created on Dec. 8, 2022 by Hannah Ragudos
    public static void selfEvaluation() { // selfEvaluation method
        System.out.println("============================== -10. A(H1N1) Self-Diagnostic Procedure- ==============================");
        System.out.println();
        System.out.println("This miscellaneous routine will generate your risk percentage on Getting Covid-19 virus. ");
        Scanner kbd = new Scanner(System.in);
        int question2, question3;
        String Introduction, message1, message2;

        message2 = "Thank you for your Honest Answers. Stay Healthy  and God Bless!";

        message1 = """
                               
                     Are you experiencing any of the following symptoms?
                Fever, Cough, Cold, Sore Throat, Difficulty Breathing, Diarrhea
                        ---------------------------------------------
                             
                                Please type Yes or No for your answer
                        """;

        Introduction = """
                               
                               Covid-19 Health Declaration Form
                All information provided in this form should be true and honest
                        ---------------------------------------------
                             
                                Please type Yes or No for your answers
                        """;
        JOptionPane.showMessageDialog(null, Introduction);

        int question1 = JOptionPane.showConfirmDialog(null, "1. In the past week, have you had any known exposure to a confirmed COVID-19 patient?");

        if (question1 == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Please Consult a Medical Doctor Immediately.");
            return;
        }
        if (question1 == JOptionPane.CANCEL_OPTION) {
            return;
        }

        question2 = JOptionPane.showConfirmDialog(null, "Have you tested POSITIVE for COVID-19 in the last 7 days? ");
        if (question2 == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Please Consult a Medical Doctor Immediately.");
            return;
        }
        if (question2 == JOptionPane.CANCEL_OPTION) {
            return;
        }
        JOptionPane.showMessageDialog(null, message1);

        question3 = JOptionPane.showConfirmDialog(null, "Are you experiencing at least one of the following symptoms? ");
        if (question3 == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Please Consult a Medical Doctor Immediately.");
            return;
        }
        if (question3 == JOptionPane.CANCEL_OPTION) {
            return;
        }
        ;
        JOptionPane.showMessageDialog(null, message2);
    }


//--------------------------------------------------------------------------------------------------------------------//
    //=================-- END OF MISCELLANEOUS ROUTINE METHODS --==================
//--------------------------------------------------------------------------------------------------------------------//

// / This part was created on Dec. 8, 2022 by Hannah Ragudos
    /**
     * Displays the elements of an array
     **/
    public static void showElements(String[] array) { // showElements method
        for (int x = 0; x < array.length; x++)
            System.out.println(array[x]);
    } // end of showElements method

    /**
     * Sorts a given array of int following the ascending order
     */
    public static void balloonSortArray1(int[] given) { // balloonSortArray1 method
        for (int x = 0; x < given.length - 1; x++) {
            for (int y = x + 1; y < given.length; y++) {
                if (given[x] > given[y]) {
                    int temp = given[x];
                    given[x] = given[y];
                    given[y] = temp;
                } // end of if
            } // end of second for
        } // end of first for
    } // end of balloonSortArray1 method
    /**
     * Sorts a given array of String following lexicographic ordering (i.e. alphabetical ordering)
     */
    public static void balloonSortArray2(String[] given) { // balloonSortArray2method
        for (int x = 0; x < given.length - 1; x++) {
            for (int y = x + 1; y < given.length; y++) {
                if (given[x].compareTo(given[y]) > 0) {
                    String temp = given[x];
                    given[x] = given[y];
                    given[y] = temp;
                } // end of if
            } // end of second for
        } // end of first for
    } // end of balloonSortArray2 method
    /**
     * Returns true if searchKey is in a given array of int.
     */
    public static boolean linearSearch1(int[] array, int searchKey) {
        boolean r = false;
        for (int index = 0; index < array.length && r == false; index++) { //linearSearch1 method
            if (array[index] == searchKey)
                r = true;
        }
        return r;
    } // end of linearSearch1 method
    /**
     * Returns true if searchKey is in a given array of int.
     */
    public static boolean linearSearch2(int[] array, int searchKey) { //linearSearch2 method
        for (int index = 0; index < array.length; index++) {
            if (array[index] == searchKey)
                return true;
        }
        return false;
    } // end of linearSearch2 method
    /**
     * Returns true if searchKey is in a given array of String.
     */
    public static boolean linearSearch3(String[] array, String searchKey) { //linearSearch3 method
        boolean r = false;
        for (int index = 0; index < array.length && r == false; index++) {
            if (array[index].equalsIgnoreCase(searchKey))
                r = true;
        }
        return r;
    } // end of linearSearch3 method
    /**
     * Returns true if searchKey is in a given array of String.
     */
    public static boolean linearSearch4(String[] array, String searchKey) { //linearSearch4 method
        for (int index = 0; index < array.length; index++) {
            if (array[index].equalsIgnoreCase(searchKey))
                return true;
        }
        return false;
    } // end of linearSearch4 method
    /**
     * Returns the index of the first cell of an array containing a searchKey if
     the searchKey is in the array, else returns -1.
     */
    public static int linearSearch5(int[] array, int searchKey) { // linearSearch5method
        for (int index = 0; index < array.length; index++) {
            if (array[index] == searchKey)
                return index;
        }
        return -1;
    } // end of linearSearch5 method
    public static int[] copyIntegerArray(int[] array1) { // copyIntegerArray method
        int[] copied = new int[array1.length];
        for (int index = 0; index < array1.length; index++) {
            copied[index] = array1[index];
        }
        return copied;
    } // end of copyIntegerArray method
    public static String[] copyStringArray(String[] array1) { // copyStringArray method
        String[] copied = new String[array1.length];
        for (int index = 0; index < array1.length; index++) {
            copied[index] = new String(array1[index]);
        }
        return copied;
    } // copy of copyStringArray method

    //The following methods apply the Selection Sort algorithm.
    /**
     * Returns a sorted version of a given array of int following the ascending order
     */
    public static int[] sortIntegerArray(int[] given) { // sortIntegerArray method
        int minIndex = 0;
        int[] sorted = copyIntegerArray(given);
        int temp = 0;
        for (int x = 0; x < sorted.length - 1; x++) {
            minIndex = x;
            for (int y = x + 1; y < sorted.length; y++)
                if (sorted[minIndex] > sorted[y])
                    minIndex = y;
            if (minIndex != x) {
                temp = sorted[x];
                sorted[x] = sorted[minIndex];
                sorted[minIndex] = temp;
            }
        }
        return sorted;
    } // end of sortIntegerArray method
    /**
     * Returns a sorted version of a given array of Strings following lexicographic ordering
     */
    public static String[] sortStringArray(String[] given) { // sortStringArray method
        int minIndex = 0;
        String[] sorted = copyStringArray(given);
        String temp = "";
        for (int x = 0; x < sorted.length - 1; x++) {
            minIndex = x;
            for (int y = x + 1; y < sorted.length; y++)
                if (sorted[y].compareToIgnoreCase(sorted[minIndex]) < 0)
                    minIndex = y;
            if (minIndex != x) {
                temp = sorted[x];
                sorted[x] = sorted[minIndex];
                sorted[minIndex] = temp;
            }
        }
        return sorted;
    } // end of sortStringArray method
    /**
     * This method implements the Binary Search algorithm.
     * Assuming that grades is a sorted array following an increasing order, these
     methods returns true if key is in the array.
     */
    public static boolean bSearch(int[] grades, int key) { // bSearch method
        boolean r = false;
        int lowLimit = 0;
        int upLimit = grades.length - 1;
        int mid = (lowLimit + upLimit) / 2;
        while (lowLimit < upLimit && !r) {
            mid = (lowLimit + upLimit) / 2;
            if (grades[mid] == key)
                r = true;
            else if (grades[mid] < key)
                lowLimit = mid + 1;
            else
                upLimit = mid - 1;
        }
        return r;
    } // end of bSearch method
} // end of main method