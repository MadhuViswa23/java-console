package JavaTest;

import java.util.Scanner;

public class Factoriaal {
public static void main(String args[]) {
	
	Scanner input =new Scanner(System.in);
	System.out.println("enter");
	int h = input.nextInt();
	int fact = 1;
	for(int i=1; i<h; i++) {
		fact = fact * i;
		System.out.println(fact+ "");
	}
}
}
