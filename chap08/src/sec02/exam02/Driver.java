package sec02.exam02;

public class Driver {

	public void Drive(Vehicle vehicle) {
		vehicle.run();
		//vehicle.stop();
	}
	// �Ű������� �������̽� ��ü�� �޼ҵ�

	public static void main(String[] args) {
		Driver driver = new Driver();
		// Driver ��ü ����
		Bus bus = new Bus(); // Bus ��ü ����
		Taxi taxi = new Taxi(); // Taxi ��ü ����

		driver.Drive(bus);
		// bus ��ü�� �Ű������� �Ѱ���
		// bus Vehicle �������̽��� ���� ��ü�̹Ƿ�
		// Vehicle Ÿ������ �ڵ� ��ȯ�Ǿ� ��

		// driver.stop(bus); �����߻�
		// bus�� Vehicle Ÿ������ �ڵ� ��ȯ�Ǿ�
		// �������̵�� run�� ��밡�������� stop�� ��� �Ұ���

	}

}
