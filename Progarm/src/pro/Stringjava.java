package pro;

public class Stringjava {

	public static void main(String args []) {
		
		StringBuffer str = new StringBuffer("Welcome");
		System.out.println(str);
		System.out.println(str.append("java"));
		System.out.println(str.insert(0, "hii "));
		  // Delete characters from index 2 (inclusive) to index 4 (exclusive)
		
		System.out.println(str.delete(2, 4));
		
		
		System.out.println(str.reverse());
		
		
		System.out.println(str.replace(1, 2, "ab"));
	
	// Replace characters from index 1 (inclusive) to index 2 (exclusive) with "ab"

		System.out.println(str.replace(0, 2, "hh"));
	
		System.out.println(str.length());
		System.out.println(str.indexOf("b"));
		System.out.println("char" + str.charAt(2));
		System.out.println(str.subSequence(0, 2));
		System.out.println(str.insert(2, "insert"));
		
		
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
		
		String myStr1 = "Hello";
		String myStr2 = "Hello";
		String myStr3 = "";
		System.out.println(myStr1.equals(myStr2));
		
		
		//System.out.println(myStr3.isEmpty());
		//System.out.println(myStr3.isBlank());
		System.out.println(myStr1.substring(0,5));
		
		 String myStr = "Hello, World! HH";

	        // Replace "HH" with "hh" in myStr1
	        myStr = myStr.replace("HH", "hh");

	        System.out.println(myStr); // Output: "Hello, World! hh"

	        String myplace = "hii";

	        System.out.println(myplace);
	        
	        String x ="10";
	        String y ="20";
	        
	        System.out.println(x+y);
	        
	        String world = "wordl";
	        System.out.println(world);
	        String w1 = "it\"is weild";
	        System.out.println(w1);
	        String w2 = "it\\is weild";
	        System.out.println(w2);
	        System.out.println(Math.min(5, 10));
	        
	}
}
