/**
 Name:Ragudos, Hannah T.
 Course Code and Schedule: 9308 | MW 2:30-5:00 PM
 Date: November-14-2022
 ------------------------------------------------------------------------------------------------------------------------
 Problem:
            Complete the following program by providing the missing keywords, expressions or statements so that the
        program will solve the given problem. The missed keywords, expressions or statements are identified as No. 1,
        No. 2, ..., No. 5. . Verify the correctness of your answers by encoding and testing the completed program.

            Develop a program that will allow the computer to accept some numbers that are not sorted. The numbers
        should be stored in a one-dimensional array. The computer will then display the
        numbers following descending order and ascending order.

        a. Apply the Balloon Sort algorithm (Filename: FinalExercise4A.java)
        b. Apply the Bubble Sort algorithm (Filename: FinalExercise4B.java)
        c. Apply the Selection Sort algorithm (Filename: FinalExercise4C.java)
 -----------------------------------------------------------------------------------------------------------------------
 Sorting Algorithm Type: Selection Sort
 -----------------------------------------------------------------------------------------------------------------------
 */

package finals.exercises;
import java.util.Scanner;
public class FinalExercise4C {
    static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        int size=0;
        size = readInteger(0, "How many numbers do you want to enter");
        double[] numberList = new double[size];
        addNumbersToArray(numberList);
        System.out.println("\n\nEntered numbers are : \n" + displayArray(numberList));
        selectionSortDesc(numberList);
        System.out.println("\n\nNumbers in descending order : \n" + displayArray(numberList));
        selectionSort(numberList);
        System.out.println("\n\nNumbers in ascending order : \n" + displayArray(numberList));
    }
    /**
     * Reads and returns an integer from input device after seeing a prompt
     * message. The value should be greater than lowLimit.
     */
    public static int readInteger(int lowLimit, String prompt) {
        int value = 0;
        do {
            System.out.print(prompt + ": ");
            value = Integer.parseInt(scan.nextLine());
            if (value <= lowLimit) {
                System.out.println("You must enter an integer value greater than " + lowLimit + ".");
            }
        } while (value <= lowLimit);
        return value;
    }
    /**
     * Reads and returns an integer from input device after seeing a prompt
     * message. The value should be greater than lowLimit.
     */
    public static void addNumbersToArray(double[] list) {
        int size = list.length;
        for(int i=0; i<size; i++){
            System.out.print("Enter a floating point number " + (i+1) +
                    " : ");
            list[i] = Double.parseDouble(scan.nextLine());
        }
    }
    /**
     * Reads the array and returns a string of that array.
     */
    public static String displayArray(double[] list) {
        int size = list.length;
        String numberString = "";
        for(int i=0; i<size-1; i++){
            numberString += list[i] + ", ";
        }
        numberString += list[size-1];
        return numberString;
    }
    /**
     * The method sorts the a double array i in descending order following the
     selection sort algorithm.
     */
    public static void selectionSortDesc(double[] i) {
        for (int x = 0; x < i.length - 1; x++) {
            int minIndex = x;
            for (int y = x + 1; y < i.length; y++) {
                if (i[minIndex] < (i[y])) {
                    minIndex = y;
                }
            }
            if(minIndex != x){
                double dummy = i[minIndex];
                i[minIndex] = i[x];
                i[x] = dummy;
            }
        }
    }
    /**
     * The method sorts the a double array i in ascending order following the
     selection sort algorithm.
     */
    public static void selectionSort(double[] i) {
        for (int x = 0; x < i.length - 1; x++) {
            int minIndex = x;
            for (int y = x + 1; y < i.length; y++) {
                if (i[minIndex] > (i[y])) {
                    minIndex = y;
                }
            }
            if(minIndex != x){
                double dummy = i[minIndex];
                i[minIndex] = i[x];
                i[x] = dummy;
            }
        }
    }
}