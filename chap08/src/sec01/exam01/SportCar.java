package sec01.exam01;

public class SportCar implements Car{

	private int speed;

	public void speedUp(int speed) {
		if (speed > Car.MAX_SPEED) {
			this.speed = Car.MAX_SPEED;
		} else {
			this.speed = speed;
		}
		System.out.println("스포츠카 현재 속도는 : " + this.speed);
	}

	public void speedDown(int speed) {
		if (speed < Car.MIN_SPEED) {
			this.speed = Car.MIN_SPEED;
		} else {
			this.speed = speed;
		} 
		System.out.println("스포츠카 현재 속도는 : " + this.speed);
	}
	
}
