package sec01.Exam01;

public class Car {
	String company;
	int speed;
	int cost;
	static String color;

	Car() {
		System.out.println("Car 호출");
	}

	class OldCar {
		int speed;
		int cost;

		OldCar() {
			System.out.println("OldCar 호출");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}

		void carCall() {
			// 인스턴스 내부 클래스의 메소드에서
			// 바깥 클래스의 필드와 메소드 접근 가능함 (정적 X)
			company = "현대";
			stop();
		}
	}

	static class Truck {
		static int speed;
		int cost;

		Truck() {
			System.out.println("Truck 호출");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}

		void carCall() {
			// 정적 클래스의 메소드에서
			// 바깥 클래스의 필드와 메소드 접근 안됨
			// company="현대";
			// stop();

			// 바깥 클래스의 static 필드와 메소드는 접근 가능함
			color = "빨강";
			stop2();
		}
	}

	void speedUp(int speed) {
		this.speed += speed;
	}

	void stop() {
		System.out.println("Car 멈춤");
	}

	static void stop2() {
		System.out.println("Car2 멈춤");
	}

}