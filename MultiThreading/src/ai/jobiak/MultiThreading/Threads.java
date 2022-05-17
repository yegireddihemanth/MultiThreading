package ai.jobiak.MultiThreading;

public class Threads extends Thread{
	
	String name;
	public Threads(String name) {
		this.name=name;
	}
	public void run() {
		for(int i=1; i<=10; i++) {
		  
			 
			
		System.out.println(this.name + " # entered "+ i);
		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}
	
}
