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
		System.out.println("카메라를 켭니다.");
	}
	void cameraOff() {
		System.out.println("카메라를 끕니다.");
	}
	
	String airPodstypeOn(String type) {
		String result = type + "를 연결하였습니다.";
		return result;
	}
	void airPodstypeOff(String type) {
		String result = type + "를 해제하였습니다.";
		System.out.println(result);
	}
	
}

