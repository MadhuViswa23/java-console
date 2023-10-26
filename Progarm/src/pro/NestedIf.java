package pro;
import java.util.Scanner;
public class NestedIf {



		
		public static void main(String[] args) {
	        Scanner myObj = new Scanner(System.in);
	        System.out.println("Enter your age:");
	        int age = myObj.nextInt();

	        System.out.println("Enter your weight :");
	        int weight = myObj.nextInt();

	        if (age >= 18) {
	            if (weight  >  55) {
	                System.out.println("You are eligible to donate");
	            } else {
	                System.out.println("You are  not eligible to donate, your weight is under 55.");
	            }
	        } else if (age < 18) {
	            System.out.println("You are not eligible below 18.");
	        }
		}
}

