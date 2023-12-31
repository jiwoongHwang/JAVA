package sec01.exam05;

// 인터페이스를 중첩을 구현함
public class SmartTelevision implements RemoteControl, Searchable{
	
	private int volume;
	
	// Searchable의 추상 메소드의 실체 메소드
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}
	// RemoteControl의 추상 메소드 3개의 실체 메소드
	public void turnOn() {
		System.out.println("스마트TV를 켭니다.");
	}

	public void turnOff() {
		System.out.println("스마트TV를 끕니다.");
	}

	public void setVolume(int Volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);

	}
	
}
