package sec02.exam03;

public class Tire {

	// ��� �ʵ�
	public int maxRotation; // �ִ� ȸ����
	public int accumulatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾� ��ġ

	// �Ű����� 2�� ������
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	// �޼ҵ� �Ű����� X, ����Ÿ�� boolean
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}

}
