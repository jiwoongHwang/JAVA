package sec03.exam07;

import java.util.Scanner;

public class ���ڸ��⺻Ÿ�����κ�ȯ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		  System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
	        String str1 = s.next();
	        int a = Integer.parseInt(str1);

	        System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
	        String str2 = s.next();
	        int b = Integer.parseInt(str2);

	        int sum = a + b;
	        System.out.println("�� ���� �հ��" + sum + "�Դϴ�.");
	}

}