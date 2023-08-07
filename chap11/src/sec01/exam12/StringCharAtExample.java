package sec01.exam12;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {
		String names[] = new String[2];
		String codes[] = new String[2];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i <= 1; i++) {
			System.out.println("이름을 입력하세요.");
			names[i] = s.next();
			System.out.println("코드를 입력하세요.");
			codes[i] = s.next();
		}

		for (int i = 0; i <= 1; i++) {
			char grade = codes[i].charAt(0);
			String point = codes[i].substring(1, 3);
			int points = Integer.parseInt(point);
			double multiple = 1.0;

			if (grade == 'A') {
				multiple = 1.2;
			} else if (grade == 'B') {
				multiple = 1.1;
			} else if (grade == 'C') {
				multiple = 1.05;
			}
			double points2 = points * multiple;

			if (points2 >= 90) {
				System.out.println(names[i] + "님은 최우수 등급입니다.");
			} else if (points2 >= 80) {
				System.out.println(names[i] + "님은 우수 등급입니다.");
			} else {
				System.out.println(names[i] + "님은 일반 등급입니다.");
			}
		}
	}

}
