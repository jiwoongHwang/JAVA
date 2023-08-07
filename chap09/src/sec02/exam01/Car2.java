package sec02.exam01;

public class Car2 {
	
	Car car = new Car() {
		int speed;

		void speedUp(int speed) {
			this.speed = speed;
			System.out.println("속도 : " +speed);
		}
		
		@Override
		void stop() {
			System.out.println("자동차가 멈춥니다.");
			speedUp(50);
		}
		
	};
	
	void speedDown() {
		Car downCar = new Car() {
			void down() {
				System.out.println("속도를 낮추세요 !!");
			}
			@Override
			void stop() {
				System.out.println("멈추세요 !!");
				down();
			}
			
		};
		downCar.stop();
	}
}
