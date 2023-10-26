package pro;
class Pens extends Thread {
    public void run() {
        System.out.println("You can use me for writing");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Use my pen");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Markers extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("You can hide the mistake by using me");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class GetThread {
    public static void main(String args[]) {
        Pens p1 = new Pens();
        Markers ma = new Markers();
        
       
        p1.setPriority(Thread.MAX_PRIORITY);
        ma.setPriority(Thread.MIN_PRIORITY);
        
      
        p1.setName("PenThread");
        ma.setName("MarkerThread");
        
        System.out.println("Pen thread priority: " + p1.getPriority());
        System.out.println("Marker thread priority: " + ma.getPriority());
        
        System.out.println("Pen thread name: " + p1.getName());
        System.out.println("Marker thread name: " + ma.getName());
        
        p1.start();
        ma.start();

        // Check if the threads are alive
        boolean p1IsAlive = p1.isAlive();
        boolean maIsAlive = ma.isAlive();

        System.out.println("Is Pen thread alive? " + p1IsAlive);
        System.out.println("Is Marker thread alive? " + maIsAlive);

        try {
            // Wait for both threads to finish
            p1.join();
            ma.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After both threads have finished
        p1IsAlive = p1.isAlive();
        maIsAlive = ma.isAlive();

        System.out.println("Is Pen thread still alive? " + p1IsAlive);
        System.out.println("Is Marker thread still alive? " + maIsAlive);

        // Thread IDs
        long p1Id = p1.getId();
        long maId = ma.getId();

        System.out.println("Pen thread ID: " + p1Id);
        System.out.println("Marker thread ID: " + maId);

        System.out.println("Main thread exiting.");
    }
}