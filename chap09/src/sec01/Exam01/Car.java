package sec01.Exam01;

public class Car {
	String company;
	int speed;
	int cost;
	static String color;

	Car() {
		System.out.println("Car ȣ��");
	}

	class OldCar {
		int speed;
		int cost;

		OldCar() {
			System.out.println("OldCar ȣ��");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}

		void carCall() {
			// �ν��Ͻ� ���� Ŭ������ �޼ҵ忡��
			// �ٱ� Ŭ������ �ʵ�� �޼ҵ� ���� ������ (���� X)
			company = "����";
			stop();
		}
	}

	static class Truck {
		static int speed;
		int cost;

		Truck() {
			System.out.println("Truck ȣ��");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}

		void carCall() {
			// ���� Ŭ������ �޼ҵ忡��
			// �ٱ� Ŭ������ �ʵ�� �޼ҵ� ���� �ȵ�
			// company="����";
			// stop();

			// �ٱ� Ŭ������ static �ʵ�� �޼ҵ�� ���� ������
			color = "����";
			stop2();
		}
	}

	void speedUp(int speed) {
		this.speed += speed;
	}

	void stop() {
		System.out.println("Car ����");
	}

	static void stop2() {
		System.out.println("Car2 ����");
	}

}