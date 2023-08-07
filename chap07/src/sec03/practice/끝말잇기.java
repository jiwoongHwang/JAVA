package sec03.practice;

import java.util.Scanner;

public class 끝말잇기 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String startword = "아버지";
		int i;

		System.out.print("게임에 참가하는 인원은 몇명입니까?");
		int num = s.nextInt();

		boolean run = true;
		while (run) {
			for (i = 1; i <= num; i++) {
				System.out.print("참가자의 이름을 입력하세요.");
				String name = s.next();
			}
			System.out.println("시작하는 단어는 " + startword + "입니다.");
			char laststartword = startword.charAt(2);

			System.out.print("홍수아>>");
			String word = s.next();
			char firstword = word.charAt(0);
			firstword = laststartword;
			int num2 = word.length();
			char lastword = word.charAt(num2 - 1);

			System.out.println("홍길동>>");
			String word2 = s.next();
			char firstword2 = word2.charAt(0);
			lastword = firstword2;
			int num3 = word2.length();
			char lastword2 = word2.charAt(num3 - 1);

			if (lastword == firstword2) {
				run = true;
			} else if (lastword2 == firstword) {
				run = true;
			} else if (lastword != firstword2) {
				System.out.println("길동이 발림");
				run = false;
				break;
			} else {
				System.out.println("수아 발림");
				run = false;
				break;
			}
		}
	}

}
