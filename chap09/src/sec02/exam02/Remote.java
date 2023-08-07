package sec02.exam02;

public class Remote {

	// �͸� ���� ��ü ����
	RemoteControl rc = new RemoteControl() {

		@Override
		public void TurnOn() {
			System.out.println("TV�� �մϴ�.");
		}

		@Override
		public void TurnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
		
	};
	
	//	�޼ҵ� ���� ���� ������ �͸� ���� ��ü ���
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void TurnOn() {
				System.out.println("������� �մϴ�.");
			}

			@Override
			public void TurnOff() {
				System.out.println("������� ���ϴ�.");
			}
			
		};
		
		localVar.TurnOn();
		localVar.TurnOff();
	}
	
	//	�Ű������� �͸�����ü�� ����ϴ� �޼ҵ�
	void method2(RemoteControl rc) {
		rc.TurnOn();
		rc.TurnOff();
	}
}
