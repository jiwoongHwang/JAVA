package sec01.exam03;

import java.awt.Toolkit;

public class CarExample {

	public static void main(String[] args) {
		System.out.println("���� ����մϴ�.");
		try {Thread.sleep(500); } catch(Exception e) {}
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i=50; i<=200; i++) {
					try {Thread.sleep(500); } catch(Exception e) {}
					System.out.println("����ӵ� " +i+"km");
					i += 49;
			}
			}
		});
		thread.start();
		
		for(int i=0;i<4;i++) {
			try {Thread.sleep(500); } catch(Exception e) {}
			System.out.print("�ӵ��� �ø��ϴ�.");
		}
		try {Thread.sleep(500); } catch(Exception e) {}
		System.out.println("���� ����ϴ�.");
	}

}
