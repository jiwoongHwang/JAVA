package sec02.practice;

public class SynchronizedEx {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mother = new Thread(atm, "����");
		Thread son = new Thread(atm, "�Ƶ�");
		mother.start();
		son.start();
	}

}
