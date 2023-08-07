package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		taxi Taxi = new taxi();
		
		bus.run();
		driver.drive(bus);
		driver.drive(Taxi);
	}

}
