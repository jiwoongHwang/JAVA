package test;

import java.util.Scanner;

public class Ȯ�ι���2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("ù��° ��:");
		int str1 = s.nextInt();
		System.out.println("�ι�° ��:");
		int str2 = s.nextInt();
		int result;

		if (str1 > str2) {
			result = str1 - str2;
			System.out.println("���� ���: " + result);
		} else {
			result = str1 + str2;
			System.out.println("���� ���: " + result);
		}
	}
}
