package sec01.exam05;

public class MyclassExample {

	public static void main(String[] args) {
		
		Myclass my1 = new Myclass();
		// ����Ʈ ������ ȣ�� (Television)
		my1.rc.turnOn();
		my1.rc.setVolume(7);
		
		
		Myclass my2 = new Myclass(new Television());
		// �Ű����� 1�� ������ ȣ��
		my2.rc.turnOn();
		my2.rc.setVolume(7);
		
		Myclass my3 = new Myclass(new Audio());
		// �Ű����� 1�� ������ ȣ��
		my3.rc.turnOn();
		my3.rc.setVolume(7);
		
		Myclass my4 = new Myclass();
		my4.methodA();
		// �Ű������� ���� �޼ҵ� ȣ�� (Audio ȣ��)
		
		Myclass my5 = new Myclass();
		my5.methodB(new Television());
		// �Ű������� �ִ� �޼ҵ� ȣ�� (Television ȣ��)
	}

}
