package sec01.exam06;

public class ExitExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i == 50) {
				System.out.println(i);
				System.out.println("ÁßÁö !!");
				System.exit(0);
			} else if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}
