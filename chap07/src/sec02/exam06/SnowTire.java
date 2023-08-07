package sec02.exam06;

public class SnowTire extends Tire {
	int price=1000000;
	String brand;
	
	@Override
	public void run() {
		System.out.println("스노우타이어가 굴러갑니다.");
	}
	
	public String stop(int x) {
		String result = "스노우 타이어가 멈춥니다.";
		return result;
	}
	
}
