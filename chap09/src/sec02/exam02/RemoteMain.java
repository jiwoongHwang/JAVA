package sec02.exam02;

public class RemoteMain {

	public static void main(String[] args) {
		Remote rm = new Remote();
		rm.rc.TurnOn();	//	익명 구현 객체 필드 사용
		rm.method1();	//	익명 구현 객체 메소드 내부 로컬 변수 사용
		
		//	매개변수로 익명 구현 객체 사용
		rm.method2(
				new RemoteControl() {
					
					@Override
					public void TurnOn() {
						System.out.println("스마트TV를 켭니다.");
					}
					
					@Override
					public void TurnOff() {
						System.out.println("스마트TV를 끕니다.");
					}
				}
				
		);

	}

}
