package sec02.practice;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();
		
		try { Thread.sleep(100);} catch (InterruptedException e) {}
		
		thread.interrupt();

	}

}
