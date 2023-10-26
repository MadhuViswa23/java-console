package pro;

import java.util.Scanner;

public class Compare {
public static void main(String args[]) {
	
	Scanner my = new Scanner(System.in);
	System.out.println("Enter first Integer :");
int num1 = my.nextInt();
System.out.println("Enter first Integer :");
int num2 = my.nextInt();
//25 != 39                                                                          
//
//25 < 39                                                                           
//
//25 <= 39
System.out.println(num1 + " != " + num2);
System.out.println(num1 + " < " + num2);
System.out.println(num1 + " <= " + num2);
}
}
