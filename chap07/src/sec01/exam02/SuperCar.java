package sec01.exam02;

public class SuperCar extends Car {
	int maxSpeed;
	String engine;
	
	public SuperCar(String model, String company, String engine) {
		super(model, company);
		this.engine = engine;
	}
	
	
}
