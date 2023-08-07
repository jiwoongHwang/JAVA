package sec01.exam05;

// �������̽��� ��ø�� ������
public class SmartTelevision implements RemoteControl, Searchable{
	
	private int volume;
	
	// Searchable�� �߻� �޼ҵ��� ��ü �޼ҵ�
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
		
	}
	// RemoteControl�� �߻� �޼ҵ� 3���� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("����ƮTV�� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("����ƮTV�� ���ϴ�.");
	}

	public void setVolume(int Volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);

	}
	
}
