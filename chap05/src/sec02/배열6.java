package sec02;

import java.util.Scanner;

public class 배열6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] weather = new String[4];
		weather[0] = "봄";
		weather[1] = "여름";
		weather[2] = "가을";
		weather[3] = "겨울";
		boolean repeat = true;

		while (repeat) {
			System.out.println("좋아하는 계절을 입력하세요");
			System.out.println("봄은 1, 여름은 2, 가을은 3, 겨울은 4");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println(weather[0]);
				repeat = false;
				break;
			case 2:
				System.out.println(weather[1]);
				repeat = false;
				break;
			case 3:
				System.out.println(weather[2]);
				repeat = false;
				break;
			case 4:
				System.out.println(weather[3]);
				repeat = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}

		}

	}

}
