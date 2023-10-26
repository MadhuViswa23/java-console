package pro;

import java.util.Scanner;

	public class Example {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows for the pyramids: ");
	        int numRows = scanner.nextInt();

	        // First pyramid
	        for (int i = 1; i <= numRows; i++) {
	            // Print spaces for the left pyramid
	            for (int j = 1; j <= numRows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print asterisks for the left pyramid
	            for (int k = 1; k <= i * 2 - 1; k++) {
	                System.out.print("*");
	            }

	            // Print spaces between the pyramids
	            System.out.print(" ");

	            // Print asterisks for the right pyramid
	            for (int k = 1; k <= i * 2 - 1; k++) {
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }

	        scanner.close();
	    }
	}


