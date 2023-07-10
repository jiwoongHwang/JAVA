package sec02;

public class ÁßÃ¸for¿¹Á¦1 {

	public static void main(String[] args) {
		for (int m = 1; m <= 5; m++) {
			for (int n = 1; n <= 5-m; n++) {
				System.out.print(" ");
			}  for (int n = 0; n < m; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
