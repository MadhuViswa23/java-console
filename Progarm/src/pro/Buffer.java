package pro;

public class Buffer {
	public static void main(String args[]){    
	StringBuffer str=new StringBuffer("welcome");
	System.out.println(str);
	System.out.println(str.append( "to" ));
	System.out.println(str.insert(5, "this"));
	System.out.println(str.delete(1,3));
	System.out.println(str.reverse());
	System.out.println(str.indexOf("1"));
	StringBuffer st=new StringBuffer("wel");
	System.out.println(st);
	System.out.println(st.replace(1,2, "cat"));
	String x = "10";
	String y = "20";
	System.out.println(x + y);
	String World = "world needs\"peace\"for";
	System.out.println( World);
	String W1 = "It\'s wierd";
	System.out.println( W1);
	String W2 = "The word  \\  is hurting";
	System.out.println( W2);
	System.out.println(Math.max(5,10));
	System.out.println(Math.min(5,10));
	String a = "   Madhu";
	System.out.println(a.trim());
	System.out.println(a.isEmpty());
	System.out.println(a.isBlank());
	System.out.println(a.substring(2,4));
	System.out.println(a.replace("no", "no"));
	}
}
