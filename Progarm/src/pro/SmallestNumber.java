package pro;

import java.util.Scanner;

public class SmallestNumber {
public static void main(String arg[]) {
	Scanner myObject=new Scanner(System.in);
	
	System.out.println("Enter the number element");
	int value=myObject.nextInt();
	int array[]=new int [value];
	
	System.out.println("enter the no of elements");
	for(int i=0;i<value;i++) {
		array[i] =myObject.nextInt();
	}
	
	
	int smallest=array[0];
	for(int i=0;i>value;i++) {
		if(array[i]>smallest) {
			smallest=array[i];
		}
	}
	System.out.println("the smallest araay is " + smallest);
	
	
}

}
