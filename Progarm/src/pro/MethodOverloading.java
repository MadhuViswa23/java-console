package pro;

public class MethodOverloading {

	static int plusMethod(int x, int y) {
		return x+y;
	}
	static double plusMethodd(double a, double b ) {
		return a + b;
}
	static int plusMethod(int x, int y, int z) {
		return x+y+z;
}
	public static void main (String args[]) {
		int add = plusMethod(10,10);
	  double sub = plusMethodd(20,10);
	  double z = plusMethod(20,30,20);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(z);
	}
}