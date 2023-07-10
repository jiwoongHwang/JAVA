package sec06;

import java.util.Scanner;

public class StudentExample1 {

	public static void main(String[] args) {
		Student1 st = new Student1();
		Scanner s = new Scanner(System.in);

		boolean run = true;

		while (run) {
			boolean check = st.checkLogin(); // 로그인 점검

			if (check) { // 로그인 되었다면 로그아웃(종료), 성적 입력 처리
				System.out.println("작업을 선택해 주세요");
				System.out.println("1번은 로그아웃, 2번은 성적 입력");
				int choice = s.nextInt();
				if (choice == 1) {
					run = false;
				} else if (choice == 2) {
					st.inputExam(); // 성적 입력 메소드 작성
					run = false;
				}
			} else {
				System.out.println("로그인 실패하였습니다.");
			}
		}
	}
}
