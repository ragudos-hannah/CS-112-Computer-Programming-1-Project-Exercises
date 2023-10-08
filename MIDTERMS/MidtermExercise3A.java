/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : October-12-2022
 *Activity Name and Number: Midterm Exercise 3A
------------------------------------------------------------------------------------------------------------------------
Problem:
     Write a program for computing the amount of money in a bank account at the end of each quarter
for a period of one year. A quarter is equivalent to 3 months. Assume that the account is created
at the beginning of a year (i.e. January 1). The year will be entered at run time through the
keyboard. The account has an initial principal that is entered at run time through the keyboard. No
deposit or withdrawal is made within the one-year period. The interest is compounded quarterly
which means that the interest earned for the first quarter will form part of the principal for the
second quarter, the interest earned for the second quarter will form part of the principal for the
third quarter and so on. The annual interest rate is 5%. The interest rate for a quarter is computed
by dividing the annual interest rate by 4 since there are four quarters in a year. The computational
procedure (see algorithm) and the output of the program (see sample run) are shown below. The
output includes a table showing the year, quarter number, interest earned and the new principal.
The new principal is the amount at the end of the quarter
------------------------------------------------------------------------------------------------------------------------
Required:
        1. Complete the program by replacing each blank line by the appropriate
           expression/statement. (Filename: MidtermExercise3A.java)
        2. Modify the program by introducing the “for statement” where appropriate (e.g. for
           quarter= 1 to 4). (Filename: MidtermExercise3B.java)
------------------------------------------------------------------------------------------------------------------------
SAMPLE RUN:
Enter the year: 2005
Enter the initial principal: 10000.00
Principal: 10000.00
Annual Interest Rate: 5.00%
Year Quarter Interest Earned Amount at end of quarter
2005 1 125.00 10125.00
2005 2 126.56 10251.56
2005 3 128.14 10379.70
2005 4 129.75 10509.45
------------------------------------------------------------------------------------------------------------------------
Algorithm:
           1. Declare the necessary variables.
           2. Let annual interest rate be set to 0.05. (Note 5.00% = 0.05).
           3. Accept the year.
           4. Accept the initial principal.
           5. Display principal formatted with two digits after decimal point.
           6. Display annual interest rate in percent form.
           7. Display the column headings for the table.
           8. Compute the interest rate for a quarter.
           9. Let quarter be 1.
          10. Compute the interest earned for the first quarter
          11. Compute the new amount (amount at the end of the first quarter)
          12. Display the year, quarter, interest earned and balance at the end of 1st quarter
          13. Let quarter be 2
          14. Compute the interest earned for the second quarter
          15. Compute the new amount (amount at the end of the second quarter)
          16. Display the year, quarter, interest earned and balance at the end of 2nd quarter
          17. Let quarter be 3.
          18. Compute the interest earned for the third quarter
          19. Compute the new amount (amount at the end of the third quarter)
          20. Display the year, quarter, interest earned and balance at the end of 3rd quarter
          21. Let quarter be 4.
          22. Compute the interest earned for the fourth quarter
          23. Compute the new amount (amount at the end of the fourth quarter)
          24. Display the year, quarter, interest earned and balance at the end of 4th quarter
------------------------------------------------------------------------------------------------------------------------
*/

// Let the program for Midterm Exercise 3A start here

package midterm.exercises;

import java.io.*;
import java.util.*;

public class MidtermExercise3A {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float annualRate;
        float quarterlyRate;

        double principal;
        double interest;
        double finalAmount;

        byte quarter;
        int year;

        annualRate = 0.05F; // set annual interest to 5%
        System.out.print("Enter the year: ");
        year = Integer.parseInt(keyboard.nextLine()); // item 1
        System.out.print("Enter the initial principal: ");
        principal = Double.parseDouble(keyboard.nextLine()); //item 2
        System.out.printf("%s%.2f%n", "Principal = ",
                principal); // item 3
        System.out.printf("%s%.2f%c%n", "Interest Rate = ",
                annualRate * 100, '%');
        System.out.printf("%6s%8s%16s%30s%n", "Year", "Quarter",
                "Interest Earned",
                "Amount at end of quarter");
        quarterlyRate = annualRate / 4F; // item 4

        quarter = 1;
        interest = principal * quarterlyRate; // item 5
        finalAmount = principal + interest;
        System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);

        quarter = 2; // item 6
        interest = principal * quarterlyRate; // item 7
        finalAmount = principal + interest;
        System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
        principal = finalAmount;

        quarter = 3; // item 8
        interest = principal * quarterlyRate; // item 9
        finalAmount = principal + interest; // item 10
        System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
        principal = finalAmount; // item 11

        quarter = 4; // item 12
        interest = principal * quarterlyRate; // item 13
        finalAmount = principal + interest; // item 14
        System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);

        System.exit(0);

    } // end of the main method
} // end of the class