// The filename for the following source code must be AlingNenaStore.java
/*
 *Name: Ragudos, Hannah, T.
 *Programming Date : September-07-2022
 *Activity Name and Number: Prelim Exercise Number 6
------------------------------------------------------------------------------------------------------------------------
Problem:
        Write a Java program that will be used at the check-out counter of Aling Nena's Sari-Sari Store with the following
assumptions.
        Aling Nena's customers always buy only one type of product, but may buy one or more pieces of the
said product. For example, a customer may buy a dozen eggs.
        Depending on the customer, Aling Nena may decide to give the customer a discount, expressed as an
integer value from 1 to 100, which indicates the percentage deducted from the total amount of the customer's
purchase. For example, assuming that eggs cost P5.00 a piece, a dozen eggs would cost a total of P60.00, and if
the customer is then given a 10 percent discount, then the customer will have to pay only P54.00 for one dozen
of eggs. Customers who are not entitled to discounts are given zero (0) percent discount. Aling Nena's
customers always pay in cash, and the cash amount tendered is always greater than or equal to the total purchase
amount. Your program must calculate the change given to the customer.
Input:  Product
        Quantity
        Unit Price
        Discount
        Cash Tendered
Processes:
        Read the product, quantity, unit price, discount and cash tendered.
        Compute the purchased amount, total discount, amount to be paid, and the change.
        If the amount meets discount, the amount will be deducted.
        If the cash tendered is greater than the amount, then the change will be computed.
Output: circumference, area
------------------------------------------------------------------------------------------------------------------------
Algorithm:
1. Read/Accept the value of the Product
2. Read/Accept the value of the Quantity
3. Read/Accept the value of the Unit Price
4. Read/ Accept the value of the Discount
5. Read/ Accept the cash tindered
6. Compute the Total Amount of Purchase:
   amount = (eggs * quantitye) + (milk * quantitym) + (sardines * quantitys)
7. Compute the discount : discount = amount - (double) number
8. Compute the change : change = money - discount
9. Show the inputs and its values.
10. Show the cash
11. Show the total discount
12. Show the total amount of purchase
13. Show the total amount paid
14. Show the change.
------------------------------------------------------------------------------------------------------------------------
*/
// The program for begins here...

package prelim.exercises;

import java.lang.*;
import java.util.*;

public class AlingNenaStore {
    public static void main(String[] args) {

        // Make an object of Scanner that represents the keyboard
        Scanner kbd = new Scanner(System.in);
        Random rnd = new Random();
        double eggs = 11.00; // variable declaration and assignment of values
        double milk = 30.50; // variable declaration and assignment of values
        double sardines = 27.00; // variable declaration and assignment of values

        // Show the details of Aling Nena's Store
        System.out.println("****************************************************************");
        System.out.println("*                  Welcome to Aling Nena's Store!              *");
        System.out.println("*    The following are the available products at our store:    *");
        System.out.println("*                     Eggs - 5.00 Pesos each                   *");
        System.out.println("*                     Milk - 18.50 Pesos each                  *");
        System.out.println("*                     Sardines - 23.50 Pesos each              *");
        System.out.println("*    You can also get a discount price by purchasing these!    *");
        System.out.println("****************************************************************");
        System.out.println();
        System.out.println();

        // Let quantitye be the number of eggs you will buy.
        int quantitye;
        // Let quantitym be the number of eggs you will buy.
        int quantitym;
        // Let quantitys be the number of eggs you will buy.
        int quantitys;

        // Read the quantity of eggs. Print a prompt message
        System.out.println("Enter the quantity of eggs that you will be buying: ");
        // Assigns an integer entered through the keyboard to the quantity of eggs
        quantitye = Integer.parseInt(kbd.nextLine());

        // Read the quantity of milk. Print a prompt message
        System.out.println("Enter the quantity of milk that you will be buying: ");
        // Assigns an integer entered through the keyboard to the quantity of milk
        quantitym = Integer.parseInt(kbd.nextLine());

        // Read the quantity of sardines. Print a prompt message
        System.out.println("Enter the quantity of sardines that you will be buying: ");
        // Assigns an integer entered through the keyboard to the quantity of sardines
        quantitys = Integer.parseInt(kbd.nextLine());

        // Read the quantity of money. Print a prompt message
        System.out.println("Enter the amount of your money: ");

        double money; // variable declaration
        // Double is the proper type of the money that will be entered through the keyboard
        money = Double.parseDouble(kbd.nextLine());

        // To get the total amount of purchase:
        double amount = (eggs * quantitye) + (milk * quantitym) + (sardines * quantitys);

        // To get the discounted price:
        int number = rnd.nextInt(99);
        double discount = amount - (double) number;

        // To get the change:
        double change = money - discount;
        System.out.println();
        System.out.println();

        // The succeeding statements prints strings on the output screen
        System.out.println("************************************************************");
        System.out.println("*        Quantity of eggs: " + quantitye + "                ");
        System.out.println("*        Quantity of milk: " + quantitym + "                ");
        System.out.println("*        Quantity of sardines: " + quantitys + "            ");
        System.out.println("*        Your cash: " + money + "                            ");
        System.out.println("*        Total discount: " + (double) number + "            ");
        System.out.println("*        Total amount of purchase: " + amount + "      ");
        System.out.println("*        Total amount to be paid: " + discount + "          ");
        System.out.println("*        Your change: " + change+ "                         ");
        System.out.println("************************************************************");
        kbd.close();

    } //end of the main method
} //end of class


