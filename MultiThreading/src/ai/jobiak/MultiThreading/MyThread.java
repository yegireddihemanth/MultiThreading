package ai.jobiak.MultiThreading;

public class MyThread {
	
 
	public static void main(String[] args) {
		System.out.println("main started.....");
		
		Threads t1 = new Threads("hemanth");
		Threads t3 = new Threads("harish");
		
		Threads d1 = new Threads("deamon");
		
		t1.start();
		//t3.start();
		//d1.start();
		d1.setDaemon(false);
		
		d1.setPriority(5);
		d1.start();
		
		System.out.println("main ended...");

	}

}

