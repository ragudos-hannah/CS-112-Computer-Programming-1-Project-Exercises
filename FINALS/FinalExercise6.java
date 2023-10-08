/**
 Name:Ragudos, Hannah T.
 Course Code and Schedule: 9308 | MW 2:30-5:00 PM
 Date: November-16-2022
 ------------------------------------------------------------------------------------------------------------------------
 Problem:
        Write an improved version of the program below such that there are validation processes for the input values
 and that appropriate methods are used. The improved version should be named <FinalExercise6.java>. The improved program
 should have other methods aside from the main method. The following should be imposed:

        ✓ The product name should be the same as one of the product names contained in a given array of strings.
 (Hint: Store the names of the valid products in an array and apply the linear search algorithm to check if
 an input product is in the array)
        ✓ The quantity cannot be a negative number.
        ✓ The unit price must be greater than zero
        ✓ The discount rate cannot be negative and it cannot be more than 100 percent.
         ✓ The amount tendered cannot be lower than the amount to be paid.

        If an input value is invalid, the user should be given an appropriate error message and a directive to enter
 another value. The user may repeatedly supply an invalid value. The processing should continue only if the user
 enters a valid value.
 -----------------------------------------------------------------------------------------------------------------------
Algorithm:
        1. Declare the necessary variables
        2. Read / Accept the Product name
        3. Read / Accept the Quantity
        4. If Quantity < 0, repeat
        5. Read / Accept the Quantity
        6. Read the Unit Price
        7. If the Unit Price < 0, repeat
        8. Read / Accept the Unit Price
        9. Read / Accept the Discount
        10. If Discount < 0 and Discount > 100, repeat
        11. Read / Accept the Discount
        12. Compute total cost= uPrice * qty
        13. Compute discount= totalCost * (dRate / 100.0)
        14. Compute Discounted cost= totalCost - discount
        15. Read / Accept the cash tendered
        16. If cash tendered < amount to be paid. repeat
        17. Read / Accept thet cash tendered
        18. Show the Total amount
        19. Show the  discount
        20. Show the Amount to be paid
        21. Show the discounted amount
------------------------------------------------------------------------------------------------------------------------
        */



import java.util.Scanner;

public class FinalExercise6 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        double uPrice, totalCost, discount, discountedCost, amountTendered, change;
        int qty, dRate = 0;
        String pName = "";
        String[] product = {"Vinegar", "Water", "Softdrinks", "Bread", "Coffee"};
        int result = readProduct(product);
        if (result == -1)
            System.out.println("Please choose from the choices.");
        else
            System.out.println("You have selected " + product[result] + "");
        qty = readQty();
        uPrice = readPrice();
        dRate = readDisc(dRate);
        totalCost = uPrice * qty;
        discount = totalCost * (dRate / 100.0);
        discountedCost = totalCost - discount;
        amountTendered = readAmount(totalCost);
        change = amountTendered - discountedCost;
        System.out.printf("%-25s%12s%n", "----------------------","--------------");
        System.out.printf("%-25s%12.2f%n", "Total Purchase Amount: ", totalCost);
        System.out.printf("%-25s%12.2f%n", "Total Discount: ", discount);
        System.out.printf("%-25s%12.2f%n", "Amount to be Paid: ", discountedCost);
        System.out.printf("%-25s%12.2f%n", "change: ", change);
        System.exit(0);
    }
    /**
     * Reads and returns a name of the product from input device after seeing a prompt
       message.
     */
    public static int readProduct(String[] product) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Product: Pick from Vinegar, Water, Softdrinks, Bread, and Coffee: ");
        String pName = kbd.nextLine();
        int n = product.length;
        for (int i = 0; i < n; i++)
        {
            if (product [i].toLowerCase().equals(pName.toLowerCase()))
                return i;
        }
        return -1;
    }

    /**
     * Reads and returns quantity of the product from input device after seeing a prompt
     message.
     */
    public static int readQty () {
        int qty;
        System.out.print("Quantity: ");
        Scanner kbd = new Scanner(System.in);
        qty = Integer.parseInt(kbd.nextLine());
        if (qty < 0) {
            System.out.println("The quantity cannot be a negative number.");
        }
        return qty;
    }

    /**
     * Reads and returns unit price of the product from input device after seeing a prompt
     message.
     */
    public static double readPrice () {
        System.out.print("Unit Price: ");
        var kbd = new Scanner(System.in);
        double uPrice = Double.parseDouble(kbd.nextLine());
        if (uPrice < 0){
            System.out.println("The unit price must be greater than zero.");
        }
        return uPrice;
    }

    /**
     * Reads and returns a discount rate of the product from input device after seeing a prompt
     message.
     */
    public static int readDisc (int dRate) {
        System.out.print("Discount: ");
        Scanner kbd = new Scanner(System.in);
        dRate = Integer.parseInt(kbd.nextLine());
        if (dRate < 0 && dRate > 100){
            System.out.println("The discount cannot be negative or greater than 100.");
        }
        return dRate;
    }
    /**
     * Reads and returns Cash tendered from buying the product from input device after seeing a prompt
     message.
     */
    public static double readAmount (double totalCost) {
        System.out.print("Amount to be tendered: ");

        Scanner kbd = new Scanner(System.in);
        double amountTendered = Double.parseDouble(kbd.nextLine());
        if (amountTendered < totalCost){
            System.out.println("The amount tendered cannot be less than the total cost.");
        }
        return amountTendered;
    }

}
