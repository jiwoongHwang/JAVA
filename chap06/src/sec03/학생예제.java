package sec03;

public class 학생예제 {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);

		Student s1 = new Student("홍수아", 30);
		System.out.println("이름 : " + s1.name);
		System.out.println("나이 : " + s1.age);

		Student s2 = new Student("홍길동", "20231111", "010-5555-7777");
		System.out.println("이름 : " + s2.name);
		System.out.println("학번 : " + s2.studentNumber);
		System.out.println("연락처 : " + s2.phoneNumber);
	}

}
