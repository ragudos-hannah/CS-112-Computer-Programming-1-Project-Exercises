/**
 Name:Ragudos, Hannah T.
 Course Code and Schedule: 9308 | MW 2:30-5:00 PM
 Date: November-14-2022
 ------------------------------------------------------------------------------------------------------------------------
 Problem:
         Develop a program that will allow the computer to accept some names that are not necessarily in
         alphabetical ordering. The names should be stored in a one-dimensional array. The computer will then display
         the names following lexicographic ordering (i.e. alphabetical ordering).

         a. Apply the Balloon Sort algorithm (Filename: FinalExercise4D.java)
         b. Apply the Bubble Sort algorithm (Filename: FinalExercise4E.java)
         c. Apply the Selection Sort algorithm (Filename: FinalExercise4F.java)
 -----------------------------------------------------------------------------------------------------------------------
 Sorting Algorithm Type: Selection Sort
 -----------------------------------------------------------------------------------------------------------------------
 */

package finals.exercises;
import java.util.Scanner;
public class FinalExercise4F {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        String[] names;
        int size = 0;
        size = readInteger(0, "How many names do you want to enter");
        names = new String[size];
        insertStringsToArray(names);
        System.out.println("\n\nEntered names are : ");
        displayArrayItems(names);
        selectionSortStrings(names);
        System.out.println("\n\nNames in lexicographic order (i.e. alphabetical order). : ");
        displayArrayItems(names);
    }
    /**
     * Inserting strings to array names.
     */
    public static void insertStringsToArray(String[] c){
        for(int x=0; x<c.length; x++){
            c[x] = readString("Enter the name " + (x+1));
        }
    }
    /**
     * Reads and returns a string from input device after seeing a prompt
     * message. The String must not be a null string.
     */
    public static String readString(String prompt){
        String value = "";
        do{
            System.out.print(prompt + " : ");
            value = scan.nextLine();
            if(value.compareTo("") == 1){
                System.out.println("You must type a string that is not null.");
            }
        }while(value.compareTo("") == 0);
        return value.trim();
    }
    /**
     * Reads and returns an integer from input device after seeing a prompt
     * message. The value should be greater than lowLimit.
     */
    public static int readInteger(int lowLimit, String prompt){
        int value = 0;
        do{
            System.out.print(prompt + " : ");
            value = Integer.parseInt(scan.nextLine());
            if(value < lowLimit){
                System.out.println("You must enter an integer greater than " + lowLimit + ".");
            }
        }while(value < lowLimit);
        return value;
    }
    /**
     * Reads and shows the list of items after seeing the string array c.
     */
    public static void displayArrayItems(String[] c){
        for(int x=0; x<c.length; x++){
            System.out.println(c[x]);
        }
    }
    /**
     * The selectionSortStrings method sorts the a string array c in ascending
     order following the selection sort algorithm.
     */
    public static void selectionSortStrings(String[] c){
        for(int x=0; x<c.length-1; x++){
            int minIndex = x;
            for(int y=x; y<c.length; y++){
                if(c[minIndex].compareToIgnoreCase(c[y]) > 0){
                    minIndex = y;
                }
            }
            if(minIndex != x){
                String temp = c[x];
                c[x] = c[minIndex];
                c[minIndex] = temp;
            }
        }
    }
}


