package woongs1;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Phone phone[];  
		// Ŭ���� Ÿ���� �迭 ����, ������ ���� �������� ����
		
		System.out.print("�ο��� >> ");
		int num = s.nextInt();
		phone = new Phone[num];
		// �ο����� �޾Ƶ鿩 �� ����ŭ Ŭ���� Ÿ���� �迭 ������
		
		int i;
		// �������� i ������
		
		//�迭�� ���̸�ŭ �ݺ��ؼ� �̸��� ��ȭ��ȣ�� �Է¹޾�
		//�� �迭�� �濡 Phone ��ü�� �����Ͽ� ���� 
		for (i = 0; i < phone.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = s.next();
			String tel = s.next();
			phone[i] = new Phone(name, tel);
		}
		
		System.out.println("����Ǿ����ϴ�...");
		
		while (true) {
			System.out.print("�˻��� �̸� >>");
			String name = s.next();
			for (i = 0; i < num; i++) {
				if (name.equals(phone[i].getName())) {
					System.out.println(name + "�� ��ȣ�� " + phone[i].getTel() + " �Դϴ�.");
					break; // ã�� �����Ͱ� ������ �̸��� ��ȣ�� ��� �� for�� ���� 
				}
			}
			
			if (name.equals("�׸�")) {
				break;  // �׸��� �Է��ϸ� while ����		
			}
			
			if (i == num) {  // ã�� �����Ͱ� ������ ���ٴ� �ȳ��� ���
				System.out.println(name + "�� �����ϴ�.");
			}
		}

	}

}
