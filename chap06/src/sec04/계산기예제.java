package sec04;

public class ���⿹�� {

	public static void main(String[] args) {
		���� myCalc = new ����();
		myCalc.powerOn();

		int result1 = myCalc.plus(5, 3);
		System.out.println(result1);

		int result2 = myCalc.minus(3, 5);
		System.out.println(result2);

		String result3 = myCalc.mul(5, 3);
		System.out.println(result3);

		String result4 = myCalc.mul(0, 5);
		System.out.println(result4);

		double result5 = myCalc.divide(5, 2);
		System.out.println(result5);

		byte x = 10;
		byte y = 4;
		double result6 = myCalc.divide(5, 2);
		System.out.println(result6);
	}

}
