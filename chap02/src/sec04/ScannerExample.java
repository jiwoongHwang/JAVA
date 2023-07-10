package sec04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		String inputData;

		while (true) {
			inputData = s.nextLine();
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			if (inputData.equals("q")) {
				break;
			}

		}
		System.out.println("종료");
	}

}
