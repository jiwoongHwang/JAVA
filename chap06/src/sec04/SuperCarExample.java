package sec04;

public class SuperCarExample {

	public static void main(String[] args) {
		SuperCar myCar = new SuperCar();
		myCar.KeyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ� : " + speed + "Km/h");
		
	}

}
