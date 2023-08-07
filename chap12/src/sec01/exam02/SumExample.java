package sec01.exam02;

import java.awt.Toolkit;

public class SumExample {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			i++;
			try {Thread.sleep(500); } catch(Exception e) {}
		}
		
		for (int i=2; i<=10; i++) {
			System.out.println(i);
			i++;
			try {Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
