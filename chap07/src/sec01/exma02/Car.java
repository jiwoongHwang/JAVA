package sec01.exma02;

public class Car {

	public int speed;

	public void speedUp() {
		speed += 1;
	}

	public final void stop() {
		// final �޼ҵ�� �޼ҵ� �������̵��� �ȵ�
		System.out.println("���� ����");
		speed = 0;
	}
}
