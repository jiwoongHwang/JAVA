package practice;

import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		Grade me = new Grade(math, science, english);

		System.out.println("����� " + me.average());
	}

}

class Grade {
	private int math;
	private int science;
	private int english;

	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public int getScience() {
		return science;
	}

	public int getEnglish() {
		return english;
	}

	public double average() {
		return ((getMath() + getScience() + getEnglish())) / 3;
	}

}
