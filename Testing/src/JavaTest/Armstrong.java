package JavaTest;

import java.util.Scanner;

public class Armstrong {
public static void main(String args[]) {

	        Scanner myObj = new Scanner(System.in);

	        int a[][] = new int[3][3];
	        int b[][] = new int[3][3];
	        int c[][] = new int[3][3];

	        System.out.println("Enter elements for the first matrix:");
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
	                a[i][j] = myObj.nextInt();
	            }
	        }

	        System.out.println("Enter elements for the second matrix:");
	        for (int i = 0; i < b.length; i++) {
	            for (int j = 0; j < b[i].length; j++) {
	                b[i][j] = myObj.nextInt();
	            }
	        }

	        System.out.println("Matrix addition result (c):");
	        for (int i = 0; i < c.length; i++) {
	            for (int j = 0; j < c[i].length; j++) {
	                c[i][j] = a[i][j] + b[i][j];
	                System.out.print(c[i][j] + " ");
	            }
	            System.out.println(); // Move to the next row
	        }
	    
	

	//primenumbers
	
//	Scanner input = new Scanner(System.in);
//	System.out.println("prime numbers");
//	int n = input.nextInt();
//	
//	if(isPrime(n))
//	{
//		System.out.println(n+ "prime");
//	}
//	else {
//		System.out.println("not prime");
//	}
//}
//	private static boolean isPrime(int n) {
//		if(n<=1) {
//		return false;
//		}
//		for(int i =2; i<= Math.sqrt(n); i++) {
//			if(n % i ==0) {
//				return false;
//			}
//		}
//		return true;
//	
		
	
	
	
	
//int  arr[] = {1,2,3,4};
//int smallest = arr[0];
//for(int i = 1; i <arr.length; i++) {
//	if(arr[i] < smallest) {
//		smallest = arr[i];
//		
//	}
//	
//}
//System.out.println(smallest);
//	int i=1,a,arm,n;
//	System.out.println("Armstrong numbers");
//	while(i<500)
//	{
//	n=i;
//	arm=0;
//	while(n>0)
//	{
//		a=n%10;
//		arm=arm+(a*a*a);
//		n=n/10;
//	}
//	if(arm==i)
//		System.out.println(i);
//	i++;
//
//}
}




}


