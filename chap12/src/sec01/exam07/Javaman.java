package sec01.exam07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Javaman {

	public static void main(String[] args) {
		
		System.out.println("�ڹٸ��� �ϻ�");
		
		try { Thread.sleep(500); } catch(Exception e) {}	
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int dayNext = day + 1;
		System.out.println("������ " + year + "�� " +month + "�� " +day+ "�� �Դϴ�.");
		
			
		Runnable wake = new WakeUp();
		Thread t1 = new Thread(wake);
		t1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try { Thread.sleep(1500); } catch(Exception e) {}
				System.out.println("�����մϴ�.");
			}
		});
		thread2.start();
		
		Thread thread3 = new Sleep(); {
			thread3.start();
		}
		Thread t4 = new Thread(wake);
		t4.start();
		
		Thread thread5 = new Thread(new Runnable() {
			@Override
			public void run() {
				try { Thread.sleep(1500); } catch(Exception e) {}
				System.out.println("�����մϴ�.");
			}
		});
		thread5.start();
		
		Thread thread6 = new Sleep(); {
			thread6.start();
		}
		try { Thread.sleep(3000); } catch(Exception e) {}
		System.out.println("������ " + year + "�� " +month + "�� " +dayNext+ "�� �Դϴ�.");
		}

}
