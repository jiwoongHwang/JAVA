package sec01.exam02;

public class Student extends People {
	public int studentNo; // �й�

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
