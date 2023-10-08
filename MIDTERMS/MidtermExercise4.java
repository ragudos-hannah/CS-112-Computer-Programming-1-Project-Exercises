/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : October-19-2022
 *Activity Name and Number: Midterm Exercise 4
------------------------------------------------------------------------------------------------------------------------
Required:
        Write an improved version of the program that will provide validation processes for the input
        values. The following should be imposed: (Filename: MidtermExercise4.java)
              ✓ The valid product names should be limited to only 5 product names ( e.g. “pen”, “pencil”,
                “short bond paper”, “long bond paper”, “pad paper”)
              ✓ The quantity cannot be a negative number.
              ✓ The unit price must be greater than zero
              ✓ The discount rate cannot be negative and it cannot be more than 100 percent.
              ✓ The amount tendered cannot be lower than the amount to be paid.
------------------------------------------------------------------------------------------------------------------------
Analysis:
         Inputs: Quantity, Unit Price, Discount, Cash Tendered
         Processes:
             1. Accept user input
             2. Compute for the total cost
             3. Compute for the discount
             4. Compute for the amount to be paid
             5. Read amount tendered
             6. Compute for the change
         Outputs: total purchase amount, discount, amount to be paid, change
------------------------------------------------------------------------------------------------------------------------
Algorithm:
             1. Read product name
             2. Read quantity
             3. Read unit price
             4. Read discount rate
             5. Compute for the total cost using the expression: totalcost = unitprice * quantity
             6. Compute for the discount using the expression: discount = totalCost * (dRate / 100.0)
             7. Compute for the amount to be paid using the expression: discountedCost = totalCost - discount
             8. Read amount tendered
             9. Display total purchase amount, discount, amount to be paid and change
 */

// Let the program for Midterm Exercise 4 start here

package midterm.exercises;

import java.util.Scanner;

public class MidtermExercise4 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        String productName = " ";
        double unitPrice, totalCost, discount, discountedCost, amountTendered, change;
        int quantity, discountRate;

        System.out.print("Product: ");
        productName = kbd.nextLine();

        do {
            System.out.print("Quantity: ");
            quantity = Integer.parseInt(kbd.nextLine());
            if (quantity < 0)
                System.out.println("Quantity cannot be a negative number.");
        } while (quantity < 0);

        do {
            System.out.print("Unit price: ");
            unitPrice = Double.parseDouble(kbd.nextLine());
            if (unitPrice <= 0)
                System.out.println("Unit price must be greater than zero.");
        } while (unitPrice <= 0);

        do {
            System.out.print("Discount: ");
            discountRate = Integer.parseInt(kbd.nextLine());
            if (discountRate < 0)
                System.out.println("Discount rate should not be negative.");
            else if (discountRate > 100)
                System.out.println("Discount rate should not be greater than 100.");
        } while (discountRate < 0 || discountRate > 100);
        totalCost = unitPrice * quantity;
        discount = totalCost * (discountRate / 100.0);
        discountedCost = totalCost - discount;

        do {
            System.out.print("Cash tendered: ");
            amountTendered = Double.parseDouble(kbd.nextLine());
            if (amountTendered < discountedCost)
                System.out.println("Cash tendered cannot be lower than the amount to be paid.");
        } while (amountTendered < discountedCost);
        change = amountTendered - discountedCost;

        System.out.printf("%-25s%12s%n", "----------------------", "--------------");
        System.out.printf("%-25s%12.2f%n", "Total Purchase Amount: ", totalCost);
        System.out.printf("%-25s%12.2f%n", "Total Discount: ", discount);
        System.out.printf("%-25s%12.2f%n", "Amount to be Paid: ", discountedCost);
        System.out.printf("%-25s%12.2f%n", "Change: ", change);

        System.exit(0);

    } // end of method main
} // end of class MidtermExercise4
