package sec01.exam02;

import java.awt.Toolkit;

public class SumTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=2; i<=10; i++) {
			try {Thread.sleep(600); } catch(Exception e) {}
			System.out.println(i);
			i++;
		}
	}

}


