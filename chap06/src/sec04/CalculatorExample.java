package sec04;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.println("������");	// ���ϰ� X, ���� ȣ��X
		
		int result1 = myCalc.plus(6, 4);	// ���ϰ� O, ���� ȣ�� X
		System.out.println(result1);
		
		double result2 = myCalc.avg(10, 15);	//���ϰ� O, ���� ȣ�� O
		System.out.println(result2);
		
		myCalc.excute();	//���ϰ� X, ���� ȣ�� 3��
	}

}
