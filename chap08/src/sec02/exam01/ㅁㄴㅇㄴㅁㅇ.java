package sec02.exam01;

import java.util.Scanner;

public class けいしいけし {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("舛呪研 脊径馬室推");
		int num = s.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
