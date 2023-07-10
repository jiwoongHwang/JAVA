package sec02;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = s.nextInt();

		char grade = (score >= 90) ? '수' : ((score >= 80) ? '우' : '미');
		System.out.println(grade);

	}

}
