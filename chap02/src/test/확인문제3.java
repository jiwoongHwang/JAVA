package test;

import java.util.Scanner;

public class Ȯ�ι���3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("ù��° ��:");
		String str1 = s.next();
		System.out.println("�ι�° ��:");
		String str2 = s.next();

		if (str1.equals(str2)) {
			System.out.println("�� ���� ���ƿ�");
		} else {
			System.out.println("�� ���� �޶��");
		}

	}
}
