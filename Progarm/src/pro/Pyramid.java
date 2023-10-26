package pro;

import java.util.Scanner;

public class Pyramid {


	
	    public static void main(String[] args) {
	        Scanner p = new Scanner(System.in);
	        System.out.println("enter pyramid number that u want to display");
	        int rows = p.nextInt();
	     // Corrected variable name to "rows"

	        int k = 0;

	        for (int i = 1; i <= rows; ++i, k = 0) {
	            for (int space = 1; space <= rows - i; ++space) {
	                System.out.print("  ");
	            }

	            while (k != 2 * i - 1) {
	                System.out.print("* ");
	                ++k;
	            }

	            System.out.println();
	        }
	    }
	}

