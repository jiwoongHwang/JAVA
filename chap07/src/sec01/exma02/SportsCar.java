package sec01.exma02;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;

	}

//	@Override
//	pulic void stop() {	//final �޼ҵ� �������̵� �Ұ���
//		System.out.println("������ī�� ����");
//		speed = 0;	
//	}
	
	public void stop(int x) {
		// ���ϰ��̳� �Ű������� �����ϸ� �޼ҵ� �������̵� X
		System.out.println("������ī�� ����");
		speed=0;
	}

}
