package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception{
		// throws Exception은 예외상황을 화면에 출력함
		
		int KeyCode;
		
		while(true) {       	//무한반복문
			KeyCode = System.in.read();
			System.out.println("키코드 : " + KeyCode);
		}
	}

}
