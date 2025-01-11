/*
Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___

*/


// Creating a class to calculate discount and final fee
import java.util.Scanner;

class DiscountAdvance 
{
    public static void main(String[] args)
	{
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the fee
        System.out.print("Enter the student fee: ");
		
		//Creating double fee variable to take user input
        int fee = input.nextInt();

        // Prompt the user to enter the discount percentage		
        System.out.print("Enter the discount percentage: ");

		//Creating double discountPercent variable to take user input
        double discountPercent = input.nextDouble();
		
		// Creating int discount variables to indicate discount that student will get 
        // Calculate the discount amount using the formula (fee * discountPercent) / 100
        double discount = (fee * discountPercent) / 100.0;

		// Creating int discountFee variables to indicate discount Fee that student will have to pay 
        // Calculate the final discounted fee
        double discountedFee = fee - discount;

        // Display the discount amount and the final discounted fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
