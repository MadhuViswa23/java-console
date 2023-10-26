package pro;

import java.util.Scanner;

public class Palindromee {
public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter");
	int num = input.nextInt();
   int on = num;
   int rs = 0;
   

      while (num != 0) {

	            int digit = num % 10;
	            rs = rs * 10 + digit;
	            num /= 10;
	        }

	        if (on == rs) {
	            System.out.println(on + " is a Palindrome Number.");
	        } else {
	            System.out.println(rs + " is not a Palindrome Number.");
//	        }
    }
    
    
    
}
}

