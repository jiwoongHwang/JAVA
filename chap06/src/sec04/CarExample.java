package sec04;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.powerOn();
		
		int result1 = car.speedUp(30);
		System.out.println(result1);
		
		int result2 = car.speedUp(20);
		System.out.println(result2);
		
		int result3 = car.speedDown(70);
		System.out.println(result3);
		
		int result4 = car.breakZero();
		System.out.println(result4);

		car.powerOff();
	}

}
