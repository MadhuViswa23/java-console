package pro;

public class StringIndex {
public static void main(String args[]) {

	
	try {
		  String s = "Hello";  
	      String substring = s.substring(2, 8);  
	}
	catch(StringIndexOutOfBoundsException s) {
		System.out.println(s);
		System.out.println("Sting index");
	}
		
}
}
