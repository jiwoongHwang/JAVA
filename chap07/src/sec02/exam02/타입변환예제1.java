package sec02.exam02;

public class Ÿ�Ժ�ȯ����1 {

	public static void main(String[] args) {
		Car car = new Car();
		Sedan sedan = new Sedan();
		Sonata sonata = new Sonata();
		
		Car car2 = sedan;	
		//	sedan Ŭ���� Ÿ���� Car Ŭ������ �ڽ� Ŭ�����̹Ƿ�
		//	sedan Ŭ���� Ÿ���� Car Ŭ���� Ÿ������ �ڵ� ��ȯ��
		
		Car car3 = sonata;
		//	sonata Ŭ���� Ÿ���� Car Ŭ������ �ڽ� Ŭ�����̹Ƿ�
		//	sonata Ŭ���� Ÿ���� Car Ŭ���� Ÿ������ �ڵ� ��ȯ��
		
		//	Truck truck = sonata;
		//  Truck Ŭ���� Ÿ���� sonata Ŭ������ �������� �ʾ� �ڵ� ��ȯ �ȵ�
	}

}
