package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone("ȫ�浿");
		// �߻� Ŭ������ ���� ��ü ������ �ȵ�
		
		SmartPhone  smartPhone= new SmartPhone("ȫ�浿" , 1200000);
		
		smartPhone.turnOn();	// �߻� Ŭ������ �޼ҵ�
		smartPhone.internetSearch();	// ��ü �޼ҵ�
		smartPhone.turnOff();
	}

}
