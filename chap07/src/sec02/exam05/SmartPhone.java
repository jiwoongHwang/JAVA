package sec02.exam05;

public class SmartPhone extends Phone {
	boolean touch;
	String Camera;
	String Phonecase;
	String ProtectedFilm;
	int cost=200000;
	
	@Override
	void ring() {
		System.out.println("����Ʈ���� �︳�ϴ�.");
	}
	
	void videoOn() {
		System.out.println("�������� �Կ��մϴ�.");
	}
	
	
}