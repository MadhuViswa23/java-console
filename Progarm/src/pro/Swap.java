package pro;

public class Swap {
	
		public static void main(String args[]) {
			int a= 5;
	        int b = 10;
	        System.out.println("before swapping: ");
	        System.out.println("The value of a: "+a);
	        System.out.println("The value of b: "+b);

	a= a + b;//a=5+10=15
	b= a - b;//b=15-10=5
	a= a - b;//a=15-5=10
	System.out.println("after swapping: ");
	System.out.println("The value of a: "+a);
	System.out.println("The value of b: "+b);


		}
	}

