package sec02.exam06;

public class SnowTire extends Tire {
	int price=1000000;
	String brand;
	
	@Override
	public void run() {
		System.out.println("�����Ÿ�̾ �������ϴ�.");
	}
	
	public String stop(int x) {
		String result = "����� Ÿ�̾ ����ϴ�.";
		return result;
	}
	
}
