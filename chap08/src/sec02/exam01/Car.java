package sec02.exam01;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRighftTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	// Tire �������̽��� �ڵ� ��ȯ �Ǿ�����
	// �������̵�� roll �޼ҵ�� ������ �Ѿ
	
	void run() {
		frontLeftTire.roll();
		frontRighftTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.run();
	}
}
