package sec02.exma03;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}

}