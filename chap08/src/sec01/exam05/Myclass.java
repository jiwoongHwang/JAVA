package sec01.exam05;

public class Myclass {
	
	// �ʵ�
	RemoteControl rc = new Television();
	
	// ����Ʈ ������
	// ����Ʈ ������ ȣ��� Television���� ������ �޼ҵ� ȣ��
	Myclass() {
		
	}
	
	// �������̽��� �Ű������� �ϴ� ������
	// �Ű����� ��ü�� �޼ҵ� ȣ��
	Myclass(RemoteControl rc) {
		this.rc=rc;
		rc.turnOn();		// Television���� ������ turnOn ȣ��
		rc.setVolume(5);	// Television���� ������ setVolume ȣ��
		rc.turnOff();		// Television���� ������ turnOff ȣ��
	}
	
	// Audio ��ü�� �޼ҵ� ȣ��
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
	// �Ű����� ��ü�� �޼ҵ� ȣ��
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}
