package pro;

public class Task6Operation {
public static void main(String args[]) {
	int input1 = 125;
	int input2 = 24;
	System.out.println("Input first Number :" + input1);
	System.out.println("Input Second Number :" + input2);
	long sum, sub, mul, div, mod;
	 sum = input1 + input2;
    sub = input1 - input2;
	mul = input1 * input2;
	div = input1 / input2;
	mod = input1 % input2;
		
	
	System.out.println("Sum : 125 + 24 ="+ sum);
	System.out.println("Sub : 125 - 24 ="+ sub);
	System.out.println("Multiply : 125 * 24 ="+ mul);
	System.out.println("Division : 125 / 24 ="+ div);
	System.out.println("modulus : 125 mod 24 ="+ mod);
}

}
