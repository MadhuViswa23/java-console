package pro;
import java.util.Scanner;
public class Scannerclass {


	    public static void main(String[] args) {
	        Scanner myObj = new Scanner(System.in);

	        System.out.println("Enter your First Name :");
	        String name = myObj.nextLine(); 
	        
	    
	        
	        System.out.println("Enter your Last Name :");
	        String last = myObj.nextLine(); 
	        
	        System.out.println("Enter your age:");
	        int age = myObj.nextInt();
	       
	        
	        
	        System.out.println("Enter your qualification :");
	        String qs = myObj.nextLine();
	        myObj.nextLine();
	       
	        System.out.println("Enter your cgpa :");
	        float cg = myObj.nextFloat();
	        myObj.nextLine(); 
	        
	        System.out.println("Enter your elective paper :");
	        String ep = myObj.nextLine();
	        
	       
	        
	        System.out.println("Enter your Address :");
	        String address = myObj.nextLine();
	        
	        
	        System.out.println("Enter your Location :");
	        String location = myObj.nextLine();
	        
	        
	        System.out.println("Enter your District :");
	        String district= myObj.nextLine();
	      
	        System.out.println("Enter Your pincode :");
	        long pincode = myObj.nextLong();
	        myObj.nextLine();
	        
	        System.out.println("Enter Your phone number :");
	        long phno = myObj.nextLong();
	        myObj.nextLine();
	     
	     
	       
	        
	        
	       
	        System.out.println("This is my biodata!!!");
	    }
	}


