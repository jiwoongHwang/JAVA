package sec04;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.println("가나다");	// 리턴값 X, 내부 호출X
		
		int result1 = myCalc.plus(6, 4);	// 리턴값 O, 내부 호출 X
		System.out.println(result1);
		
		double result2 = myCalc.avg(10, 15);	//리턴값 O, 내부 호출 O
		System.out.println(result2);
		
		myCalc.excute();	//리턴값 X, 내부 호출 3번
	}

}
