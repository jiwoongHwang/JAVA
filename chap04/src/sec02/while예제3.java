package sec02;

import java.util.Scanner;

public class while예제3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int userNum;
		int comNum = (int) (Math.random() * 20) + 1;

		while (true) {
			System.out.print("숫자 하나를 입력하세요(1~20)");
			userNum = s.nextInt();
			if (userNum == comNum) {
				System.out.println("정답입니다.");
				break;
			} else if (userNum > comNum) {
				System.out.println("낮은숫자입니다.");
			} else {
				System.out.println("높은 숫자입니다.");
			}
		}
	}
}
