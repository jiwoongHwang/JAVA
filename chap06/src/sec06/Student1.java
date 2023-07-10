package sec06;

import java.util.Scanner;

public class Student1 {
	private String name = "홍길동";
	private String code = "A123";
	private int middleScore;
	private int finalScore;
	private double avg;

	final String id = "admin";
	final int password = 1234;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	

	public int getMiddleScore() {
		return middleScore;
	}

	public void setMiddleScore(int middleScore) {
		this.middleScore = middleScore;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}


	Scanner s = new Scanner(System.in);

	public boolean checkLogin() {
		System.out.println("아이디를 입력해 주세요");
		String id = s.next();
		System.out.println("비밀번호를 입력해 주세요");
		int password = s.nextInt();

		if (id.equals(this.id) && password == this.password) {
			return true;
		} else {
			return false;
		}
	}
	public void inputExam() {
		System.out.println("중간점수 입력");
		setMiddleScore(s.nextInt());
		System.out.println("기말점수 입력");
		setFinalScore(s.nextInt());
		double avg = (double)(getMiddleScore() + getFinalScore()) / 2;
		setAvg(avg);
		System.out.println(getName() + "님의 평균 점수는" + getAvg() + "입니다");
	}
}