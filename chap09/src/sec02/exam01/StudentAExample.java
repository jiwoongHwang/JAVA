package sec02.exam01;

public class StudentAExample {

	public static void main(String[] args) {

		StudentA sta = new StudentA();
		StudentA.StudentB stb = sta.new StudentB();

		stb.name = "��ö��";
		stb.age = 22;
		stb.sleep();

		sta.person.wake();
		sta.method1();

//		method2�� �Ű������� Person Ŭ���� Ÿ���� �Ѱ���� ��
//		�Ű������� �������� ; ������		
		sta.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�.");
				}

				@Override
				void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();
//					�������̵� �ȵ� �޼ҵ带 �ٷ� ȣ�� �ȵǱ� ������
//					�������� �޼ҵ带 ȣ����
				}
				
				
			}
		);
	}

}
