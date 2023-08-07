package sec01.exam02;

import java.awt.Toolkit;

public class SumExample2 {

	public static void main(String[] args) {
		
		Runnable SumTask = new SumTask();
		Thread thread = new Thread(SumTask);
		thread.start();
		
		for (int i=1; i<=10; i++) {
			try {Thread.sleep(500); } catch(Exception e) {}
			System.out.println(i);
			i++;
		}
	}

}
