package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception{
		// throws Exception�� ���ܻ�Ȳ�� ȭ�鿡 �����
		
		int KeyCode;
		
		while(true) {       	//���ѹݺ���
			KeyCode = System.in.read();
			System.out.println("Ű�ڵ� : " + KeyCode);
		}
	}

}
