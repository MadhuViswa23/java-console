package pro;
import java.util.Scanner;
public class Simpleif {
	

	
	  public static void main (String args[]) {
		  Scanner myObj = new Scanner(System.in);
	      System.out.println("Enter your unit:");
	      int unit = myObj.nextInt();
	      
	     // int currentUnit = 3;
	      
	      int billAmount = 3 * unit;
	      System.out.println("BillAmount: " + billAmount);
	      if (billAmount > 300) {
	    	  System.out.println("pay bill");
	      }
	      else {
	    	  System.out.println(" free current ");
	      }
		  
		  
	  }
	}

