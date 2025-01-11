/*
Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___

*/

// Creating a class to calculate total price based on unit price and quantity
import java.util.Scanner;

class TotalPrice
{
    public static void main(String[] args)
	{
        //Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter the unit price and quantity
		//Creating double variables unitPrice and quantity to take user input
		
        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
		
		//Creating double totalPrice variable to indicate total price
        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the total price
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
