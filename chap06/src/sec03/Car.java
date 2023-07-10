package sec03;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;

	public Car() { // 기본생성자

	}

	public Car(String model, String color , int maxSpeed) { // 사용자 정의 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
