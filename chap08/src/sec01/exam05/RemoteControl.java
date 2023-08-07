package sec01.exam05;

public interface RemoteControl {

	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 10;

//	public String NAME;
// 	상수 필드는 반드시 초기값을 넣어야 함
	public String NAME = "홍길동";

	public void turnOn();

	public void turnOff();

	public void setVolume(int Volume);
//	인터페이스 메소드는 추상 메소드로 구현함
}
