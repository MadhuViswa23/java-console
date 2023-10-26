package pro;

public class Constructor {
	int strllno ;
	String name;
	double mark;
	
	public Constructor() {
	 strllno =13;
	 name = "Madhu";
	mark = 98;
		
	}
	
	//[parameter passing
  Constructor( int no, string data, double value ) {
	 strllno = no;
	  name = data;
	  mark = value;
	 System.out.println("called");
 }



public static void main(String args[]) {
	
	Constructor myObj = new Constructor();
	Constructor myObj1 = new Constructor();
	
	System.out.println(myObj1.strllno);
	System.out.println(myObj1.name);
	System.out.println(myObj1.mark);
	
	
}
}
