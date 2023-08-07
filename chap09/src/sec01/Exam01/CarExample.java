package sec01.Exam01;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		car.cost = 5000;
		car.speedUp(30);
		System.out.println(car.cost);
		System.out.println(car.speed);

		Car.OldCar oldcar = car.new OldCar();
		oldcar.cost = 3000;
		oldcar.speedUp(50);
		System.out.println(oldcar.cost);
		System.out.println(oldcar.speed);

		Car.Truck truck = new Car.Truck();
		truck.cost = 2500;
		truck.speedUp(100);
		System.out.println(truck.cost);
		System.out.println(truck.speed);

		oldcar.carCall();
	}

}
