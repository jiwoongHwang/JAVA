package sec02;

public class �迭2 {

	public static void main(String[] args) {

		int[] d = { 50, 80, 90, 70, 60 };
		int sum = 0;
		double avg;

		for (int i = 0; i <= 4; i++) {
			sum += d[i];
		}
		System.out.println("���� : " + sum);
		avg = sum / 5;
		System.out.println("��� : " + avg);

/*		int[] t;
		t = {1,2,3};	*/
		
		int[] s=null;
		s= new int[] {1,2,3};
		
		int[] p = new int[] {1,2,3};
		int[] q = {4,5,6};

	}

}
