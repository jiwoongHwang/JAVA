package sec02.practice;

public class ATM implements Runnable {
	private int depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				notify();
				try {
					wait();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				if (getDepositeMoney() <= 0)
					break;
				withDraw(1000);

			}
		}
	}

	public void withDraw(int howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.printf("잔액 : %,d 원 %n", getDepositeMoney());
		} else {
			System.out.println(Thread.currentThread().getName() + " , ");
			System.out.println("잔액이 부족합니다.");
		}
	}

	public int getDepositeMoney() {
		return depositeMoney;
	}

}
