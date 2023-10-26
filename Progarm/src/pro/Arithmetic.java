package pro;

public class Arithmetic {
public static void main(String args[]) {

try {

	int num1 =77;
    int num2 =0;
	int output = num1 / num2;
	
	

}
catch(ArithmeticException ar){
	System.out.println(ar);
	System.out.println("hello ");
}
finally {
	System.out.println("finally runs automatically");
}
}
}
