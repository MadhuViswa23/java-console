//package pro;
//import java.util.Scanner;
//
//public class Comparee {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Input first integer: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Input second integer: ");
//        int num2 = scanner.nextInt();
//
//      
//        boolean isEqual = num1 == num2;
//        boolean isLessThan = num1 < num2;
//        boolean isLessThanOrEqual = num1 <= num2;
//
//        System.out.println(num1 + " != " + num2);
//        System.out.println(num1 + " < " + num2);
//        System.out.println(num1 + " <= " + num2);
//
//       
//    }
//}
package pro;
import java.util.Scanner;

public class Comparee {
	
	
	
	

	    public static void main(String[] args) {
	        System.out.println("Divided by 3:");
	        for (int i = 1; i <= 100; i++) {
	            if (i % 3 == 0) {
	                System.out.print(i + ", ");
	            }
	        }
	        System.out.println("\n");

	        System.out.println("Divided by 5:");
	        for (int i = 1; i <= 100; i++) {
	            if (i % 5 == 0) {
	                System.out.print(i + ", ");
	            }
	        }
	        System.out.println("\n");

	        System.out.println("Divided by 3 & 5:");
	        for (int i = 1; i <= 100; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.print(i + ", ");
	            }
	        }
	    }
}