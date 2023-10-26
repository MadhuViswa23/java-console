package pro;
import java.util.Scanner;
public class ElseIfLadder {

   public static void main(String[] args) {
		        Scanner myObj = new Scanner(System.in);
		        System.out.println("Enter Suntiming:");
		        double sunTiming = myObj.nextDouble();
		      

		        if (sunTiming >= 6 && sunTiming < 11) {
		            System.out.println("Morning");
		           
		        } else if 
		        (sunTiming > 11 && sunTiming <= 12) {
		         
		            System.out.println(" afternoon");
		        } else if (sunTiming >= 3 && sunTiming <= 5) {
		            System.out.println("Evening");
		        
		        }  else {
		            System.out.println("Nighttime");
		        }
		    }
		}

