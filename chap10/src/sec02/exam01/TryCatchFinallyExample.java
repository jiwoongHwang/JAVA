package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			System.out.println("���� ó�� �Ǿ����ϴ�.");
		}
	}

}
