package sec04;

public class MemberServiceExam {

	public static void main(String[] args) {
		MemberService MS = new MemberService();
		boolean result = MS.login("hong" , "12345");
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			MS.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}

}
