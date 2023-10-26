package pro;
import java.util.Scanner;
public class palindrome {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String originalString = input.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
	        String reversedString = "";

	        for (int i = originalString.length() - 1; i >= 0; i--) {
	            reversedString += originalString.charAt(i);
	        }

	        if (originalString.equals(reversedString)) {
	            System.out.println(input + " is a Palindrome String.");
	        } else {
	            System.out.println(input + " is not a Palindrome String.");
	        }
//	        Scanner scanner = new Scanner(System.in);
//
//	        System.out.print("Enter a number: ");
//	        int num = scanner.nextInt();
//	      
//	        int originalNum = num;
//	        int reversedNum = 0;
//
//	        while (num != 0) {
//	            int digit = num % 10;
//	            reversedNum = reversedNum * 10 + digit;
//	            num /= 10;
//	        }
//
//	        if (originalNum == reversedNum) {
//	            System.out.println(originalNum + " is a Palindrome Number.");
//	        } else {
//	            System.out.println(originalNum + " is not a Palindrome Number.");
//	        }
	    }
	}





