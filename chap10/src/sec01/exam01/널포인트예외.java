package sec01.exam01;

public class 널포인트예외 {
	
	public static void main(String[] args) {
		String data = null;
		int num = 5;
//		System.out.println(data.toString());
//		실행 예외 발생 : 에러 코드로 확인해야함
//		System.out.println(num.toString());
//		일반 예외 발생 : 프로그래머가 미리 확인 가능함.
		String b = String.valueOf(num);
		System.out.println(b);
		
		String c = Integer.toString(num);
		System.out.println(c);
	}
}
