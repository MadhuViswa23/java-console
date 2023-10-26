package pro;

public class NarrowingCasting {
public static void main(String args[]) {
	
	
	double doubleValue = 11.5;
	float floatValue = (float) doubleValue;
	 
	
	long longValue = (long) floatValue;
	
	
	
	int intValue = (int) longValue;
	
	
	
	System.out.println("DoubleValue" + doubleValue);
	System.out.println("FloatValue "+ floatValue);
	System.out.println("longValue "+ longValue);
	System.out.println("intValue "+ intValue);
}
}
