package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		Animal animal = new Dog();
		animal.sound();
		
		animalSound(new Dog());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
