package sec02.exam05;

public class PhoneExample {

	public static void main(String[] args) {
		
		Phone p = new SmartPhone();
		System.out.println(p.cost);
		p.powerOn();	// �θ𿡼� ���
		p.ring();	// �������̵����� ���� �ڽĿ��� �����
//		p.videoOn();   �ڽ� Ŭ���� �޼ҵ� ȣ�� �ȵ� 
//		p.PhoneCase="�ϵ����̽�"; �ڽ� Ŭ���� �ʵ� ��� �ȵ�
		
		SmartPhone sp = (SmartPhone)p;
		// �θ� ��ü�� �ڽ� ��ü�� ���� Ÿ�� ��ȯ ��Ŵ
		sp.Phonecase="����Ʈ���̽�";	// �ڽ� ��ü �ʵ� ��� ����
		System.out.println(sp.Phonecase);	// �θ� ��ü �޼ҵ� ��� ����
		sp.powerOn();
		System.out.println(sp.cost);	// ���� �̸��� �ʵ�� �ڽ� ��ü ���
		
		//Phone p2 = new Phone();
		//SmartPhone sp2 = (SmartPhone)p2;
		//�ڽ� Ÿ���� �θ� Ÿ������ ��ȯ���� ���� ���¿���
		//�θ� Ÿ���� �ڽ� Ÿ������ ���� ��ȯ�� ���� ����
	}

}
