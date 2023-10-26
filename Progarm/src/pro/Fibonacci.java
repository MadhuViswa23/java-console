package pro;

import java.util.Scanner;

public class Fibonacci {
	
	    public static void main(String[] args) {
	    	
	    	int n1 = 0, n2 = 1, i, n3, count = 10	`;
	        System.out.println(n1 + "" +n2);
	        for(i= 1; i<count; i++) {
	        	n3 = n1 + n2;
	        	n1 = n2;
	        	n2 = n3;
	        	System.out.println(n3+ "");
	        }
	    }
	}



