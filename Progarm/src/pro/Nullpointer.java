package pro;

public class Nullpointer {
public static void main(String args[]) {
	try {
		string str = null;
		System.out.println(str.length);
	}
	catch(NullpointerException n) {
		System.out.println(n);
		
	}
}
}
