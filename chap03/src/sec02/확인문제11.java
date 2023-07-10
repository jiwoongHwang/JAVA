package sec02;

import java.util.Scanner;

public class 확인문제11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("관리자 접속코드를 입력하세요");
		String code = s.nextLine();
		
		String admin_id = code.substring(0,3);
		int admin_pass = Integer.parseInt(code.substring(3,7));

		System.out.println("아이디 :");
		String name = s.nextLine();

		System.out.println("패스워드 :");
		String strPassword = s.nextLine();
		int password = Integer.parseInt(strPassword);

		if (name.equals(admin_id)) {
			if (password == admin_pass) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
	}

}
