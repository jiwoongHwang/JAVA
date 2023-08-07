package sec01.exam15;

import java.util.Scanner;

public class StringIndexOfExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String location = s.next();
		String oldStr = location;
		System.out.println(oldStr);
		String newStr = oldStr.replace("±¤ÁÖ", "±¤ÁÖ±¤¿ª½Ã");
		System.out.println(newStr);
	}

}
