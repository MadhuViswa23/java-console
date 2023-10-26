package pro;
import java.util.*;
public class Arrayy {

	    public static void main(String args[]) {
	        ArrayList<Integer> myArr = new ArrayList<>();
	        myArr.add(300);
	        myArr.add(200);
	        myArr.add(300);
	        System.out.println(myArr);
	        ArrayList<String> myArr1 = new ArrayList<>();
	        myArr1.add("Madhu");
	        myArr1.add("Viswa");
	        myArr1.add("Madhu");
	        System.out.println(myArr1);
	        ArrayList<Object> myArr2 = new ArrayList<>();
	        myArr2.add("hi");
	        myArr2.add("hello");
	        myArr2.add("iam");
	        myArr2.add("madhu");
	        System.out.println(myArr2);
	        System.out.println(myArr2.size());
	        System.out.println(myArr2.remove(0));
	        System.out.println(myArr2.get(2));
	        System.out.println(myArr2.set(0, "Rani"));
	        System.out.println(myArr2);
	      //iteration for string  
	        ArrayList<String> str = new ArrayList<>();
	    str.add("apple");
	      str.add("mango");
	      str.add("gapes");
	        System.out.println(str);
	        Iterator <String> st= str.iterator();
	        while(st.hasNext()) {
	        	System.out.println(st.next());
	        }
	        //iteration for object  
	        ArrayList<Object> o = new ArrayList<>();
		      o.add("cat");
		      o.add("dog");
		       o.add("duck");
		        System.out.println(o);
		        
		      
		        Iterator <Object> obj= o.iterator();
		        while(obj.hasNext()) {
		        	System.out.println(obj.next());
		        }
	    }
	}

