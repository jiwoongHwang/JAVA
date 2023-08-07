package sec02.exam03;

public class HanKookTire extends Tire{
	
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HanKookTire ¼ö¸í : " + (maxRotation - accumulatedRotation) + "È¸");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ÆãÅ© ***");
			return false;
		}
	}
}
