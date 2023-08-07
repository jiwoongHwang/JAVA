package sec02.exam06;

public class TireExample {

	public static void main(String[] args) {
		SnowTire snow = new SnowTire();
		Tire tire = snow;
		System.out.println(snow.price);
		System.out.println(tire.price);
		
		snow.run();
		tire.run();
		
		Tire tire2 = new SnowTire();
		tire2.run();
		System.out.println(tire2.price);

	}

}
