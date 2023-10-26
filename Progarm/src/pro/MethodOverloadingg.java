package pro;

public class MethodOverloadingg {
	static int plusMethod(int x, int y) {
		return x+y;
	}
static void plusMethod(double x, double y) {
	System.out.println(plusMethod(5,9));
}
public static void main (String args[]) {
	int add = plusMethod(10,10);
	System.out.println(add);
	
	
	double my = plusMethod(5,9);
	System.out.println(my);
}
}