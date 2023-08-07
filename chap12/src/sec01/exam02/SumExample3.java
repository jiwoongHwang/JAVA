package sec01.exam02;

import java.awt.Toolkit;

public class SumExample3 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i=2; i<=10; i++) {
					try {Thread.sleep(600); } catch(Exception e) {}
					System.out.println(i);
					i++;				
			}
			}
		});
		thread.start();
		
		for (int i=1; i<=10; i++) {
			try {Thread.sleep(500); } catch(Exception e) {}
			System.out.println(i);
			i++;
		}
	}

}
