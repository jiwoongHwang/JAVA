package sec03;

public class �л����� {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);

		Student s1 = new Student("ȫ����", 30);
		System.out.println("�̸� : " + s1.name);
		System.out.println("���� : " + s1.age);

		Student s2 = new Student("ȫ�浿", "20231111", "010-5555-7777");
		System.out.println("�̸� : " + s2.name);
		System.out.println("�й� : " + s2.studentNumber);
		System.out.println("����ó : " + s2.phoneNumber);
	}

}
