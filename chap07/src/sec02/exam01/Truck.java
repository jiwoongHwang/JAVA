package sec02.exam01;

public class Truck extends Car{
	int weight;			// ���� �뷮
	String trunkSize;	// Ʈ��ũ ������ ex) �� , �� , ��
	int maxSpeed;		// �ִ� �ӵ�
	
	// ������ �Ű����� 4��(�θ�2��, �ڱⲨ2��)
	public Truck(String color, String company, int weight, String trunkSize) {
		super(color, company);
		this.weight = weight;
		this.trunkSize = trunkSize;
	}

	//�Ű����� int 1��¥�� ���� �޼ҵ� return Ÿ�� X
	void maxSpeed(int maxSpeed) {
		this.maxSpeed += maxSpeed;
	}

	@Override
	void start() {
		System.out.println("Ʈ���� ����߽��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Ʈ���� ����ϴ�.");
	}
	
	void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
}
