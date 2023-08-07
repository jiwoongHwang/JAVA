package sec01.exam05;

public class MyclassExample {

	public static void main(String[] args) {
		
		Myclass my1 = new Myclass();
		// 디폴트 생성자 호출 (Television)
		my1.rc.turnOn();
		my1.rc.setVolume(7);
		
		
		Myclass my2 = new Myclass(new Television());
		// 매개변수 1개 생성자 호출
		my2.rc.turnOn();
		my2.rc.setVolume(7);
		
		Myclass my3 = new Myclass(new Audio());
		// 매개변수 1개 생성자 호출
		my3.rc.turnOn();
		my3.rc.setVolume(7);
		
		Myclass my4 = new Myclass();
		my4.methodA();
		// 매개변수가 없는 메소드 호출 (Audio 호출)
		
		Myclass my5 = new Myclass();
		my5.methodB(new Television());
		// 매개변수가 있는 메소드 호출 (Television 호출)
	}

}
