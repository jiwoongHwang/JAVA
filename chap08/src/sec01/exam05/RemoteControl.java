package sec01.exam05;

public interface RemoteControl {

	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 10;

//	public String NAME;
// 	��� �ʵ�� �ݵ�� �ʱⰪ�� �־�� ��
	public String NAME = "ȫ�浿";

	public void turnOn();

	public void turnOff();

	public void setVolume(int Volume);
//	�������̽� �޼ҵ�� �߻� �޼ҵ�� ������
}
