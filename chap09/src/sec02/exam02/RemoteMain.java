package sec02.exam02;

public class RemoteMain {

	public static void main(String[] args) {
		Remote rm = new Remote();
		rm.rc.TurnOn();	//	�͸� ���� ��ü �ʵ� ���
		rm.method1();	//	�͸� ���� ��ü �޼ҵ� ���� ���� ���� ���
		
		//	�Ű������� �͸� ���� ��ü ���
		rm.method2(
				new RemoteControl() {
					
					@Override
					public void TurnOn() {
						System.out.println("����ƮTV�� �մϴ�.");
					}
					
					@Override
					public void TurnOff() {
						System.out.println("����ƮTV�� ���ϴ�.");
					}
				}
				
		);

	}

}
