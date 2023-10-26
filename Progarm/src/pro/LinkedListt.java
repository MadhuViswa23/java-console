package pro;
import java.util.*;
public class LinkedListt {
	  public static void main(String args[]) {
		  LinkedList<Integer> l = new LinkedList<>();
		  l.add(250);
		  l.add(200);
		  l.add(122);
		  System.out.println(l);
		  
		  Iterator<Integer> obj = l.iterator();
		  while(obj.hasNext()) {
			  System.out.println(obj.next());
		  }
		  
		 LinkedList<Object> li = new LinkedList<>();
	      li.add("cat");
	      li.add("dog");
	       li.add("duck");
	        System.out.println(li);
	        
	      
	        Iterator <Object> obje= li.iterator();
	        while(obje.hasNext()) {
	        	System.out.println(obje.next());
	        }
	  }
	  }

