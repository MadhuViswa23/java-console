package pro;

public class NumberFormat {
public static void main(String args[]) {
	try {
		String name = "Hundred";
		   int num = Integer.parseInt(name);
		   System.out.println(num);
	}
	catch(NumberFormatException n) {
		System.out.println(n);
		System.out.println("number format exception handled");
	}
}
}
