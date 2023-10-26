package pro;


public class RunnableInterface  implements Runnable{

	public void run() {
		for(int i = 0; i<=5; i++) {
			System.out.println("hello");
		}
	}
	
	public static void main(String args[]) {
		RunnableInterface r = new RunnableInterface ();
		Thread t = new Thread(r);
	
		t.start();
	}
}
