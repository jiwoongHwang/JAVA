package sec01.exam05;

public class 타입변환예외 {

	public static void main(String[] args) {

		Animal animal = new Dog();
		Dog dog = (Dog) animal;
		
		Animal animal2 = new Dog();
		Cat cat = (Cat) animal2;
	}

}
