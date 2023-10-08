/**
 Name:Ragudos, Hannah T.
 Course Code and Schedule: 9308 | MW 2:30-5:00 PM
 Date: November-09-2022
 ------------------------------------------------------------------------------------------------------------------------
 Problem:
        Complete the following program by providing the missing keywords, expressions or statements so that the
     program will solve the given problem. The missed keywords, expressions or statements are identified as No. 1,
    No. 2, ..., No. 5. . Verify the correctness of your answers by encoding and testing the completed program.
        When completed, the following program computes the tax amount corresponding to a given taxable
    income. The tax due is determined based on the following table:
        If taxable income is then tax due is
            <= 25,000.00                                    4,000.00
            > 25,000.00 but <= 125,000.00                   4,000.00 + 8% (taxable income - 25,000.00)
            > 125,000.00 but <= 525,000.00                  12,000.00 + 10% (taxable income - 125,000.00)
             > 525,000.00                                   52,000.00 + 12% (taxable income - 525,000.00)

 -----------------------------------------------------------------------------------------------------------------------
 Algorithm:
            1. Introduce the application
            2. Declare double variable for tax income
            3.  Read tax income
            4. While income < 0 return tax income
            5. Create determineBracket method
            6. Declare int variable for bracket
            7. If taxable income is then bracket is
                    <= 25,000.00                                1
                    > 25,000.00 but <= 125,000.00               2
                    > 125,000.00 but <= 525,000.00              3
                    > 525,000.00                                4
            8. Return Bracket
            9. Create computeTaxDue method
           10. Declare double variable for tax due
           11. If bracket of income is then tax due is
                    1                                           4,000.00
                    2                                           4,000.00 + 8% (taxable income - 25,000.00)
                    3                                           12,000.00 + 10% (taxable income - 125,000.00)
                    4                                           52,000.00 + 12% (taxable income - 525,000.00)
           12. Show the Taxable Income and the Tax due

 */

package finals.exercises;

import java.util.*;
public class ModularizedTaxationProgram {
    public static void main(String[] args) {
        double taxableIncome;
        double taxDue;
        // Introduce the program by invoking the showIntroduction method
        showIntroduction();
        // Read the taxable income from the keyboard by invoking the readTaxableIncome method
        taxableIncome = readTaxableIncome();
        // Compute the tax due by invoking the computeTaxDue method
        taxDue = computeTaxDue(determineBracket(taxableIncome), taxableIncome );
        // Show the taxable income by invoking the showResults method
        showResults(taxableIncome, taxDue);
        System.exit(0);
    }// end of main method
    /**
     *shows statements that introduce the application on the output screen
     */
    public static void showIntroduction() { // ITEM 1
        System.out.println("Hypothetical Tax Computation Program");
        System.out.println("------------------------------------");
        System.out.println("This program is for the computation of the tax due  from a taxpayer " + "with a known taxable income.");
                System.out.println();
    }// end of showIntroduction method
    /**
     * returns a taxable income amount read from the keyboard
     */
    public static double readTaxableIncome() { // ITEM 2
        Scanner input = new Scanner(System.in);
        double income = 0.0;
        do {
            System.out.print("Enter the taxable income: ");
            income = Double.parseDouble(input.nextLine());
        } while (income < 0);
        return income; // ITEM 3
    } // end of readTaxableIncome method

    /**
     returns the bracket corresponding to a given taxable income based on the
     following rule
     If taxable income is then bracket is
     <= 25,000.00 1
     > 25,000.00 but <= 125,000.00 2
     > 125,000.00 but <= 525,000.00 3
     > 525,000.00 4
     */
    public static int determineBracket(double taxableIncome) { // ITEM 4
        int bracket = 0;
        if (taxableIncome <= 25000.00)
            bracket = 1;
        else
        if (taxableIncome <= 125000.00)
            bracket = 2;
        else
        if (taxableIncome <= 525000.00)
            bracket = 3;
        else
            bracket = 4;
        return bracket;
    } // end of determineBracket method
    /**
     * returns the tax amount due corresponding to a given pair of bracket and
     taxable income
     based on the following rule
     If bracket of income is then tax due is
                 1           4,000.00
                 2           4,000.00 + 8% (taxable income - 25,000.00)
                 3           12,000.00 + 10% (taxable income - 125,000.00)
                 4           52,000.00 + 12% (taxable income - 525,000.00)
     */
    public static double computeTaxDue(int bracket, double taxableIncome) { //ITEM 5
        double taxDue = 0.0;
        switch (bracket) {
            case 1: taxDue = 4000.00;
                break;
            case 2: taxDue = 4000.00 + (taxableIncome - 25000.00) * 0.08;
                break;
            case 3: taxDue = 12000.00 + (taxableIncome - 125000.00) * 0.10;
                break;
            case 4: taxDue = 52000.00 + (taxableIncome - 525000.00) * 0.12;
                break;
            default: taxDue = 0.00;
        }
        return taxDue; // ITEM 6
    }// end of computeTaxDue method
/**
 * displays a given taxable income and the corresponding tax amount on the
 output screen
 */

public static void showResults(double taxableIncome, double taxDue) {
// ITEM 7
    System.out.println();
    System.out.printf("%-20s%15.2f%n","Taxable Income: ",taxableIncome);
    System.out.printf("%-20s%15.2f%n", "Tax Due = ", taxDue);

}// end of showResults method

} // end of ModularizedTaxationProgram class