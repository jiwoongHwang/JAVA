package sec01;

public class Computer {
	int year;
	String company;
	String price;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	String gamename(String game) {
		String result = game + "를 합니다.";
		return result;
	}
}
