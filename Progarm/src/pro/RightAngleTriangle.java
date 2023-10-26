package pro;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
       Scanner myObj = new Scanner(System.in);
       int i, j, row;
       System.out.println("Enter right angle traingle  that you want to display");
        row = myObj.nextInt();
    
       for( i = 1; i <=  row; i++)
       {
    	   for( j=1; j <= i; j++){
    		   System.out.print("*");
    		   
    	   }
           System.out.println();
       }

    }
}

