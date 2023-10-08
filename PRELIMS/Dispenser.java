// The filename for the following source code must be Dispenser.java
/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : September-12-2022
 *Activity Name and Number: Prelim Exercise Number 7
------------------------------------------------------------------------------------------------------------------------
Problem:
           Write a program that will read the amount of money that will be withdrawn from an ATM (e.g. P500 or P1200)
then compute and output the least number of peso bills (P100 peso bills, P500 peso 
bills, P1000 peso bills) that will be dispensed by the machine for the requested amount. Determine also the
amount of money corresponding to each peso bill dispensed, the sum total of number of bills dispensed, and sum
total of amounts per denomination as shown below. Assume that enough bills are always available from the
machine. Assume further that the machine can only dispense P100 peso bills, P500 peso bills, and  P1000 peso bills.

Analysis:
Input:     Cash to be withdrawn
Processes:
           Reads the cash to be withdrawn, then compute and show the list of the number of peso bills (P100 peso bills,
           P500 peso bills, P1000 peso bills) that will be dispensed by the machine for the requested amount
           Breaks down the amount
           Shows quantity dispensed, amount, and total number of bills
Output:    quantity dispensed, amount, and total number of bills
------------------------------------------------------------------------------------------------------------------------
Algorithm:
          1. Read/Accept the cash to be withdrawn.
          2. Shows the number of 1000 peso bills that will be needed for the amount.
          3. Shows the number of 500 peso bills that will be needed for the amount.
          4. Shows the number of 100 peso bills that will be needed for the amount
          5. Shows the quantity of bills dispensed
          6. Shows amount and total number of bills
------------------------------------------------------------------------------------------------------------------------
*/


package prelim.exercises;
import java.lang.*;
import java.util.Scanner;

public class Dispenser {

    public static void main (String [] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter the amount to be withdrawn, whole number only: ");
        int cash = Integer.parseInt(kbd.nextLine());
        System.out.println();

        int thousand = cash / 1000;
        int less = thousand * 1000;

        int fiveh = cash - less;
        int fivehquantity = fiveh / 500;

        int thousanda = thousand * 1000;
        int fiveha = fivehquantity * 500;

        int mbq = less + fiveha;
        int hundred = cash - mbq;
        int hundredquantity = hundred / 100;
        int hundredamount = hundredquantity * 100;

        int billamount1 = thousand + fivehquantity + hundredquantity;

        System.out.println();
        System.out.println("PESO BILLS QUANTITY DISPENSED AMOUNT");

        System.out.printf("\n%-25s %25s %20s","===================" ,  "====================" , "===============");
        System.out.printf("\n%-25s %25s %20s", " PESO BILLS ", "QUANTITY DISPENSED","AMOUNT"    );
        System.out.printf("\n%-25s %25d %20d","  P1000  " ,  thousand , thousanda);
        System.out.printf("\n%-25s %25d %20d", "  P500  " ,fivehquantity ,fiveha );
        System.out.printf("\n%-25s %25d %20d", "  P100  " ,hundredquantity , hundredamount);
        System.out.printf("\n%-25s %25s %20s", "-------------------" , "------------------ " , "---------------");
        System.out.printf("\n%-25s %25d %20d", "TOTAL NUMBER OF BILLS:", billamount1  , + cash);

                kbd.close();
    }
}
