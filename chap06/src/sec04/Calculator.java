package sec04;

public class Calculator {
	int plus(int x, int y) { // 합계를 구하는 메소드
		int result = x + y;
		return result;
	}

	double avg(int x, int y) { // 평균을 구하는 메소드
		double sum = plus(x, y); // 객체 내부에서 합계 메소드 호출
		double result = sum / 2;
		return result;
	}

	void excute() {
		double result = avg(7, 10);
		println("실행결과 : " + result);
	}

	void println(String message) {
		System.out.println(message);
	}
}
