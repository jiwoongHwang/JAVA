package sec04;

public class �л� {
	String gender;	//����
	String code;	//�а��ڵ�
	int score;	//���輺��

	public �л�(String gender, String code, int score) {
		this.gender = gender;
		this.code = code;
		this.score = score;
	}

	void start() {
		System.out.println("���� : " + gender);
		System.out.println("�а��ڵ� : " + code);
		System.out.println("���� : " + score);
		String grade = end(score);
		System.out.println("��� : " + grade);
	}

	String end(int score) {
		String grade;
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		return grade;
	}

}
