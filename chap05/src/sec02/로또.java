package sec02;

public class �ζ� {

	public static void main(String[] args) {

		int num = 0;
		int[] lotto = new int[6];
		boolean[] check = new boolean[46];

		for (int i = 0; i < lotto.length; i++) {
			num = (int) (Math.random() * 45) + 1;
			if (check[num] == false) {
				lotto[i] = num;
				check[num] = true;
			} else {
				i--;
			}
		}

		for (int j = 0; j < lotto.length; j++) {
			System.out.print(lotto[j] + " ");
		}
//		System.out.println("�ζ� ������ �� ���� �Ͻðڽ��ϱ�");
//		int number = s.nextInt();
//		for (int j = 0; j < number; j++) {
//			for (int i = 0; i < 6; i++) {
//
//				lotto[i] = (int) (Math.random() * 45) + 1;
//
//				System.out.print(lotto[i]);
//				System.out.print("/");
//			}
//			System.out.println();
//		}
	}

}
