package sec03.exam02;

public abstract class Animal {
	public String kind;		// ���� ����
	
	public void breathe() {		// �޼ҵ�
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound();		// �߻� �޼ҵ�
}