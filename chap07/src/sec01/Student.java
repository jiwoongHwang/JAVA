package sec01;

public class Student extends Human {

	int studentCode; // �й�
	String studentDept; // �а�

	
	Student(int weight, int height, String studentDept) {
		super(weight, height);
		this.studentDept = studentDept;
	}

	void study(String place) {
		System.out.println(place + "���� �����մϴ�.");
	}

	void dressOn() {
		System.out.println("������ �Խ��ϴ�.");
	}
	
	void dressOff() {
		System.out.println("������ �����.");
	}

	@Override
	String eat(String food) {
		String result = food + "�� ���� �Ծ��";
		return result;
	}	
	
}
