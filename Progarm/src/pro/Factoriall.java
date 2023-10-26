package pro;

import java.util.Scanner;

public class Factoriall {
public static void main(String arg[]) {
	Scanner myObject=new Scanner(System.in);
	System.out.println("enter the number");
	
	int value=myObject.nextInt();
	int factorial=1;
	for( int i=1;i<=value;i++) {
		factorial=factorial*i;
	}
	System.out.println("the factorial is:" + factorial);
}

}
