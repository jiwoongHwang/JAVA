package sec04;

public class 학생 {
	String gender;	//성별
	String code;	//학과코드
	int score;	//시험성적

	public 학생(String gender, String code, int score) {
		this.gender = gender;
		this.code = code;
		this.score = score;
	}

	void start() {
		System.out.println("성별 : " + gender);
		System.out.println("학과코드 : " + code);
		System.out.println("점수 : " + score);
		String grade = end(score);
		System.out.println("등급 : " + grade);
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
