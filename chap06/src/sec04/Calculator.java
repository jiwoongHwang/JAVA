package sec04;

public class Calculator {
	int plus(int x, int y) { // �հ踦 ���ϴ� �޼ҵ�
		int result = x + y;
		return result;
	}

	double avg(int x, int y) { // ����� ���ϴ� �޼ҵ�
		double sum = plus(x, y); // ��ü ���ο��� �հ� �޼ҵ� ȣ��
		double result = sum / 2;
		return result;
	}

	void excute() {
		double result = avg(7, 10);
		println("������ : " + result);
	}

	void println(String message) {
		System.out.println(message);
	}
}
