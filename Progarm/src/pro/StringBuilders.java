package pro;

public class StringBuilders {
	public static void main(String args[]){   
	StringBuilder stb = new StringBuilder ("hello");
	System.out.println(stb);
	System.out.println(stb.append("guys"));
	System.out.println(stb.indexOf("e"));
	System.out.println(stb.codePointCount(2,2));
	System.out.println(stb);
	System.out.println(stb.capacity());
	System.out.println(stb);
	}
}
