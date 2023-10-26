package pro;
 import java.util.Scanner;
public class MulTask {

	public static void main (String args[]) {
//	
//		Scanner my = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//
//        int value = my.nextInt();
		
		int value = 8;
        System.out.println("The multiplication table of " + value + " is:");

        for (int i = 0; i <= 10; i++) {
            int result = value * i;
            System.out.printf("%d * %d = %d%n", value, i, result);
        }
	     
	   
	  
		}
	}

