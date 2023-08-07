package sec01.exam07;

public class WakeUp implements Runnable {

	@Override
	public void run() {
		try { Thread.sleep(1000); } catch(Exception e) {}
		System.out.println("기상합니다.");
	}
	
}
