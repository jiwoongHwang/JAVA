package sec01.practice;

public class SoundableExample {
	private static void printSound(Soundable s) {
		System.out.println(s.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		
		Soundable cat = new Cat();
		System.out.println(cat.sound());
	}
}