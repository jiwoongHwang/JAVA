package sec02;

import java.util.Scanner;

public class �迭4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�迭 ������ �Է����ּ���");
		int arraynum = s.nextInt();
		int[] num1 = new int[arraynum];

		for (int i = 0; i < arraynum; i++) {
			num1[i] = i + 1;
		}

		int sum = 0;
		double avg = 0;
		for (int j = 0; j < arraynum; j++) {
			sum += num1[j];
			avg = (double) sum / arraynum;
		}
		System.out.println("��հ��� : " + avg + "�Դϴ�.");
	}
}
