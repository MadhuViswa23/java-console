package pro;

class Java extends Thread {
  public void run() {
  System.out.println("Java is object oriented programming")	;	
  for(int i = 0; i<=5; i++) {
	  System.out.println("java is a backend");
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
  }
  
	}
}
class Html extends Thread {
	public void run() {
		System.out.println("html is a hyper text markup language");
		 for(int i = 0; i<=5; i++) {
			  System.out.println("html is a frontend");
			  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  }
	}
}




public class Multithreading {

	public static void main(String args[]) {
		
		Java jv = new Java();
		Html ht = new Html();
		jv.start();
		ht.start();
		

        jv.setPriority(Thread.MAX_PRIORITY);
      ht.setPriority(Thread.MIN_PRIORITY);
		
		//setting thread name
		jv.setName("Madhu");
		System.out.println("Java Thread Name :" + jv.getName());
		ht.setName("Viswa");
		System.out.println("Html Thread Name :" + ht.getName());
	}
}
