package woongs1;

import java.util.Scanner;

public class �ݺ�1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		System.out.print("������ �Է��Ͻÿ� >> ");
		num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
