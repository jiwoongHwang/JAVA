package sec06;

import java.util.Scanner;

public class StudentExample1 {

	public static void main(String[] args) {
		Student1 st = new Student1();
		Scanner s = new Scanner(System.in);

		boolean run = true;

		while (run) {
			boolean check = st.checkLogin(); // �α��� ����

			if (check) { // �α��� �Ǿ��ٸ� �α׾ƿ�(����), ���� �Է� ó��
				System.out.println("�۾��� ������ �ּ���");
				System.out.println("1���� �α׾ƿ�, 2���� ���� �Է�");
				int choice = s.nextInt();
				if (choice == 1) {
					run = false;
				} else if (choice == 2) {
					st.inputExam(); // ���� �Է� �޼ҵ� �ۼ�
					run = false;
				}
			} else {
				System.out.println("�α��� �����Ͽ����ϴ�.");
			}
		}
	}
}
