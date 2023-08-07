package sec01.exam03;

import java.awt.Toolkit;

public class CarExample {

	public static void main(String[] args) {
		System.out.println("차가 출발합니다.");
		try {Thread.sleep(500); } catch(Exception e) {}
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i=50; i<=200; i++) {
					try {Thread.sleep(500); } catch(Exception e) {}
					System.out.println("현재속도 " +i+"km");
					i += 49;
			}
			}
		});
		thread.start();
		
		for(int i=0;i<4;i++) {
			try {Thread.sleep(500); } catch(Exception e) {}
			System.out.print("속도를 올립니다.");
		}
		try {Thread.sleep(500); } catch(Exception e) {}
		System.out.println("차가 멈춥니다.");
	}

}
