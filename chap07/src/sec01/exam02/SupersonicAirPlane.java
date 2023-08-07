package sec01.exam02;

public class SupersonicAirPlane extends AirPlane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// 정적 상수 2개 생성, 상수 이름은 관례가 대문자
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
	}
}
