package test;

import java.util.Scanner;

public class È®ÀÎ¹®Á¦2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Ã¹¹øÂ° ¼ö:");
		int str1 = s.nextInt();
		System.out.println("µÎ¹øÂ° ¼ö:");
		int str2 = s.nextInt();
		int result;

		if (str1 > str2) {
			result = str1 - str2;
			System.out.println("»¬¼À °á°ú: " + result);
		} else {
			result = str1 + str2;
			System.out.println("µ¡¼À °á°ú: " + result);
		}
	}
}
