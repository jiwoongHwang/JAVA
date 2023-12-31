package sec02.exam03;

public class Tire {

	// 멤버 필드
	public int maxRotation; // 최대 회전수
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어 위치

	// 매개변수 2개 생성자
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	// 메소드 매개변수 X, 리턴타입 boolean
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}

}
