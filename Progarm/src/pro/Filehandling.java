package pro;
 
import java.io.File;
import java.io.IOException;


 
public class Filehandling {
public static void main(String args[]) {
	try {
		File my = new File("D://Javva//task1");
		String Filename = my.getName();
		if(my.createNewFile()) {
			System.out.println("file created :" + my.getName());
		}
		else {
			System.out.println("file already exists");
		}
	}
	catch(IOException e){
		System.out.println("error  occured");
		e.printStackTrace();
	}
	
	
}
}



