package sec01;

public class Computer {
	int year;
	String company;
	String price;
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void internet() {
		System.out.println("���ͳݿ� �����մϴ�.");
	}
	String gamename(String game) {
		String result = game + "�� �մϴ�.";
		return result;
	}
}
