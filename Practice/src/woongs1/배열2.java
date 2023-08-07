package woongs1;

import java.util.Scanner;

public class 배열2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.print("정수 10개를 입력하세요 : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.print("짝수는 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
