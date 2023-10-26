package pro;

public class ArrayIndex {
public static void main(String args[]){
	
	try {
		int arr[] = new int[7];
		arr[6]= 12;
		arr[12]= 100;
	
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		System.out.println("This is array index out of bounds exception");
	}
	
}
}
