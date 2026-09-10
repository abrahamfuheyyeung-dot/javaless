


/* Purpose of this program:
 * This program takes as input the number of items that were bought for five
 * different types of items and prints a receipt for all the items bought,
 * including the sub total, tax, and total.
 *
 * Assignment:
 * Your job is to uncomment all the code that's enclosed in the comments. Some of the code
 * requires assignment and arithmetic operations. Some of the code has printf statements
 * that need to be fixed so that the console output looks pretty and similar to the example
 * console output shown in the comments section at the bottom of this program. Scroll all the
 * way down to see the example output. Before you submit your program, do 2 different test runs
 * that include both 1-digit and 2-digit quantities, and replace the example test run in the
 * comment section at the bottom of the program with your particular test runs.
 */ 
import java.util.Scanner;
public class Lab00PrintReceipt {

	// Declare constants to hold the Unit price (in dollars) of each type of item,
	// and set their values to be the given unit prices, per the assignment.
	static final double UP_TV  = 400.0;	// Unit Price for TV
	static final double UP_VCR = 220.0;	// Unit Price for VCR
	static final double UP_RC  = 35.20;	// Unit Price for Remote Controller
	static final double UP_CDP = 300.0;	// Unit Price for CD Player
	static final double UP_TR  = 150.0;	// Unit Price for Tape Recorder

	// Declare constants to hold the description of each type of item,
	// and set their values to the strings that represent their names.
	static final String TV  = "TV";
	static final String VCR = "VCR";
	static final String RC  = "Remote Controller";
	static final String CDP = "CD Player";
	static final String TR  = "Tape Recorder";

	// Declare constants to hold the decimal and percent values of the tax rate,
	// and set them to the tax rate specified in the assignment = 8.25%.
	static final double TAX_RATE = 0.0825F;					// tax rate in decimal
	static final double TAX_RATE_PERCENT = TAX_RATE * 100;	// tax rate in percent

	// Declare a variable of the Scanner class and invoke its constructor to create
	// an instance of the class; use it later to read input from the console.
	static Scanner scan1 = new Scanner(System.in);
	
	// the main program
	public static void main(String[] args) {
				
		// Declare int variables to track the quantity of various types of items
		// bought, and assign them the values that are read from the console.
		String enter = "Enter # of ";
		String sBought = "s bought: ";
		System.out.printf(enter + TV  + sBought);	// Prompt for TVs
		int qtyTV = scan1.nextInt();				// Read # of TVs bought
		System.out.printf(enter + VCR + sBought);	// Prompt for VCRs
		int qtyVCR = scan1.nextInt();				// Read # of VCRs bought
		System.out.printf(enter + RC  + sBought);	// Prompt for Remote Controllers
		int qtyRC = scan1.nextInt();				// Read # of Remote Controllers bought
		System.out.printf(enter + CDP + sBought);	// Prompt for # of CD Players
		int qtyCDP = scan1.nextInt();				// Read # of CD Players bought
		System.out.printf(enter + TR  + sBought);	// Prompt for Tape Recorders
		int qtyTR = scan1.nextInt();				// Read # of Tape Recorders bought

		System.out.printf("%n"); // Create some white space between the list of items and the totals.
		
		/* UPDATE THE REST OF YOUR SOLUTION BELOW THIS */

		// Declare variables to hold the total price of each type of item, and set each of their
		// values to be the product of the quantity and unit price of that type of item.
		// Fill in the blanks below to complete this section.
		
		double tpTV		= qtyTV * UP_TV;	// Total price for TVs
		double tpVCR	= qtyVCR * UP_VCR;	// Total price for VCRs
		double tpRC		= qtyRC * UP_RC;	// Total price for Remote Controllers
		double tpCDP	= qtyCDP * UP_CDP;	// Total price for CD Players
		double tpTR		= qtyTR * UP_TR;	// Total price for Tape Recorders

		

		// Print the header, showing the quantity of items bought, description, unit price, and total price
		// Add the correct arguments to the printf statement to complete this section.
		
		System.out.printf("    #   Description                            Unit Price        Total Price%n");
	
		System.out.printf("  ===   ===========                            ==========        ===========%n");
		
		// Print the quantity, description, unit price, and total price for each type of item purchased
		// Add the correct arguments to each printf statement to complete this section.
		
		System.out.printf("  %3d   %-20s                   %10.2f         %10.2f%n", qtyTV, TV, UP_TV, tpTV); // TVs
		System.out.printf("  %3d   %-20s                   %10.2f         %10.2f%n", qtyVCR, VCR, UP_VCR, tpVCR); // VCRs
		System.out.printf("  %3d   %-20s                   %10.2f         %10.2f%n", qtyRC, RC, UP_RC, tpRC); // Remote Controllers
		System.out.printf("  %3d   %-20s                   %10.2f         %10.2f%n", qtyCDP, CDP, UP_CDP, tpCDP); // CD Players
		System.out.printf("  %3d   %-20s                   %10.2f         %10.2f%n", qtyTR, TR, UP_TR, tpTR); // Tape Recorders

		// Add the correct argument to this printf statement to create a new line.
		System.out.println(); // Create some white space between the list of items and the totals.

		// Declare a variable to hold the sub total amount, and set its value to be
		// the sum of the total prices of all the items bought.
		// Fill in the blank to complete this section.
		
		double subTotal = tpTV + tpVCR + tpRC + tpCDP + tpTR;

		// Print the sub total.
		// Add the correct arguments to this printf statement to complete this section.
		
		System.out.printf("                    %37s         %10.2f%n", "Subtotal:", subTotal);
	
		
		// Declare a variable to hold the tax incurred, and set its value to be
		// the product of the sub total and the tax rate (in decimal).
	
		// Fill in the blank to complete this section.

		double tax = subTotal * TAX_RATE;
	

		// Print the tax on the sub total (also inform the customer about the tax rate percent).
		// Add the correct arguments to this printf statement to complete this section.
		System.out.printf("                                     %15s%.2f%s        %11.2f%n", "TAX @ ",TAX_RATE_PERCENT, "%", tax);
		
		

		// Declare a variable to hold the total amount after tax,
		// and set its value to be the sum of the sub total and the tax.
		// Fill in the blank to complete this section.
		double total = subTotal + tax;		
		
		// Print the total amount
		// Fill in the blank to complete this section.
		System.out.printf("                                            %13s         %10.2f%n", "Total:", total);
	}
	
}

/*

TEST RUN #1
===========
Enter # of TVs bought: 1
Enter # of VCRs bought: 2
Enter # of Remote Controllers bought: 3
Enter # of CD Players bought: 4
Enter # of Tape Recorders bought: 5

    #   Description                   Unit Price         Total Price
  ===   ===========                   ==========         ===========
    1   TV                                400.00              400.00
    2   VCR                               220.00              440.00
    3   Remote Controller                  35.20              105.60
    4   CD Player                         300.00            1,200.00
    5   Tape Recorder                     150.00              750.00

                                        SUBTOTAL            2,895.60
                                     TAX @ 8.25%              238.89
                                           TOTAL            3,134.49

TEST RUN #2
===========
Enter # of TVs bought: 11
Enter # of VCRs bought: 22
Enter # of Remote Controllers bought: 33
Enter # of CD Players bought: 44
Enter # of Tape Recorders bought: 55

    #   Description                   Unit Price         Total Price
  ===   ===========                   ==========         ===========
   11   TV                                400.00            4,400.00
   22   VCR                               220.00            4,840.00
   33   Remote Controller                  35.20            1,161.60
   44   CD Player                         300.00           13,200.00
   55   Tape Recorder                     150.00            8,250.00

                                        SUBTOTAL           31,851.60
                                     TAX @ 8.25%            2,627.76
                                           TOTAL           34,479.36

*/