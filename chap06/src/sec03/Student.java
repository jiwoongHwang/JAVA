package sec03;

public class Student {
	String name; // 이름
	int age; // 나이
	String studentNumber; // 학번
	String gender; // 성별
	String phoneNumber; // 연락처

	public Student() { // 기본생성자

	}

	public Student(String name, int age) { // 매개변수 2개 생성자
		this.name = name;
		this.age = age;
	}

	public Student(String name, String studentNumber, String phoneNumber) { // 사용자 정의 생성자 호출
		this.name = name;
		this.studentNumber = studentNumber;
		this.phoneNumber = phoneNumber;
	}

}
