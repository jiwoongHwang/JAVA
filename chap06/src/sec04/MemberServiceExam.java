package sec04;

public class MemberServiceExam {

	public static void main(String[] args) {
		MemberService MS = new MemberService();
		boolean result = MS.login("hong" , "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
			MS.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
