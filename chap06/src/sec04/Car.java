package sec04;

public class Car {
	private int speed = 100;

	void powerOn() {
		System.out.println("시동을 걸었습니다.");
	}

	void powerOff() {
		System.out.println("시동을 껐습니다.");
	}

	int speedUp(int x) {
		speed += x;
		return speed;
	}

	int speedDown(int x) {
		speed -= x;
		return speed;
	}

	public int breakZero() {
		speed = 0;
		return speed;
	}
}
