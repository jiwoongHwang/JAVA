package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Truck truck = new Truck("����" , "����" , 3 , "��");
		
		truck.setCost(50000);
		System.out.println(truck.cost);
		
		Car car = truck;	// �ڵ� Ÿ�� ��ȯ
		
		car.speedUp(30);	// �θ� �޼��� ȣ��
		//car.maxSpeed(50);	 
		//Ÿ���� ��ȯ�Ǿ��� ������ �ڽ� �޼ҵ� ȣ�� �Ұ���
		
		car.start();
		// �ڽ� �޼ҵ������� �������̵��߱� ������ ȣ�� ������
		
	}

}
