package sec01.exam07;

public class Sleep extends Thread {
	
	@Override
	public void run() {
		try { Thread.sleep(2000); } catch(Exception e) {}
		System.out.println("잠을잡니다.");
	}
	
}
