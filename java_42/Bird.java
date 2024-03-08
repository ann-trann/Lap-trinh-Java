package java_42;

public class Bird extends Animal{

	public Bird() {
		super("Bird");
	}

	@Override
	public void eat() {
		System.out.println("I'm eating worm");
	}

	@Override
	public void makeSound() {
		System.out.println("Chirp cherp");
	}
	
	
}
