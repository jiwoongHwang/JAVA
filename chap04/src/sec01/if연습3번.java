package sec01;

import java.util.Scanner;

public class if연습3번 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();
		System.out.println("점수 : " +score);

		
		if (score >= 50) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("재시험을 보세요.");
		}
	}

}
