package sec01;

public class Notebook extends Computer {
	String cpu;
	String graphics;
	String wifi;
	
	Notebook(int year , String cpu, String price){
		this.year = year;
		this.price = price;
		this.cpu = cpu;
	}
	void cameraOn() {
		System.out.println("ī�޶� �մϴ�.");
	}
	void cameraOff() {
		System.out.println("ī�޶� ���ϴ�.");
	}
	
	String airPodstypeOn(String type) {
		String result = type + "�� �����Ͽ����ϴ�.";
		return result;
	}
	void airPodstypeOff(String type) {
		String result = type + "�� �����Ͽ����ϴ�.";
		System.out.println(result);
	}
	
}

