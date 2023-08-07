package sec02.exam01;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i=0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(300);
				System.out.println("¶ò");
			} catch(InterruptedException e) {
				System.out.println("¿À·ù ¹ß»ý !");
			}
		}
	}

}
