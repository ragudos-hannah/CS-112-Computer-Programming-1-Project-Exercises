/*
    Name:Ragudos, Hannah T.
    Course Code and Schedule: 9308 | MW 2:30-5:00 PM
    Date: November-07-2022

            If the sum of the factors that are less than n of the integer n is equal to n, n is a perfect number. For 
        example, 6 is a perfect number because the factors of 6 that are less than 6 are 1,2 and 3 and the sum of these 
        factors (1+2+3) is equal to 6. Also, because the factors of 28 that are less than 28 are 1,2,4,7 and 14 and that 
        1+2+4+7+14 is 28, 28 is a perfect number. When completed, the following program allows the user to enter a 
        integer in the range 1 to 32000. The computer will then state whether the number is perfect number or not.
*/

package finals.exercises;

import java.util.Scanner;
import java.lang.*;

public class PerfectNumber {
    // method that returns true if a number f is a factor of a number n
    public static boolean isFactor(int f, int n) { // ITEM 1
        if (n % f == 0) // n divided by f yields a 0 remainder
            return true;
        else
            return false;
    }

    // method that returns the sum of the factors that are less than n of an integer n
    public static int sumFactors(int n) {
        int sum = 0; // initialize sum of factors to 0
        for (int x = 1; x < n; x++) {
            if (isFactor(x, n)) // Invoke the isFactor method
                sum = sum + x; // ITEM 2
        }
        return sum;
    }

    // method that returns true if an integer n is a perfect number.
    public static boolean isPerfect(int n) {
        if (sumFactors(n) == n) // invoke sumFactors method
            return true; // ITEM 3
        else
            return false;
    }
    // method that reads and returns an integer in the range 1 to a specified limit

    static public int readNumber(int limit) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        do {
            System.out.print("Input an integer between 1 and " + limit + " : ");
            n = keyboard.nextInt(); // ITEM 4
            if (n < 1 || n >= limit) {
                System.out.println("You did not enter a number between 1 and " + limit + ".");
            }
        } while (n < 1 || n >= limit); // ITEM 5
        return n;
    }

    // the main method reads and evaluate if a number is perfect
    public static void main(String[] args) { // ITEM 6
        Scanner keyboard = new Scanner(System.in);
        int n = 0;
        n = readNumber(32000);
        if (isPerfect(n)) { // ITEM 7 invokes isPerfect method and pass n to it
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    } // end of main method
} // end of class PerfectNumber