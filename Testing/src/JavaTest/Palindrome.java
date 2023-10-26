package JavaTest;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		
	Scanner input = new Scanner (System.in);
	System.out.println("enter a string");
	String st = input.nextLine();
	
	String original = st.toLowerCase();
	String reverse = "";
	
	for(int i= (original.length() - 1); i>=0; i--) {
		reverse += original.charAt(i) ;
		
	}
	
	if(original.equals(reverse)) {
		System.out.println("pal");
	}
	else {
		System.out.println(" not pal");
	}
		
		
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter a number");
//		int num = scanner.nextInt();
//		
//		int original = num;
//		int reversed = 0;
//		 
//		while(num != 0) {
//			int digit = num% 10;
//			reversed = reversed*10 + digit;
//			num /= 10;
//			
//		}
//		if(original == reversed) {
//			System.out.println(original + "palindrome");
//		}
//		else {
//			System.out.println(original +"not a palindrome");
//		}
	}
}
