package sec02;

import java.util.Scanner;

public class Ȯ�ι���11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ �����ڵ带 �Է��ϼ���");
		String code = s.nextLine();
		
		String admin_id = code.substring(0,3);
		int admin_pass = Integer.parseInt(code.substring(3,7));

		System.out.println("���̵� :");
		String name = s.nextLine();

		System.out.println("�н����� :");
		String strPassword = s.nextLine();
		int password = Integer.parseInt(strPassword);

		if (name.equals(admin_id)) {
			if (password == admin_pass) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����: �н����尡 Ʋ��");
			}
		} else {
			System.out.println("�α��� ����:���̵� �������� ����");
		}
	}

}
