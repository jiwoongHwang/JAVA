package sec02.exam01;

public class Car2 {
	
	Car car = new Car() {
		int speed;

		void speedUp(int speed) {
			this.speed = speed;
			System.out.println("�ӵ� : " +speed);
		}
		
		@Override
		void stop() {
			System.out.println("�ڵ����� ����ϴ�.");
			speedUp(50);
		}
		
	};
	
	void speedDown() {
		Car downCar = new Car() {
			void down() {
				System.out.println("�ӵ��� ���߼��� !!");
			}
			@Override
			void stop() {
				System.out.println("���߼��� !!");
				down();
			}
			
		};
		downCar.stop();
	}
}
