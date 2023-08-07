package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone("홍길동");
		// 추상 클래스는 직접 객체 생성이 안됨
		
		SmartPhone  smartPhone= new SmartPhone("홍길동" , 1200000);
		
		smartPhone.turnOn();	// 추상 클래스의 메소드
		smartPhone.internetSearch();	// 객체 메소드
		smartPhone.turnOff();
	}

}
