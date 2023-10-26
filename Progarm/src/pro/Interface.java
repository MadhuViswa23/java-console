package pro;

interface Software{
	void display();
}
interface Hardware{
	void display2();
}


public class Interface implements Software, Hardware {

	public void display() {
		System.out.println("This is hardware part");
	}
	
	public void display2() {
		System.out.println("This is software part");
	}
	
	public static void main(String args[]) {
		
		Interface i = new Interface();
		i.display();
		i.display2();
		
	}
	
	
}
