package woongs1;

import java.util.Scanner;

public class �迭2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.print("���� 10���� �Է��ϼ��� : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.print("¦���� : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
